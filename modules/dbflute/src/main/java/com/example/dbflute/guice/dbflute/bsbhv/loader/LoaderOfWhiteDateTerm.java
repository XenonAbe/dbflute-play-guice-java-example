package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_DATE_TERM as TABLE. <br />
 * <pre>
 * [primary key]
 *     DATE_TERM_ID
 *
 * [column]
 *     DATE_TERM_ID, DATE_TERM_VALUE, BEGIN_DATE, END_DATE
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
public class LoaderOfWhiteDateTerm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteDateTerm> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteDateTermBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteDateTerm ready(List<WhiteDateTerm> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteDateTermBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteDateTermBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteDateTerm> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
