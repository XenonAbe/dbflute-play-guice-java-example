package controllers;

import dbflute.exbhv.WidgetBhv;
import dbflute.exentity.Widget;
import models.WidgetItem;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.transaction.annotation.Transactional;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.inject.Singleton;

import static play.libs.Scala.toSeq;

@Singleton
public class WidgetController extends Controller {
    private static final Logger.ALogger logger = Logger.of(WidgetController.class);

    private final FormFactory formFactory;

    private final WidgetBhv widgetBhv;

    @Inject
    public WidgetController(FormFactory formFactory, WidgetBhv widgetBhv) {
        this.formFactory = formFactory;
        this.widgetBhv = widgetBhv;
    }

    public Result listWidgets() {
        final Form<WidgetItem> form = formFactory.form(WidgetItem.class);

        return ok(views.html.listWidgets.render(toSeq(selectWidgetList()), form));
    }

    @Transactional
    public Result createWidget() {
        final Form<WidgetItem> form = formFactory.form(WidgetItem.class).bindFromRequest();

        if (form.hasErrors()) {
            logger.error("errors = {}", form.allErrors());
            return badRequest(views.html.listWidgets.render(toSeq(selectWidgetList()), form));
        }

        WidgetItem item = form.get();

        Widget entity = new Widget();
        entity.setName(item.getName());
        entity.setPrice(item.getPrice());
        widgetBhv.insert(entity);

        flash("info", "Widget added!");
        return redirect(routes.WidgetController.listWidgets());
    }

    private ListResultBean<Widget> selectWidgetList() {
        return widgetBhv.selectList(cb -> {
            cb.query().addOrderBy_Id_Asc();
        });
    }

}
