package org.devdom.influencer.model.dto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class EducationTest {

    private String CONCENTATION = "A";
    private String FROM_ID = "1";
    private String INSTITUTION_ID = "2";
    private String TYPE_ID = "3";

    @Test
    public void testEducationProperties() {
        Education education = new Education(FROM_ID, INSTITUTION_ID);
        education.setConcentration(CONCENTATION);
        education.setType(TYPE_ID);
        
        assertEquals(CONCENTATION, education.getConcentration());
        assertEquals(TYPE_ID, education.getType());
        assertEquals(FROM_ID, education.getFromId());
        assertEquals(INSTITUTION_ID, education.getInstitutionId());
        
        education.setFromId(FROM_ID);
        education.setInstitutionId(INSTITUTION_ID);
        
        assertEquals(FROM_ID, education.getFromId());
        assertEquals(INSTITUTION_ID, education.getInstitutionId());
    }
    
    public void testEducationHashCode() {
        Education education1 = new Education(FROM_ID, INSTITUTION_ID);
        Education education2 = new Education(FROM_ID, INSTITUTION_ID);
        assertEquals(education1.hashCode(), education2.hashCode());
    }
    
}
