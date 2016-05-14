package org.devdom.influencer.model.dto;

import org.devdom.influencer.util.YearStatConstants;
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
public class YearStatTest implements YearStatConstants{
    
    public static YearStat yearStat = new YearStat();

    /**
     * Test of setId method, of class YearStat.
     */
    @Test
    public void testStep01SetId() {
        System.out.println("testStep1SetId");
        yearStat.setId(ID);
    }

    /**
     * Test of setFromId method, of class YearStat.
     */
    @Test
    public void testStep02SetFromId() {
        System.out.println("testStep2SetFromId");
        yearStat.setFromId(FROM_ID);
    }
    
    /**
     * Test of setCurrentRating method, of class YearStat.
     */
    @Test
    public void testStep03SetCurrentRating() {
        System.out.println("testStep3SetCurrentRating");
        yearStat.setCurrentRating(CURRENT_RATING);
    }
    
    /**
     * Test of setPreviousRating method, of class YearStat.
     */
    @Test
    public void testStep04SetPreviousRating() {
        System.out.println("testStep4SetPreviousRating");
        yearStat.setPreviousRating(PREVIOUS_RATING);
    }

    /**
     * Test of setCurrentLikesCount method, of class YearStat.
     */
    @Test
    public void testStep05SetCurrentLikesCount() {
        System.out.println("testStep5SetCurrentLikesCount");
        yearStat.setCurrentLikesCount(CURRENT_LIKES_COUNT);
    }
    
    /**
     * Test of setPreviousCommentsCount method, of class YearStat.
     */
    @Test
    public void testStep06SetPreviousCommentsCount() {
        System.out.println("testStep6SetPreviousCommentsCount");
        yearStat.setPreviousCommentsCount(PREVIOUS_COMMENTS_COUNT); 
    }

    /**
     * Test of setCurrentMentionsCount method, of class YearStat.
     */
    @Test
    public void testStep07SetCurrentMentionsCount() {
        System.out.println("testStep7SetCurrentMentionsCount");
        yearStat.setCurrentMentionsCount(CURRENT_MENTIONS_COUNT); 
    }
    
    /**
     * Test of setPreviousMentionsCount method, of class YearStat.
     */
    @Test
    public void testStep08SetPreviousMentionsCount() {
        System.out.println("testStep8SetPreviousMentionsCount");
        yearStat.setPreviousMentionsCount(PREVIOUS_MENTIONS_COUNT); 
    }

    /**
     * Test of setCurrent_comments_count method, of class YearStat.
     */
    @Test
    public void testStep09SetCurrent_comments_count() {
        System.out.println("testStep9SetCurrent_comments_count");
        yearStat.setCurrent_comments_count(CURRENT_COMMENTS_COUNT); 
    }
    
    /**
     * Test of setPreviousPostsCount method, of class YearStat.
     */
    @Test
    public void testStep10SetPreviousPostsCount() {
        System.out.println("testStep10SetPreviousPostsCount");
        yearStat.setPreviousPostsCount(PREVIOUS_POSTS_COUNT); 
    }

    /**
     * Test of setCurrentPostsCount method, of class YearStat.
     */
    @Test
    public void testStep11SetCurrentPostsCount() {
        System.out.println("testStep11SetCurrentPostsCount");
        yearStat.setCurrentPostsCount(CURRENT_POSTS_COUNT); 
    }
    
    /**
     * Test of setPreviousInteractionsCount method, of class YearStat.
     */
    @Test
    public void testStep12SetPreviousInteractionsCount() {
        System.out.println("testStep12SetPreviousInteractionsCount");
        yearStat.setPreviousInteractionsCount(PREVIOUS_INTERACTIONS_COUNT); 
    }
    
    /**
     * Test of setCurrentInteractionsCount method, of class YearStat.
     */
    @Test
    public void testStep13SetCurrentInteractionsCount() {
        System.out.println("testStep13SetCurrentInteractionsCount");
        yearStat.setCurrentInteractionsCount(CURRENT_INTERACTIONS_COUNT); 
    }
    
    /**
     * Test of setPreviousCommentsLikesCount method, of class YearStat.
     */
    @Test
    public void testStep14SetPreviousCommentsLikesCount() {
        System.out.println("testStep14SetPreviousCommentsLikesCount");
        yearStat.setPreviousCommentsLikesCount(PREVIOUS_COMMENTS_LIKES_COUNT); 
    }

    /**
     * Test of setCurrentCommentsLikesCount method, of class YearStat.
     */
    @Test
    public void testStep15SetCurrentCommentsLikesCount() {
        System.out.println("testStep15SetCurrentCommentsLikesCount");
        yearStat.setCurrentCommentsLikesCount(CURRENT_COMMENTS_LIKES_COUNT); 
    }
    
    /**
     * Test of setPreviousPostsLikesCount method, of class YearStat.
     */
    @Test
    public void testStep16SetPreviousPostsLikesCount() {
        System.out.println("testStep16SetPreviousPostsLikesCount");
        yearStat.setPreviousPostsLikesCount(PREVIOUS_POSTS_LIKES_COUNT);
    }
    
    /**
     * Test of setCurrentPostsLikesCount method, of class YearStat.
     */
    @Test
    public void testStep17SetCurrentPostsLikesCount() {
        System.out.println("testStep17SetCurrentPostsLikesCount");
        yearStat.setCurrentPostsLikesCount(CURRENT_POSTS_LIKES_COUNT);
    }
    
    /**
     * Test of setRankIndicator method, of class YearStat.
     */
    @Test
    public void testStep18SetRankIndicator() {
        System.out.println("testStep18SetRankIndicator");
        yearStat.setRankIndicator(RANK_INDICATOR);
    }
    
    /**
     * Test of setCreatedTime method, of class YearStat.
     */
    @Test
    public void testStep19SetCreatedTime() {
        System.out.println("testStep19SetCreatedTime");
        yearStat.setCreatedTime(CREATED_TIME);
    }
    
    /**
     * Test of setGroupId method, of class YearStat.
     */
    @Test
    public void testStep20SetGroupId() {
        System.out.println("testStep20SetGroupId");
        yearStat.setGroupId(GROUP_ID);
    }
    
    /**
     * Test of setGroupName method, of class YearStat.
     */
    @Test
    public void testStep21SetGroupName() {
        System.out.println("testStep21SetGroupName");
        yearStat.setGroupName(GROUP_NAME);
    }
    
    /**
     * Test of setPreviousMentionsCommentsCount method, of class YearStat.
     */
    @Test
    public void testStep22SetPreviousMentionsCommentsCount() {
        System.out.println("testStep22SetPreviousMentionsCommentsCount");
        yearStat.setPreviousMentionsCommentsCount(PREVIOUS_MENTIONS_COMMENTS_COUNT);
    }
    
    /**
     * Test of setCurrentPosition method, of class YearStat.
     */
    @Test
    public void testStep23SetCurrentPosition() {
        System.out.println("testStep23SetCurrentPosition");
        yearStat.setCurrentPosition(CURRENT_POSITION);
    }
    
    /**
     * Test of setCurrentMentionsCommentsCount method, of class YearStat.
     */
    @Test
    public void testStep24SetCurrentMentionsCommentsCount() {
        System.out.println("testStep24SetCurrentMentionsCommentsCount");
        yearStat.setCurrentMentionsCommentsCount(CURRENT_MENTIONS_COMMENTS_COUNT);
    }
    
    @Test
    public void testStep25SetPreviousMentionsPostsCount() {
        System.out.println("testStep25SetPreviousMentionsPostsCount");
        yearStat.setPreviousMentionsPostsCount(PREVIOUS_MENTIONS_POSTS_COUNT);
    }
    
    @Test
    public void testStep25SetCurrentMentionsPostsCount(){
        System.out.println("testStepsSetCurrentMentionsPostsCount");
        yearStat.setCurrentMentionsPostsCount(CURRENT_MENTIONS_POSTS_COUNT);
    }
    
    @Test
    public void testSet25PreviousPosition(){
        System.out.println("testSetPreviousPosition");
        yearStat.setPreviousPosition(PREVIOUS_POSITION);
    }

    /**
     * Test of getId method, of class YearStat.
     */
    @Test
    public void testStep26GetId() {
        System.out.println("testStep26GetId");
        assertTrue( ID.equals(yearStat.getId()));
    }
    
    /**
     * Test of getFromId method, of class YearStat.
     */
    @Test
    public void testStep27GetFromId() {
        System.out.println("testStep27GetFromId");
        assertEquals(FROM_ID, yearStat.getFromId() );
    }

    /**
     * Test of getCurrentRating method, of class YearStat.
     */
    @Test
    public void testStep28GetCurrentRating() {
        System.out.println("testStep28GetCurrentRating");
        assertEquals(CURRENT_RATING, yearStat.getCurrentRating());
    }

    /**
     * Test of getPreviousRating method, of class YearStat.
     */
    @Test
    public void testStep29GetPreviousRating() {
        System.out.println("testStep29GetPreviousRating");
        assertEquals(PREVIOUS_RATING, yearStat.getPreviousRating());
    }

    /**
     * Test of getCurrentLikesCount method, of class YearStat.
     */
    @Test
    public void testStep30GetCurrentLikesCount() {
        System.out.println("testStep30GetCurrentLikesCount");
        assertEquals(CURRENT_LIKES_COUNT, yearStat.getCurrentLikesCount());
    }

    /**
     * Test of getCurrentPostsLikesCount method, of class YearStat.
     */
    @Test
    public void testStep31GetCurrentPostsLikesCount() {
        System.out.println("testStep31GetCurrentPostsLikesCount");
        assertEquals(CURRENT_POSTS_LIKES_COUNT, yearStat.getCurrentPostsLikesCount());
    }

    /**
     * Test of getPreviousPostsLikesCount method, of class YearStat.
     */
    @Test
    public void testStep32GetPreviousPostsLikesCount() {
        System.out.println("testStep32GetPreviousPostsLikesCount");
        assertEquals(PREVIOUS_POSTS_LIKES_COUNT, yearStat.getPreviousPostsLikesCount()); 
    }

    /**
     * Test of getCurrentCommentsLikesCount method, of class YearStat.
     */
    @Test
    public void testStep33GetCurrentCommentsLikesCount() {
        System.out.println("testStep33GetCurrentCommentsLikesCount");
        assertEquals(CURRENT_COMMENTS_LIKES_COUNT, yearStat.getCurrentCommentsLikesCount());
    }

    /**
     * Test of getPreviousCommentsLikesCount method, of class YearStat.
     */
    @Test
    public void testStep34GetPreviousCommentsLikesCount() {
        System.out.println("testStep34GetPreviousCommentsLikesCount");
        assertEquals(PREVIOUS_COMMENTS_LIKES_COUNT, yearStat.getPreviousCommentsLikesCount());
    }

    /**
     * Test of getCurrentInteractionsCount method, of class YearStat.
     */
    @Test
    public void testStep35GetCurrentInteractionsCount() {
        System.out.println("testStep35GetCurrentInteractionsCount");
        assertEquals(CURRENT_INTERACTIONS_COUNT, yearStat.getCurrentInteractionsCount());
    }

    /**
     * Test of getPreviousInteractionsCount method, of class YearStat.
     */
    @Test
    public void testStep36GetPreviousInteractionsCount() {
        System.out.println("testStep36GetPreviousInteractionsCount");
        assertEquals(PREVIOUS_INTERACTIONS_COUNT, yearStat.getPreviousInteractionsCount()); 
    }

    /**
     * Test of getCurrentPostsCount method, of class YearStat.
     */
    @Test
    public void testStep37GetCurrentPostsCount() {
        System.out.println("testStep37GetCurrentPostsCount");
        assertEquals(CURRENT_POSTS_COUNT, yearStat.getCurrentPostsCount()); 
    }

    /**
     * Test of getPreviousPostsCount method, of class YearStat.
     */
    @Test
    public void testStep38GetPreviousPostsCount() {
        System.out.println("testStep38GetPreviousPostsCount");
        assertEquals(PREVIOUS_POSTS_COUNT, yearStat.getPreviousPostsCount());
    }

    /**
     * Test of getCurrent_comments_count method, of class YearStat.
     */
    @Test
    public void testStep39GetCurrent_comments_count() {
        System.out.println("testStep39GetCurrent_comments_count");
        assertEquals(CURRENT_COMMENTS_COUNT, yearStat.getCurrent_comments_count());
    }

    /**
     * Test of getPreviousCommentsCount method, of class YearStat.
     */
    @Test
    public void testStep40GetPreviousCommentsCount() {
        System.out.println("testStep40GetPreviousCommentsCount");
        assertEquals(PREVIOUS_COMMENTS_COUNT, yearStat.getPreviousCommentsCount());
    }
    
    /**
     * Test of getCurrentMentionsCount method, of class YearStat.
     */
    @Test
    public void testStep41GetCurrentMentionsCount() {
        System.out.println("testStep41GetCurrentMentionsCount");
        assertEquals(CURRENT_MENTIONS_COUNT, yearStat.getCurrentMentionsCount());
    }

    /**
     * Test of getPreviousMentionsCount method, of class YearStat.
     */
    @Test
    public void testStep42GetPreviousMentionsCount() {
        System.out.println("testStep42GetPreviousMentionsCount");
        assertEquals(PREVIOUS_MENTIONS_COUNT, yearStat.getPreviousMentionsCount());
    }

    /**
     * Test of getCurrentMentionsPostsCount method, of class YearStat.
     */
    @Test
    public void testStep43GetCurrentMentionsPostsCount() {
        System.out.println("testStep43GetCurrentMentionsPostsCount");
        assertEquals(CURRENT_MENTIONS_POSTS_COUNT, yearStat.getCurrentMentionsPostsCount() );
    }

    /**
     * Test of getPreviousMentionsPostsCount method, of class YearStat.
     */
    @Test
    public void testStep44GetPreviousMentionsPostsCount() {
        System.out.println("testStep44GetPreviousMentionsPostsCount");
        assertEquals(PREVIOUS_MENTIONS_POSTS_COUNT, yearStat.getPreviousMentionsPostsCount());
    }
   
    /**
     * Test of getCurrentMentionsCommentsCount method, of class YearStat.
     */
    @Test
    public void testStep45GetCurrentMentionsCommentsCount() {
        System.out.println("testStep45GetCurrentMentionsCommentsCount");
        assertEquals(CURRENT_MENTIONS_COMMENTS_COUNT, yearStat.getCurrentMentionsCommentsCount());
    }

    /**
     * Test of getPreviousMentionsCommentsCount method, of class YearStat.
     */
    @Test
    public void testStep46GetPreviousMentionsCommentsCount() {
        System.out.println("testStep46GetPreviousMentionsCommentsCount");
        assertEquals(PREVIOUS_MENTIONS_COMMENTS_COUNT, yearStat.getPreviousMentionsCommentsCount());
    }
    
    /**
     * Test of getCurrentPosition method, of class YearStat.
     */
    @Test
    public void testStep47GetCurrentPosition() {
        System.out.println("testStep47GetCurrentPosition");
        assertEquals(CURRENT_POSITION, yearStat.getCurrentPosition());
    }

    /**
     * Test of getPreviousPosition method, of class YearStat.
     */
    @Test
    public void testStep48GetPreviousPosition() {
        System.out.println("testStep48GetPreviousPosition");
        assertEquals(PREVIOUS_POSITION, yearStat.getPreviousPosition());
    }

    /**
     * Test of getCreatedTime method, of class YearStat.
     */
    @Test
    public void testStep49GetCreatedTime() {
        System.out.println("testStep49GetCreatedTime");
        assertEquals(CREATED_TIME, yearStat.getCreatedTime());
    }

    /**
     * Test of getGroupId method, of class YearStat.
     */
    @Test
    public void testStep50GetGroupId() {
        System.out.println("testStep50GetGroupId");
        assertEquals(GROUP_ID, yearStat.getGroupId());
    }

    /**
     * Test of getGroupName method, of class YearStat.
     */
    @Test
    public void testStep51GetGroupName() {
        System.out.println("testStep51GetGroupName");
        assertEquals(GROUP_NAME, yearStat.getGroupName());
    }

    /**
     * Test of getRankIndicator method, of class YearStat.
     */
    @Test
    public void testStep52GetRankIndicator() {
        System.out.println("testStep52GetRankIndicator");
        assertEquals(RANK_INDICATOR, yearStat.getRankIndicator());
    }

    /**
     * Test of toString method, of class YearStat.
     */
    @Test
    public void testStep53ToString() {
        System.out.println("testStep53ToString");
        assertTrue( yearStat.toString() instanceof String );
    }
    
}
