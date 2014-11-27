package com.example.dbflute.guice.dbflute.allcommon;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;
import org.seasar.dbflute.bhv.core.InvokerAssistant;
import com.example.dbflute.guice.dbflute.exbhv.*;

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
        return new com.example.dbflute.guice.dbflute.nogen.ExtendedDBFluteInitializer();
    }

    protected ImplementedBehaviorSelector createImplementedBehaviorSelector() {
        return new ImplementedBehaviorSelector();
    }

    protected BehaviorCommandInvoker createBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    protected ImplementedInvokerAssistant createImplementedInvokerAssistant() {
        ImplementedInvokerAssistant invokerAssistant = new com.example.dbflute.guice.dbflute.allcommon.ImplementedInvokerAssistant();
        invokerAssistant.setDataSource(dataSource);
        return invokerAssistant;
    }

    protected ImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return new com.example.dbflute.guice.dbflute.allcommon.ImplementedCommonColumnAutoSetupper();
    }

    protected void setupBehavior(BehaviorCommandInvoker ker, BehaviorSelector tor, CommonColumnAutoSetupper per) {
        {
            MemberBhv bhv = new MemberBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberBhv.class).toInstance(bhv);
        }
        {
            MemberAddressBhv bhv = new MemberAddressBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberAddressBhv.class).toInstance(bhv);
        }
        {
            MemberFollowingBhv bhv = new MemberFollowingBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberFollowingBhv.class).toInstance(bhv);
        }
        {
            MemberLoginBhv bhv = new MemberLoginBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberLoginBhv.class).toInstance(bhv);
        }
        {
            MemberSecurityBhv bhv = new MemberSecurityBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberSecurityBhv.class).toInstance(bhv);
        }
        {
            MemberServiceBhv bhv = new MemberServiceBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberServiceBhv.class).toInstance(bhv);
        }
        {
            MemberStatusBhv bhv = new MemberStatusBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberStatusBhv.class).toInstance(bhv);
        }
        {
            MemberWithdrawalBhv bhv = new MemberWithdrawalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberWithdrawalBhv.class).toInstance(bhv);
        }
        {
            ProductBhv bhv = new ProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductBhv.class).toInstance(bhv);
        }
        {
            ProductCategoryBhv bhv = new ProductCategoryBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductCategoryBhv.class).toInstance(bhv);
        }
        {
            PurchaseBhv bhv = new PurchaseBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(PurchaseBhv.class).toInstance(bhv);
        }
        {
            PurchasePaymentBhv bhv = new PurchasePaymentBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(PurchasePaymentBhv.class).toInstance(bhv);
        }
        {
            RegionBhv bhv = new RegionBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(RegionBhv.class).toInstance(bhv);
        }
        {
            ServiceRankBhv bhv = new ServiceRankBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ServiceRankBhv.class).toInstance(bhv);
        }
        {
            SummaryProductBhv bhv = new SummaryProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(SummaryProductBhv.class).toInstance(bhv);
        }
        {
            SummaryWithdrawalBhv bhv = new SummaryWithdrawalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(SummaryWithdrawalBhv.class).toInstance(bhv);
        }
        {
            Vendor$DollarBhv bhv = new Vendor$DollarBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(Vendor$DollarBhv.class).toInstance(bhv);
        }
        {
            VendorCheckBhv bhv = new VendorCheckBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorCheckBhv.class).toInstance(bhv);
        }
        {
            VendorIdentityOnlyBhv bhv = new VendorIdentityOnlyBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorIdentityOnlyBhv.class).toInstance(bhv);
        }
        {
            VendorPrimaryKeyOnlyBhv bhv = new VendorPrimaryKeyOnlyBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorPrimaryKeyOnlyBhv.class).toInstance(bhv);
        }
        {
            VendorTheLongAndWindingTableAndColumnBhv bhv = new VendorTheLongAndWindingTableAndColumnBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorTheLongAndWindingTableAndColumnBhv.class).toInstance(bhv);
        }
        {
            VendorTheLongAndWindingTableAndColumnRefBhv bhv = new VendorTheLongAndWindingTableAndColumnRefBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorTheLongAndWindingTableAndColumnRefBhv.class).toInstance(bhv);
        }
        {
            WhiteDateTermBhv bhv = new WhiteDateTermBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteDateTermBhv.class).toInstance(bhv);
        }
        {
            WithdrawalReasonBhv bhv = new WithdrawalReasonBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WithdrawalReasonBhv.class).toInstance(bhv);
        }
    }
}
