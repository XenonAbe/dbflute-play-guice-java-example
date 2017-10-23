package app.libs.concurrent;

import akka.actor.ActorSystem;
import play.libs.concurrent.CustomExecutionContext;
import play.libs.concurrent.HttpExecution;
import scala.concurrent.ExecutionContext;
import scala.concurrent.ExecutionContextExecutor;

import javax.inject.Inject;

public class DatabaseExecutionContext extends CustomExecutionContext {

    @Inject
    public DatabaseExecutionContext(ActorSystem actorSystem) {
        super(actorSystem, "database.dispatcher");
    }

    public ExecutionContextExecutor withHttpContext() {
        return HttpExecution.fromThread((ExecutionContext)this);
    }
}
