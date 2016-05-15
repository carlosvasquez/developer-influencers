package org.devdom.influencer.util;

import org.devdom.influencer.model.dto.FacebookProfile;

/**
 *
 * @author Carlos
 */
public class MasterProfileConstants {

    public static final FacebookProfile facebookProfile = makeDummyProfile();
    public static final String FROM_ID = "1";
    public static final String BIRTHDAY = "14/05/1982";
    public static final String CURRENT_LOCATION = "0.0";
    public static final String CURRENT_LOCATION_ID = "0,0";
    public static final String EMAIL = "cvasquezpolanco@gmail.com";
    public static final String FIRST_NAME = "Carlos";
    public static final String LAST_NAME = "Vásquez";
    public static final String PIC_WITH_LOGO = "sample.jpg";
    public static final String SEX = "M";
    public static final String UID = "1";

    public static FacebookProfile makeDummyProfile(){

        FacebookProfile profile = new FacebookProfile();
        profile.setBirthday(BIRTHDAY);
        profile.setCurrentLocation(CURRENT_LOCATION);
        profile.setCurrentLocationId(CURRENT_LOCATION_ID);
        profile.setEmail(EMAIL);
        profile.setFirstName(FIRST_NAME);
        profile.setLastName(LAST_NAME);
        profile.setPicWithLogo(PIC_WITH_LOGO);
        profile.setSex(SEX);
        profile.setUid(UID);
        return profile;
    }

}
