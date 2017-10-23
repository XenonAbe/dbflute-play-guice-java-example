package app.libs.concurrent;

import akka.actor.ActorSystem;
import play.libs.Akka;
import play.libs.HttpExecution;
import scala.concurrent.ExecutionContext;
import scala.concurrent.ExecutionContextExecutor;

import javax.inject.Inject;

public class DatabaseExecutionContext implements ExecutionContextExecutor {
    private final ExecutionContext executionContext;

    public DatabaseExecutionContext() {
        this.executionContext = Akka.system().dispatchers().lookup("database.dispatcher");
    }

    @Override
    public ExecutionContext prepare() {
        return executionContext.prepare();
    }

    @Override
    public void execute(Runnable command) {
        executionContext.execute(command);
    }

    @Override
    public void reportFailure(Throwable cause) {
        executionContext.reportFailure(cause);
    }

    public ExecutionContextExecutor withHttpContext() {
        return HttpExecution.fromThread(this);
    }
}
