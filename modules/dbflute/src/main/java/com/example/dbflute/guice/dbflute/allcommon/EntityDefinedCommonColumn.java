package com.example.dbflute.guice.dbflute.allcommon;

import org.seasar.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of registerDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    org.joda.time.LocalDateTime getRegisterDatetime();

    /**
     * Set the value of registerDatetime.
     * @param registerDatetime The instance of the property type. (NullAllowed)
     */
    void setRegisterDatetime(org.joda.time.LocalDateTime registerDatetime);

    /**
     * Get the value of registerUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getRegisterUser();

    /**
     * Set the value of registerUser.
     * @param registerUser The instance of the property type. (NullAllowed)
     */
    void setRegisterUser(String registerUser);

    /**
     * Get the value of updateDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    org.joda.time.LocalDateTime getUpdateDatetime();

    /**
     * Set the value of updateDatetime.
     * @param updateDatetime The instance of the property type. (NullAllowed)
     */
    void setUpdateDatetime(org.joda.time.LocalDateTime updateDatetime);

    /**
     * Get the value of updateUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUpdateUser();

    /**
     * Set the value of updateUser.
     * @param updateUser The instance of the property type. (NullAllowed)
     */
    void setUpdateUser(String updateUser);

    /**
	 * Enable common column auto set up. <br />
	 * It's only for after disable because the default is enabled.
	 */
    void enableCommonColumnAutoSetup();

    /**
	 * Disable common column auto set up. <br />
	 * This is an old style. You can get the same process
	 * by varyingInsert() and varyingUpdate() and so on.
	 */
    void disableCommonColumnAutoSetup();

    /**
	 * Can the entity set up common column by auto? (basically for Framework)
	 * @return The determination, true or false.
	 */
	boolean canCommonColumnAutoSetup();
}
