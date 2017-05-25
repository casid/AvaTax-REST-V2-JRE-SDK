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
 * Information about questions that the local jurisdictions require for each location
 */
public class LocationQuestionModel {


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this location setting type
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this location setting type
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private String question;

    /**
     * Getter for question;
     * This is the prompt for this question
     */
    public String getquestion() {;
        return this.question;;
    }

    /**
     * Setter for question;
     * This is the prompt for this question
     */
    public void setquestion(String value) {;
        this.question = value;;
    }


    private String description;

    /**
     * Getter for description;
     * If additional information is available about the location setting, this contains descriptive text to help
    * you identify the correct value to provide in this setting.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * If additional information is available about the location setting, this contains descriptive text to help
    * you identify the correct value to provide in this setting.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private String regularExpression;

    /**
     * Getter for regularExpression;
     * If available, this regular expression will verify that the input from the user is in the expected format.
     */
    public String getregularExpression() {;
        return this.regularExpression;;
    }

    /**
     * Setter for regularExpression;
     * If available, this regular expression will verify that the input from the user is in the expected format.
     */
    public void setregularExpression(String value) {;
        this.regularExpression = value;;
    }


    private String exampleValue;

    /**
     * Getter for exampleValue;
     * If available, this is an example value that you can demonstrate to the user to show what is expected.
     */
    public String getexampleValue() {;
        return this.exampleValue;;
    }

    /**
     * Setter for exampleValue;
     * If available, this is an example value that you can demonstrate to the user to show what is expected.
     */
    public void setexampleValue(String value) {;
        this.exampleValue = value;;
    }


    private String jurisdictionName;

    /**
     * Getter for jurisdictionName;
     * Indicates which jurisdiction requires this question
     */
    public String getjurisdictionName() {;
        return this.jurisdictionName;;
    }

    /**
     * Setter for jurisdictionName;
     * Indicates which jurisdiction requires this question
     */
    public void setjurisdictionName(String value) {;
        this.jurisdictionName = value;;
    }


    private JurisdictionType? jurisdictionType;

    /**
     * Getter for jurisdictionType;
     * Indicates which type of jurisdiction requires this question
     */
    public JurisdictionType? getjurisdictionType() {;
        return this.jurisdictionType;;
    }

    /**
     * Setter for jurisdictionType;
     * Indicates which type of jurisdiction requires this question
     */
    public void setjurisdictionType(JurisdictionType? value) {;
        this.jurisdictionType = value;;
    }


    private String jurisdictionCountry;

    /**
     * Getter for jurisdictionCountry;
     * Indicates the country that this jurisdiction belongs to
     */
    public String getjurisdictionCountry() {;
        return this.jurisdictionCountry;;
    }

    /**
     * Setter for jurisdictionCountry;
     * Indicates the country that this jurisdiction belongs to
     */
    public void setjurisdictionCountry(String value) {;
        this.jurisdictionCountry = value;;
    }


    private String jurisdictionRegion;

    /**
     * Getter for jurisdictionRegion;
     * Indicates the state, region, or province that this jurisdiction belongs to
     */
    public String getjurisdictionRegion() {;
        return this.jurisdictionRegion;;
    }

    /**
     * Setter for jurisdictionRegion;
     * Indicates the state, region, or province that this jurisdiction belongs to
     */
    public void setjurisdictionRegion(String value) {;
        this.jurisdictionRegion = value;;
    }


    /**
     * Returns a JSON string representation of LocationQuestionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
