package dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dbflute.exbhv.*;
import dbflute.exentity.*;

/**
 * The referrer loader of WIDGET as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, NAME, PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     VERSION_NO
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
public class LoaderOfWidget {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Widget> _selectedList;
    protected BehaviorSelector _selector;
    protected WidgetBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWidget ready(List<Widget> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WidgetBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WidgetBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Widget> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
