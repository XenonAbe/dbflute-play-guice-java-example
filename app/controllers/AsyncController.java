package controllers;

import app.libs.concurrent.DatabaseExecutionContext;
import dbflute.exbhv.WidgetBhv;
import dbflute.exentity.Widget;
import org.springframework.transaction.annotation.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Singleton
public class AsyncController extends Controller {

    private final DatabaseExecutionContext dbExecutionContext;
    private final WidgetBhv widgetBhv;

    @Inject
    public AsyncController(DatabaseExecutionContext dbExecutionContext, WidgetBhv widgetBhv) {
        this.dbExecutionContext = dbExecutionContext;
        this.widgetBhv = widgetBhv;
    }

    /**
     * 非同期にデータベースアクセスするサンプル
     * データベース処理用のカスタムExecutionContextを使用
     * @see <a href="https://www.playframework.com/documentation/2.6.x/Highlights26#updated-templates-with-preconfigured-customexecutioncontexts">CustomExecutionContext</a>
     */
    public CompletionStage<Result> insert() {
        return CompletableFuture.supplyAsync(() -> {

            insertInternal();

            return ok();
        }, dbExecutionContext.withHttpContext());
    }

    @Transactional
    protected void insertInternal() {
        Widget entity = new Widget();
        entity.setName("Async");
        entity.setPrice(68000);
        widgetBhv.insert(entity);
    }

}
