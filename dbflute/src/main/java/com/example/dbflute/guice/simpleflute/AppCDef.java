package com.example.dbflute.guice.simpleflute;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface AppCDef {

    /** The empty array for no sisters. */
    String[] EMPTY_SISTERS = new String[]{};

    /** The empty map for no sub-items. */
    @SuppressWarnings("unchecked")
    Map<String, Object> EMPTY_SUB_ITEM_MAP = (Map<String, Object>)Collections.EMPTY_MAP;

    /**
     * @return The code of the classification. (NotNull)
     */
    String code();

    /**
     * @return The name of the classification. (NotNull)
     */
    String name();

    /**
     * @return The code of the classification. (NullAllowed: when an alias is not specified in its setting)
     */
    String alias();

    /**
     * @return The map of sub-items. (NotNull, EmptyAllowed, ReadOnly)
     */
    Map<String, Object> subItemMap();

    /**
     * @return The meta of the classification. (NotNull)
     */
    DefMeta meta();

    /**
     * general boolean classification for every flg-column
     */
    public enum Flg implements AppCDef {
        /** Yes: means valid */
        True("1", "Yes", EMPTY_SISTERS)
        ,
        /** No: means invalid */
        False("0", "No", EMPTY_SISTERS)
        ;
        private static final Map<String, Flg> _codeValueMap = new HashMap<String, Flg>();
        static {
            for (Flg value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "value1");
                _subItemMapMap.put(True.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "value1");
                _subItemMapMap.put(False.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private Flg(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public DefMeta meta() { return DefMeta.Flg; }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Flg codeOf(Object code) {
            if (code == null) { return null; } if (code instanceof Flg) { return (Flg)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static Flg nameOf(String name) { // null allowed
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<Flg> listAll() {
            return new ArrayList<Flg>(Arrays.asList(values()));
        }

        @Override public String toString() { return code(); }
    }

    /**
     * status of member from entry to withdrawal
     */
    public enum MemberStatus implements AppCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", EMPTY_SISTERS)
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", EMPTY_SISTERS)
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", EMPTY_SISTERS)
        ;
        private static final Map<String, MemberStatus> _codeValueMap = new HashMap<String, MemberStatus>();
        static {
            for (MemberStatus value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "1");
                subItemMap.put("key2", "as formal member, allowed to use all service");
                _subItemMapMap.put(Formalized.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "2");
                subItemMap.put("key2", "withdrawal is fixed, not allowed to use service");
                _subItemMapMap.put(Withdrawal.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "3");
                subItemMap.put("key2", "first status after entry, allowed to use only part of service");
                _subItemMapMap.put(Provisional.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private MemberStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public DefMeta meta() { return DefMeta.MemberStatus; }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus codeOf(Object code) {
            if (code == null) { return null; } if (code instanceof MemberStatus) { return (MemberStatus)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus nameOf(String name) { // null allowed
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<MemberStatus> listAll() {
            return new ArrayList<MemberStatus>(Arrays.asList(values()));
        }

        @Override public String toString() { return code(); }
    }

    /**
     * rank of service member gets
     */
    public enum ServiceRank implements AppCDef {
        /** PLATINUM: platinum rank */
        Platinum("PLT", "PLATINUM", EMPTY_SISTERS)
        ,
        /** GOLD: gold rank */
        Gold("GLD", "GOLD", EMPTY_SISTERS)
        ,
        /** SILVER: silver rank */
        Silver("SIL", "SILVER", EMPTY_SISTERS)
        ,
        /** BRONZE: bronze rank */
        Bronze("BRZ", "BRONZE", EMPTY_SISTERS)
        ,
        /** PLASTIC: plastic rank */
        Plastic("PLS", "PLASTIC", EMPTY_SISTERS)
        ;
        private static final Map<String, ServiceRank> _codeValueMap = new HashMap<String, ServiceRank>();
        static {
            for (ServiceRank value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private ServiceRank(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public DefMeta meta() { return DefMeta.ServiceRank; }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ServiceRank codeOf(Object code) {
            if (code == null) { return null; } if (code instanceof ServiceRank) { return (ServiceRank)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static ServiceRank nameOf(String name) { // null allowed
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<ServiceRank> listAll() {
            return new ArrayList<ServiceRank>(Arrays.asList(values()));
        }

        @Override public String toString() { return code(); }
    }

    /**
     * mainly region of member address
     */
    public enum Region implements AppCDef {
        /** AMERICA */
        America("1", "AMERICA", EMPTY_SISTERS)
        ,
        /** CANADA */
        Canada("2", "CANADA", EMPTY_SISTERS)
        ,
        /** CHINA */
        China("3", "CHINA", EMPTY_SISTERS)
        ,
        /** CHIBA */
        Chiba("4", "CHIBA", EMPTY_SISTERS)
        ;
        private static final Map<String, Region> _codeValueMap = new HashMap<String, Region>();
        static {
            for (Region value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private Region(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public DefMeta meta() { return DefMeta.Region; }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Region codeOf(Object code) {
            if (code == null) { return null; } if (code instanceof Region) { return (Region)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static Region nameOf(String name) { // null allowed
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<Region> listAll() {
            return new ArrayList<Region>(Arrays.asList(values()));
        }

        @Override public String toString() { return code(); }
    }

    /**
     * reason for member withdrawal
     */
    public enum WithdrawalReason implements AppCDef {
        /** SIT: サイトが使いにくいから */
        Sit("SIT", "SIT", EMPTY_SISTERS)
        ,
        /** PRD: 商品に魅力がないから */
        Prd("PRD", "PRD", EMPTY_SISTERS)
        ,
        /** FRT: フリテンだから */
        Frt("FRT", "FRT", EMPTY_SISTERS)
        ,
        /** OTH: その他理由 */
        Oth("OTH", "OTH", EMPTY_SISTERS)
        ;
        private static final Map<String, WithdrawalReason> _codeValueMap = new HashMap<String, WithdrawalReason>();
        static {
            for (WithdrawalReason value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private WithdrawalReason(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public DefMeta meta() { return DefMeta.WithdrawalReason; }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static WithdrawalReason codeOf(Object code) {
            if (code == null) { return null; } if (code instanceof WithdrawalReason) { return (WithdrawalReason)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static WithdrawalReason nameOf(String name) { // null allowed
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<WithdrawalReason> listAll() {
            return new ArrayList<WithdrawalReason>(Arrays.asList(values()));
        }

        @Override public String toString() { return code(); }
    }

    /**
     * category of product. self reference
     */
    public enum ProductCategory implements AppCDef {
        /** 音楽 */
        音楽("MSC", "音楽", EMPTY_SISTERS)
        ,
        /** 食品 */
        食品("FOD", "食品", EMPTY_SISTERS)
        ,
        /** ハーブ: of 食品 */
        ハーブ("HEB", "ハーブ", EMPTY_SISTERS)
        ,
        /** 音楽CD: of 音楽 */
        音楽cd("MCD", "音楽CD", EMPTY_SISTERS)
        ,
        /** 楽器: of 音楽 */
        楽器("INS", "楽器", EMPTY_SISTERS)
        ;
        private static final Map<String, ProductCategory> _codeValueMap = new HashMap<String, ProductCategory>();
        static {
            for (ProductCategory value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private ProductCategory(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public DefMeta meta() { return DefMeta.ProductCategory; }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ProductCategory codeOf(Object code) {
            if (code == null) { return null; } if (code instanceof ProductCategory) { return (ProductCategory)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static ProductCategory nameOf(String name) { // null allowed
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<ProductCategory> listAll() {
            return new ArrayList<ProductCategory>(Arrays.asList(values()));
        }

        @Override public String toString() { return code(); }
    }

    /**
     * status for product
     */
    public enum ProductStatus implements AppCDef {
        /** 生産販売可能 */
        生産販売可能("ONS", "生産販売可能", EMPTY_SISTERS)
        ,
        /** 生産中止 */
        生産中止("PST", "生産中止", EMPTY_SISTERS)
        ,
        /** 販売中止 */
        販売中止("SST", "販売中止", EMPTY_SISTERS)
        ;
        private static final Map<String, ProductStatus> _codeValueMap = new HashMap<String, ProductStatus>();
        static {
            for (ProductStatus value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private ProductStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public DefMeta meta() { return DefMeta.ProductStatus; }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ProductStatus codeOf(Object code) {
            if (code == null) { return null; } if (code instanceof ProductStatus) { return (ProductStatus)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static ProductStatus nameOf(String name) { // null allowed
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<ProductStatus> listAll() {
            return new ArrayList<ProductStatus>(Arrays.asList(values()));
        }

        @Override public String toString() { return code(); }
    }

    /**
     * method of payment for purchase
     */
    public enum PaymentMethod implements AppCDef {
        /** by hand: payment by hand, face-to-face */
        ByHand("HAN", "by hand", EMPTY_SISTERS)
        ,
        /** bank transfer: bank transfer payment */
        BankTransfer("BAK", "bank transfer", EMPTY_SISTERS)
        ,
        /** credit card: credit card payment */
        CreditCard("CRC", "credit card", EMPTY_SISTERS)
        ;
        private static final Map<String, PaymentMethod> _codeValueMap = new HashMap<String, PaymentMethod>();
        static {
            for (PaymentMethod value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private PaymentMethod(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public DefMeta meta() { return DefMeta.PaymentMethod; }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static PaymentMethod codeOf(Object code) {
            if (code == null) { return null; } if (code instanceof PaymentMethod) { return (PaymentMethod)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static PaymentMethod nameOf(String name) { // null allowed
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<PaymentMethod> listAll() {
            return new ArrayList<PaymentMethod>(Arrays.asList(values()));
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta {
        /** general boolean classification for every flg-column */
        Flg
        ,
        /** status of member from entry to withdrawal */
        MemberStatus
        ,
        /** rank of service member gets */
        ServiceRank
        ,
        /** mainly region of member address */
        Region
        ,
        /** reason for member withdrawal */
        WithdrawalReason
        ,
        /** category of product. self reference */
        ProductCategory
        ,
        /** status for product */
        ProductStatus
        ,
        /** method of payment for purchase */
        PaymentMethod
        ;

        /**
         * Get classification by the code.
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the classification. (NullAllowed: when not found and code is null)
         */
        public AppCDef codeOf(Object code) {
            if ("Flg".equals(name())) { return AppCDef.Flg.codeOf(code); }
            if ("MemberStatus".equals(name())) { return AppCDef.MemberStatus.codeOf(code); }
            if ("ServiceRank".equals(name())) { return AppCDef.ServiceRank.codeOf(code); }
            if ("Region".equals(name())) { return AppCDef.Region.codeOf(code); }
            if ("WithdrawalReason".equals(name())) { return AppCDef.WithdrawalReason.codeOf(code); }
            if ("ProductCategory".equals(name())) { return AppCDef.ProductCategory.codeOf(code); }
            if ("ProductStatus".equals(name())) { return AppCDef.ProductStatus.codeOf(code); }
            if ("PaymentMethod".equals(name())) { return AppCDef.PaymentMethod.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        /**
         * Get classification by the name.
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the classification. (NullAllowed: when not found and name is null)
         */
        public AppCDef nameOf(String name) {
            if ("Flg".equals(name())) { return AppCDef.Flg.valueOf(name); }
            if ("MemberStatus".equals(name())) { return AppCDef.MemberStatus.valueOf(name); }
            if ("ServiceRank".equals(name())) { return AppCDef.ServiceRank.valueOf(name); }
            if ("Region".equals(name())) { return AppCDef.Region.valueOf(name); }
            if ("WithdrawalReason".equals(name())) { return AppCDef.WithdrawalReason.valueOf(name); }
            if ("ProductCategory".equals(name())) { return AppCDef.ProductCategory.valueOf(name); }
            if ("ProductStatus".equals(name())) { return AppCDef.ProductStatus.valueOf(name); }
            if ("PaymentMethod".equals(name())) { return AppCDef.PaymentMethod.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of classification elements. (NotNull)
         */
        public List<AppCDef> listAll() {
            if ("Flg".equals(name())) { return toClassificationList(AppCDef.Flg.listAll()); }
            if ("MemberStatus".equals(name())) { return toClassificationList(AppCDef.MemberStatus.listAll()); }
            if ("ServiceRank".equals(name())) { return toClassificationList(AppCDef.ServiceRank.listAll()); }
            if ("Region".equals(name())) { return toClassificationList(AppCDef.Region.listAll()); }
            if ("WithdrawalReason".equals(name())) { return toClassificationList(AppCDef.WithdrawalReason.listAll()); }
            if ("ProductCategory".equals(name())) { return toClassificationList(AppCDef.ProductCategory.listAll()); }
            if ("ProductStatus".equals(name())) { return toClassificationList(AppCDef.ProductStatus.listAll()); }
            if ("PaymentMethod".equals(name())) { return toClassificationList(AppCDef.PaymentMethod.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<AppCDef> toClassificationList(List<?> clsList) {
            return (List<AppCDef>)clsList;
        }
    }
}
