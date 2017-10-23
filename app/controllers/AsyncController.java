package controllers;

import akka.actor.ActorSystem;
import javax.inject.*;

import akka.actor.Scheduler;
import app.libs.concurrent.DatabaseExecutionContext;
import dbflute.exbhv.WidgetBhv;
import dbflute.exentity.Widget;
import org.springframework.transaction.annotation.Transactional;
import play.Logger;
import play.mvc.*;
import java.util.concurrent.Executor;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

import scala.concurrent.ExecutionContext;
import scala.concurrent.duration.Duration;
import scala.concurrent.ExecutionContextExecutor;

/**
 * This controller contains an action that demonstrates how to write
 * simple asynchronous code in a controller. It uses a timer to
 * asynchronously delay sending a response for 1 second.
 */
@Singleton
public class AsyncController extends Controller {
    private static final Logger.ALogger logger = Logger.of(AsyncController.class);

    private final ActorSystem actorSystem;
    private final ExecutionContextExecutor exec;

    private final DatabaseExecutionContext dbExecutionContext;
    private final WidgetBhv widgetBhv;

    /**
     * @param actorSystem We need the {@link ActorSystem}'s
     * {@link Scheduler} to run code after a delay.
     * @param exec We need a Java {@link Executor} to apply the result
     * of the {@link CompletableFuture} and a Scala
     * {@link ExecutionContext} so we can use the Akka {@link Scheduler}.
     * An {@link ExecutionContextExecutor} implements both interfaces.
     * @param dbExecutionContext
     * @param widgetBhv
     */
    @Inject
    public AsyncController(ActorSystem actorSystem, ExecutionContextExecutor exec, DatabaseExecutionContext dbExecutionContext, WidgetBhv widgetBhv) {
      this.actorSystem = actorSystem;
      this.exec = exec;
      this.dbExecutionContext = dbExecutionContext;
        this.widgetBhv = widgetBhv;
    }

    /**
     * An action that returns a plain text message after a delay
     * of 1 second.
     *
     * The configuration in the <code>routes</code> file means that this method
     * will be called when the application receives a <code>GET</code> request with
     * a path of <code>/message</code>.
     */
    public CompletionStage<Result> message() {
        return getFutureMessage(1, TimeUnit.SECONDS).thenApplyAsync(Results::ok, exec);
    }

    private CompletionStage<String> getFutureMessage(long time, TimeUnit timeUnit) {
        CompletableFuture<String> future = new CompletableFuture<>();
        actorSystem.scheduler().scheduleOnce(
            Duration.create(time, timeUnit),
            () -> future.complete("Hi!"),
            exec
        );
        return future;
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
