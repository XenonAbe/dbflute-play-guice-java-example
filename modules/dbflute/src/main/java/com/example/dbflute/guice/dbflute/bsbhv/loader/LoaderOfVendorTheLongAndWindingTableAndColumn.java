package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;
import com.example.dbflute.guice.dbflute.cbean.*;

/**
 * The referrer loader of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE. <br />
 * <pre>
 * [primary key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID
 *
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME, SHORT_NAME, SHORT_SIZE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorTheLongAndWindingTableAndColumnRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorTheLongAndWindingTableAndColumn {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorTheLongAndWindingTableAndColumn> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorTheLongAndWindingTableAndColumnBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorTheLongAndWindingTableAndColumn ready(List<VendorTheLongAndWindingTableAndColumn> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorTheLongAndWindingTableAndColumnBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorTheLongAndWindingTableAndColumnBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorTheLongAndWindingTableAndColumnRef> _referrerVendorTheLongAndWindingTableAndColumnRef;
    public NestedReferrerLoaderGateway<LoaderOfVendorTheLongAndWindingTableAndColumnRef> loadVendorTheLongAndWindingTableAndColumnRef(ReferrerConditionSetupper<VendorTheLongAndWindingTableAndColumnRefCB> setupper) {
        myBhv().loadVendorTheLongAndWindingTableAndColumnRef(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<VendorTheLongAndWindingTableAndColumnRef>() {
            public void handle(List<VendorTheLongAndWindingTableAndColumnRef> referrerList) { _referrerVendorTheLongAndWindingTableAndColumnRef = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendorTheLongAndWindingTableAndColumnRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendorTheLongAndWindingTableAndColumnRef> handler) {
                handler.handle(new LoaderOfVendorTheLongAndWindingTableAndColumnRef().ready(_referrerVendorTheLongAndWindingTableAndColumnRef, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorTheLongAndWindingTableAndColumn> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
