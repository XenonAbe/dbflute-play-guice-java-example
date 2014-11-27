package controllers;

import org.springframework.transaction.annotation.Transactional;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import com.example.dbflute.guice.dbflute.exbhv.MemberBhv;
import com.example.dbflute.guice.dbflute.exentity.Member;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    @Inject
    private MemberBhv memberBhv;

    @Transactional
    public Result test_insert() {
    	Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.setMemberStatusCode_Formalized(); // 正式会員

        // ## Act ##
        memberBhv.insert(member);

        return ok(index.render("New Member Id: " + member.getMemberId()));
    }
}
