package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;

/**
 * The referrer loader of SUMMARY_WITHDRAWAL as VIEW. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, MAX_PURCHASE_PRICE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSummaryWithdrawal {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SummaryWithdrawal> _selectedList;
    protected BehaviorSelector _selector;
    protected SummaryWithdrawalBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSummaryWithdrawal ready(List<SummaryWithdrawal> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SummaryWithdrawalBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SummaryWithdrawalBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SummaryWithdrawal> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
