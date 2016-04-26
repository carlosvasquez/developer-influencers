package org.devdom.influencer.model.dto;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Carlos Vásquez
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WorkHistoryTest implements WorkHistoryConstants{
    
    public WorkHistory workHistory = new WorkHistory();

    /**
     * Test of setWorkId method, of class WorkHistory.
     */
    @Test
    public void testStep1SetWorkId() {
        System.out.println("testStep1SetWorkId");
        workHistory.setWorkId(WORK_ID);
    }

    /**
     * Test of setWork method, of class WorkHistory.
     */
    @Test
    public void testStep2SetWork() {
        System.out.println("testStep2SetWork");
        workHistory.setWorkName(WORK);
    }
    
    /**
     * Test of setCategory method, of class WorkHistory.
     */
    @Test
    public void testStep3SetCategory() {
        System.out.println("testStep3SetCategory");
        workHistory.setCategory(CATEGORY);
    }
    
    /**
     * Test of setFromId method, of class WorkHistory.
     */
    @Test
    public void testStep4SetFromId() {
        System.out.println("testStep4SetFromId");
        workHistory.setFromId(FROM_ID);
    }

    /**
     * Test of getWorkId method, of class WorkHistory.
     */
    @Test
    public void testStep5GetWorkId() {
        System.out.println("testStep5GetWorkId");
        assertEquals(WORK_ID, workHistory.getWorkId());
    }
    
    /**
     * Test of getCategory method, of class WorkHistory.
     */
    @Test
    public void testStep6GetCategory() {
        System.out.println("testStep6GetCategory");
        assertEquals(CATEGORY, workHistory.getCategory());
    }

    /**
     * Test of getFromId method, of class WorkHistory.
     */
    @Test
    public void testStep7GetFromId() {
        System.out.println("testStep7GetFromId");
        assertEquals(FROM_ID, workHistory.getFromId());
    }

    /**
     * Test of getWork method, of class WorkHistory.
    */
    @Test
    public void testStep8GetWork() {
        System.out.println("testStep8GetWork");
        assertEquals(WORK, workHistory.getWorkName());
    }
    
    /**
     * Test of toString method, of class WorkHistory.
     */
    @Test
    public void testStep9ToString() {
        System.out.println("testStep9ToString");
        assertTrue( (workHistory.toString() instanceof String) );
    }
    
}