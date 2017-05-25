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
 * Represents a service or a subscription type.
 */
public class SubscriptionTypeModel {


    private Int32? id;

    /**
     * Getter for id;
     * The unique ID number of this subscription type.
     */
    public Int32? getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this subscription type.
     */
    public void setid(Int32? value) {;
        this.id = value;;
    }


    private String description;

    /**
     * Getter for description;
     * The friendly name of the service this subscription type represents.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * The friendly name of the service this subscription type represents.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    /**
     * Returns a JSON string representation of SubscriptionTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
