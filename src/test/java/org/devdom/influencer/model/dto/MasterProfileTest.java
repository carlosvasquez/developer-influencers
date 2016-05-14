package org.devdom.influencer.model.dto;

import java.util.ArrayList;
import java.util.List;
import org.devdom.influencer.util.MasterProfileConstants;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class MasterProfileTest {
    
    public static MasterProfile masterProfile = new MasterProfile();
    private String UID = "1";
    private String FROM_ID = "2";
    private String UID_FACEBOOK_PROFILE = "3";    

    @Test
    public void test01SetMasterProfileParameters(){
        
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill(UID));
        
        List<WorkHistory> workHistory = new ArrayList<>();
        
        masterProfile.setProfile(new FacebookProfile(UID_FACEBOOK_PROFILE));
        masterProfile.setFromId(FROM_ID);
        masterProfile.setSkill(skills);
        masterProfile.setWork(workHistory);
    }
    /**
     * Test of getFromId method, of class MasterProfile.
     * /
    @Test
    public void test02GetFromId() {
        System.out.println("getFromId");
        MasterProfile instance = new MasterProfile();
        String expResult = "";
        String result = masterProfile.getFromId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFromId method, of class MasterProfile.
     * /
    @Test
    public void testSetFromId() {
        System.out.println("setFromId");
        String fromId = "";
        MasterProfile instance = new MasterProfile();
        masterProfile.setFromId(fromId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfile method, of class MasterProfile.
     * /
    @Test
    public void testGetProfile() {
        System.out.println("getProfile");
        MasterProfile instance = new MasterProfile();
        FacebookProfile expResult = null;
        FacebookProfile result = masterProfile.getProfile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfile method, of class MasterProfile.
     * /
    @Test
    public void testSetProfile() {
        System.out.println("setProfile");
        FacebookProfile profile = null;
        MasterProfile instance = new MasterProfile();
        masterProfile.setProfile(profile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkill method, of class MasterProfile.
     * /
    @Test
    public void testGetSkill() {
        System.out.println("getSkill");
        MasterProfile instance = new MasterProfile();
        List<Skill> expResult = null;
        List<Skill> result = masterProfile.getSkill();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkill method, of class MasterProfile.
     * /
    @Test
    public void testSetSkill() {
        System.out.println("setSkill");
        List<Skill> skill = null;
        MasterProfile instance = new MasterProfile();
        masterProfile.setSkill(skill);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWork method, of class MasterProfile.
     * /
    @Test
    public void testGetWork() {
        System.out.println("getWork");
        MasterProfile instance = new MasterProfile();
        List<WorkHistory> expResult = null;
        List<WorkHistory> result = masterProfile.getWork();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *  Test of setWork method, of class MasterProfile.
     * /
    @Test
    public void testSetWork() {
        System.out.println("setWork");
        List<WorkHistory> work = null;
        MasterProfile instance = new MasterProfile();
        masterProfile.setWork(work);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEducation method, of class MasterProfile.
     * /
    @Test
    public void testGetEducation() {
        System.out.println("getEducation");
        MasterProfile instance = new MasterProfile();
        List<EducationHistory> expResult = null;
        List<EducationHistory> result = masterProfile.getEducation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEducation method, of class MasterProfile.
     * /
    @Test
    public void testSetEducation() {
        System.out.println("setEducation");
        List<EducationHistory> education = null;
        MasterProfile instance = new MasterProfile();
        masterProfile.setEducation(education);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MasterProfile.
     * /
    @Test
    public void testToString() {
        System.out.println("toString");
        MasterProfile instance = new MasterProfile();
        String expResult = "";
        String result = masterProfile.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
