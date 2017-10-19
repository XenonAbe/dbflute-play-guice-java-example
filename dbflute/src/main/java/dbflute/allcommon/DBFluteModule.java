package dbflute.allcommon;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;
import org.seasar.dbflute.bhv.core.InvokerAssistant;
import dbflute.exbhv.*;

/**
 * @author DBFlute(AutoGenerator)
 */
public class DBFluteModule extends AbstractModule {

    protected DataSource dataSource;

    public DBFluteModule(DataSource dataSource) {
        if (dataSource == null) {
            String msg = "The argument 'dataSource' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        this.dataSource = dataSource;
    }

    @Override
    protected void configure() {
        createDBFluteInitializer(); // initialized by only a creation

        // The components of DBFlute Runtime.
        ImplementedBehaviorSelector behaviorSelector = createImplementedBehaviorSelector();
        BehaviorCommandInvoker behaviorCommandInvoker = createBehaviorCommandInvoker();
        ImplementedInvokerAssistant invokerAssistant = createImplementedInvokerAssistant();
        behaviorCommandInvoker.setInvokerAssistant(invokerAssistant);
        ImplementedCommonColumnAutoSetupper commonColumnAutoSetupper = createImplementedCommonColumnAutoSetupper();

        bind(BehaviorSelector.class).toInstance(behaviorSelector);
        bind(BehaviorCommandInvoker.class).toInstance(behaviorCommandInvoker);
        bind(InvokerAssistant.class).toInstance(invokerAssistant);
        bind(CommonColumnAutoSetupper.class).toInstance(commonColumnAutoSetupper);

        // The components of Behavior.
        setupBehavior(behaviorCommandInvoker, behaviorSelector, commonColumnAutoSetupper);
    }

    protected DBFluteInitializer createDBFluteInitializer() {
        return new dbflute.allcommon.DBFluteInitializer();
    }

    protected ImplementedBehaviorSelector createImplementedBehaviorSelector() {
        return new ImplementedBehaviorSelector();
    }

    protected BehaviorCommandInvoker createBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    protected ImplementedInvokerAssistant createImplementedInvokerAssistant() {
        ImplementedInvokerAssistant invokerAssistant = new dbflute.allcommon.ImplementedInvokerAssistant();
        invokerAssistant.setDataSource(dataSource);
        return invokerAssistant;
    }

    protected ImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return new dbflute.allcommon.ImplementedCommonColumnAutoSetupper();
    }

    protected void setupBehavior(BehaviorCommandInvoker ker, BehaviorSelector tor, CommonColumnAutoSetupper per) {
        {
            WidgetBhv bhv = new WidgetBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WidgetBhv.class).toInstance(bhv);
        }
    }
}
