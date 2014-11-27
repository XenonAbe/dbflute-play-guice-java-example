package com.example.dbflute.guice.dbflute.exentity;

import com.example.dbflute.guice.dbflute.bsentity.BsPurchase;

/**
 * The entity of PURCHASE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class Purchase extends BsPurchase {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public void xznocheckSetPaymentCompleteFlg(Integer paymentCompleteFlg) {
        __modifiedProperties.addPropertyName("paymentCompleteFlg");
        _paymentCompleteFlg = paymentCompleteFlg;
    }
}
