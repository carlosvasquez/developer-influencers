package org.devdom.influencer.model.dto;

import org.devdom.influencer.util.WorkHistoryConstants;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Carlos Vásquez
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WorkHistoryTest implements WorkHistoryConstants{
    
    public static WorkHistory workHistory = new WorkHistory();

    /**
     * Test of setWorkId method, of class WorkHistory.
     */
    @Test
    public void testStep1SetWorkId() {
        System.out.println("testStep1SetWorkId");
        workHistory.setWorkId(WORK_ID);
        workHistory.setWorkName(WORK);
        workHistory.setCategory(CATEGORY);
        workHistory.setFromId(FROM_ID);
    }

    /**
     * Test of getWorkId method, of class WorkHistory.
     */
    @Test
    public void testStep5GetWorkId() {
        System.out.println("testStep5GetWorkId");
        assertEquals(WORK_ID, workHistory.getWorkId());
        assertEquals(CATEGORY, workHistory.getCategory());
        assertEquals(FROM_ID, workHistory.getFromId());
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