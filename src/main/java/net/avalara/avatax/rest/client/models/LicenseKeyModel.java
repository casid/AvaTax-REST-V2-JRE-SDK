package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a license key for this account.
 */
public class LicenseKeyModel {


    private Int32? accountId;

    /**
     * Getter for accountId;
     * The primary key of the account
     */
    public Int32? getaccountId() {;
        return this.accountId;;
    }

    /**
     * Setter for accountId;
     * The primary key of the account
     */
    public void setaccountId(Int32? value) {;
        this.accountId = value;;
    }


    private String privateLicenseKey;

    /**
     * Getter for privateLicenseKey;
     * This is your private license key. You must record this license key for safekeeping.
    * If you lose this key, you must contact the ResetLicenseKey API in order to request a new one.
    * Each account can only have one license key at a time.
     */
    public String getprivateLicenseKey() {;
        return this.privateLicenseKey;;
    }

    /**
     * Setter for privateLicenseKey;
     * This is your private license key. You must record this license key for safekeeping.
    * If you lose this key, you must contact the ResetLicenseKey API in order to request a new one.
    * Each account can only have one license key at a time.
     */
    public void setprivateLicenseKey(String value) {;
        this.privateLicenseKey = value;;
    }


    private String httpRequestHeader;

    /**
     * Getter for httpRequestHeader;
     * If your software allows you to specify the HTTP Authorization header directly, this is the header string you 
    * should use when contacting Avalara to make API calls with this license key.
     */
    public String gethttpRequestHeader() {;
        return this.httpRequestHeader;;
    }

    /**
     * Setter for httpRequestHeader;
     * If your software allows you to specify the HTTP Authorization header directly, this is the header string you 
    * should use when contacting Avalara to make API calls with this license key.
     */
    public void sethttpRequestHeader(String value) {;
        this.httpRequestHeader = value;;
    }


    /**
     * Returns a JSON string representation of LicenseKeyModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
