package app.db;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.QLog;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionStatus;
import play.Logger;

import javax.sql.DataSource;

/**
 * トランザクションログ出力用 TransactionManager
 * ログの一時中断、ログレベルはQLogと連動する
 * @see QLog
 */
class TransactionManagerWithDBFlute extends TransactionManager {

    TransactionManagerWithDBFlute(DataSource dataSource) {
        super(dataSource);
    }

    protected void log(String message, Object... args) {
        if (!QLogAccessor.isLoggingInHolidayMood()) {
            if (QLogAccessor.isQueryLogLevelInfo()) {
                transactionLogger.info(message, args);
            } else {
                transactionLogger.debug(message, args);
            }
        }
    }

    protected boolean isLogEnabled() {
        if (QLogAccessor.isLoggingInHolidayMood()) {
            return false;
        }
        if (QLogAccessor.isQueryLogLevelInfo()) {
            return transactionLogger.isInfoEnabled();
        } else {
            return transactionLogger.isDebugEnabled();
        }
    }

    private static class QLogAccessor extends QLog {
        public static boolean isQueryLogLevelInfo() {
            return QLog.isQueryLogLevelInfo();
        }
        public static boolean isLoggingInHolidayMood() {
            return QLog.isLoggingInHolidayMood();
        }
    }
}


/**
 * トランザクションログ出力用 TransactionManager
 */
class TransactionManager extends DataSourceTransactionManager {
    static final Logger.ALogger transactionLogger = Logger.of(TransactionManager.class);

    public TransactionManager(DataSource dataSource) {
        super(dataSource);
        logger = new LogWrapper(this, LogFactory.getLog(DataSourceTransactionManager.class));
    }

    @Override
    protected void doBegin(Object transaction, TransactionDefinition definition) {
        super.doBegin(transaction, definition);
        log("Begin with name [{}]: {}", definition.getName(), definition);
    }

    @Override
    protected Object doSuspend(Object transaction) {
        log("Suspend");
        return super.doSuspend(transaction);
    }

    @Override
    protected void doResume(Object transaction, Object suspendedResources) {
        super.doResume(transaction, suspendedResources);
        log("Resume");
    }

    @Override
    protected void doCommit(DefaultTransactionStatus status) {
        super.doCommit(status);
        log("Commit");
    }

    @Override
    protected void doRollback(DefaultTransactionStatus status) {
        super.doRollback(status);
        log("Rollback");
    }

    protected void log(String message, Object... args) {
        transactionLogger.debug(message, args);
    }

    protected boolean isLogEnabled() {
        return transactionLogger.isDebugEnabled();
    }

    /**
     * Savepointまわりのイベントが取得出来ないので
     * 上位ログをキャプチャー&加工して出力
     */
    void onUpperDebugLog(String message) {
        if (isLogEnabled()) {
            String newMessage = null;
            if (StringUtils.contains(message, "to savepoint"))
                newMessage = "Rollback to Savepoint";
            else if (StringUtils.startsWith(message, "Creating nested transaction"))
                newMessage = StringUtils.replace(message, "Creating nested transaction", "Savepoint");

            if (newMessage != null)
                log(newMessage);
        }
    }

    private static class LogWrapper implements Log {
        private final TransactionManager transactionManager;
        private final Log log;

        LogWrapper(TransactionManager transactionManager, Log log) {
            this.transactionManager = transactionManager;
            this.log = log;
        }

        @Override
        public boolean isDebugEnabled() {
            return log.isDebugEnabled() || transactionManager.isLogEnabled();
        }

        @Override
        public boolean isErrorEnabled() {
            return log.isErrorEnabled();
        }

        @Override
        public boolean isFatalEnabled() {
            return log.isFatalEnabled();
        }

        @Override
        public boolean isInfoEnabled() {
            return log.isInfoEnabled();
        }

        @Override
        public boolean isTraceEnabled() {
            return log.isTraceEnabled();
        }

        @Override
        public boolean isWarnEnabled() {
            return log.isWarnEnabled();
        }

        @Override
        public void trace(Object message) {
            log.trace(message);
        }

        @Override
        public void trace(Object message, Throwable t) {
            log.trace(message, t);
        }

        @Override
        public void debug(Object message) {
            if (message instanceof String)
                transactionManager.onUpperDebugLog((String)message);
            log.debug(message);
        }

        @Override
        public void debug(Object message, Throwable t) {
            log.debug(message, t);
        }

        @Override
        public void info(Object message) {
            log.info(message);
        }

        @Override
        public void info(Object message, Throwable t) {
            log.info(message, t);
        }

        @Override
        public void warn(Object message) {
            log.warn(message);
        }

        @Override
        public void warn(Object message, Throwable t) {
            log.warn(message, t);
        }

        @Override
        public void error(Object message) {
            log.error(message);
        }

        @Override
        public void error(Object message, Throwable t) {
            log.error(message, t);
        }

        @Override
        public void fatal(Object message) {
            log.fatal(message);
        }

        @Override
        public void fatal(Object message, Throwable t) {
            log.fatal(message, t);
        }
    }
}
