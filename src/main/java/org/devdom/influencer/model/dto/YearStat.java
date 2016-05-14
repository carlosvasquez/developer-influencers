package org.devdom.influencer.model.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.annotations.Direction;
import org.eclipse.persistence.annotations.NamedStoredProcedureQueries;
import org.eclipse.persistence.annotations.NamedStoredProcedureQuery;
import org.eclipse.persistence.annotations.StoredProcedureParameter;

/**
 *
 * @author Carlos Vásquez Polanco
 */
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery( name="YearStat.findMonthsStat", 
                                procedureName="findMonthsStat",
                                returnsResultSet=true,
                                resultClass=YearStat.class,
                                parameters={@StoredProcedureParameter(queryParameter="month",
                                                                      name="month",
                                                                      direction=Direction.IN,
                                                                      type=Integer.class),
                                            @StoredProcedureParameter(queryParameter="year",
                                                                      name="year",
                                                                      direction=Direction.IN,
                                                                      type=Integer.class),
                                            @StoredProcedureParameter(queryParameter="group_id",
                                                                      name="group_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class),
                                            @StoredProcedureParameter(queryParameter="from_id",
                                                                      name="from_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class)}
                                ),
    @NamedStoredProcedureQuery( name="YearStat.findTopPositionsInTop", 
                                procedureName="findTopPositionsInTop",
                                returnsResultSet=true,
                                resultClass=YearStat.class,
                                parameters={@StoredProcedureParameter(queryParameter="from_id",
                                                                      name="from_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class)}
                                )
})
@Entity
@XmlRootElement
public class YearStat implements Serializable {

    private static final long serialVersionUID = 2830831567419945148L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "group_id")
    private String groupId;
    @Column(name = "group_name")
    private String groupName;
    @Column(name = "from_id")    
    private String fromId;
    @Column(name = "current_rating")
    private String currentRating;
    @Column(name = "previous_rating")
    private String previousRating;
    @Column(name = "current_likes_count")
    private Integer currentLikesCount;
    @Column(name = "current_posts_likes_count")
    private Integer currentPostsLikesCount;
    @Column(name = "previous_posts_likes_count")
    private Integer previousPostsLikesCount;
    @Column(name = "current_comments_likes_count")
    private Integer currentCommentsLikesCount;
    @Column(name = "previous_comments_likes_count")
    private Integer previousCommentsLikesCount;
    @Column(name = "current_interactions_count")
    private Integer currentInteractionsCount;
    @Column(name = "previous_interactions_count")
    private Integer previousInteractionsCount;
    @Column(name = "current_posts_count")
    private Integer currentPostsCount;
    @Column(name = "previous_posts_count")
    private Integer previousPostsCount;
    @Column(name = "current_comments_count")
    private Integer current_comments_count;
    @Column(name = "previous_comments_count")
    private Integer previousCommentsCount;
    @Column(name = "current_mentions_count")
    private Integer currentMentionsCount;
    @Column(name = "previous_mentions_count")
    private Integer previousMentionsCount;
    @Column(name = "current_mentions_posts_count")
    private Integer currentMentionsPostsCount;
    @Column(name = "previous_mentions_posts_count")
    private Integer previousMentionsPostsCount;
    @Column(name = "current_mentions_comments_count")
    private Integer currentMentionsCommentsCount;
    @Column(name = "previous_mentions_comments_count")
    private Integer previousMentionsCommentsCount;
    @Column(name = "current_position")
    private Integer currentPosition;
    @Column(name = "previous_position")
    private Integer previousPosition;
    @Column(name = "created_time")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdTime;
    @Column(name = "rank_indicator")
    private String rankIndicator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getCurrentRating() {
        return currentRating;
    }

    public void setCurrentRating(String currentRating) {
        this.currentRating = currentRating;
    }

    public String getPreviousRating() {
        return previousRating;
    }

    public void setPreviousRating(String previousRating) {
        this.previousRating = previousRating;
    }

    public Integer getCurrentLikesCount() {
        return currentLikesCount;
    }

    public void setCurrentLikesCount(Integer currentLikesCount) {
        this.currentLikesCount = currentLikesCount;
    }

    public Integer getCurrentPostsLikesCount() {
        return currentPostsLikesCount;
    }

    public void setCurrentPostsLikesCount(Integer currentPostsLikesCount) {
        this.currentPostsLikesCount = currentPostsLikesCount;
    }

    public Integer getPreviousPostsLikesCount() {
        return previousPostsLikesCount;
    }

    public void setPreviousPostsLikesCount(Integer previousPostsLikesCount) {
        this.previousPostsLikesCount = previousPostsLikesCount;
    }

    public Integer getCurrentCommentsLikesCount() {
        return currentCommentsLikesCount;
    }

    public void setCurrentCommentsLikesCount(Integer currentCommentsLikesCount) {
        this.currentCommentsLikesCount = currentCommentsLikesCount;
    }

    public Integer getPreviousCommentsLikesCount() {
        return previousCommentsLikesCount;
    }

    public void setPreviousCommentsLikesCount(Integer previousCommentsLikesCount) {
        this.previousCommentsLikesCount = previousCommentsLikesCount;
    }

    public Integer getCurrentInteractionsCount() {
        return currentInteractionsCount;
    }

    public void setCurrentInteractionsCount(Integer currentInteractionsCount) {
        this.currentInteractionsCount = currentInteractionsCount;
    }

    public Integer getPreviousInteractionsCount() {
        return previousInteractionsCount;
    }

    public void setPreviousInteractionsCount(Integer previousInteractionsCount) {
        this.previousInteractionsCount = previousInteractionsCount;
    }

    public Integer getCurrentPostsCount() {
        return currentPostsCount;
    }

    public void setCurrentPostsCount(Integer currentPostsCount) {
        this.currentPostsCount = currentPostsCount;
    }

    public Integer getPreviousPostsCount() {
        return previousPostsCount;
    }

    public void setPreviousPostsCount(Integer previousPostsCount) {
        this.previousPostsCount = previousPostsCount;
    }

    public Integer getCurrent_comments_count() {
        return current_comments_count;
    }

    public void setCurrent_comments_count(Integer current_comments_count) {
        this.current_comments_count = current_comments_count;
    }

    public Integer getPreviousCommentsCount() {
        return previousCommentsCount;
    }

    public void setPreviousCommentsCount(Integer previousCommentsCount) {
        this.previousCommentsCount = previousCommentsCount;
    }

    public Integer getCurrentMentionsCount() {
        return currentMentionsCount;
    }

    public void setCurrentMentionsCount(Integer currentMentionsCount) {
        this.currentMentionsCount = currentMentionsCount;
    }

    public Integer getPreviousMentionsCount() {
        return previousMentionsCount;
    }

    public void setPreviousMentionsCount(Integer previousMentionsCount) {
        this.previousMentionsCount = previousMentionsCount;
    }

    public Integer getCurrentMentionsPostsCount() {
        return currentMentionsPostsCount;
    }

    public void setCurrentMentionsPostsCount(Integer currentMentionsPostsCount) {
        this.currentMentionsPostsCount = currentMentionsPostsCount;
    }

    public Integer getPreviousMentionsPostsCount() {
        return previousMentionsPostsCount;
    }

    public void setPreviousMentionsPostsCount(Integer previousMentionsPostsCount) {
        this.previousMentionsPostsCount = previousMentionsPostsCount;
    }

    public Integer getCurrentMentionsCommentsCount() {
        return currentMentionsCommentsCount;
    }

    public void setCurrentMentionsCommentsCount(Integer currentMentionsCommentsCount) {
        this.currentMentionsCommentsCount = currentMentionsCommentsCount;
    }

    public Integer getPreviousMentionsCommentsCount() {
        return previousMentionsCommentsCount;
    }

    public void setPreviousMentionsCommentsCount(Integer previousMentionsCommentsCount) {
        this.previousMentionsCommentsCount = previousMentionsCommentsCount;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Integer getPreviousPosition() {
        return previousPosition;
    }

    public void setPreviousPosition(Integer previousPosition) {
        this.previousPosition = previousPosition;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getRankIndicator() {
        return rankIndicator;
    }

    public void setRankIndicator(String rankIndicator) {
        this.rankIndicator = rankIndicator;
    }

    @Override
    public String toString() {
        return "YearStat{" + "id=" + id + ", groupId=" + groupId + ", groupName=" + groupName + ", fromId=" + fromId + ", currentRating=" + currentRating + ", previousRating=" + previousRating + ", currentLikesCount=" + currentLikesCount + ", currentPostsLikesCount=" + currentPostsLikesCount + ", previousPostsLikesCount=" + previousPostsLikesCount + ", currentCommentsLikesCount=" + currentCommentsLikesCount + ", previousCommentsLikesCount=" + previousCommentsLikesCount + ", currentInteractionsCount=" + currentInteractionsCount + ", previousInteractionsCount=" + previousInteractionsCount + ", currentPostsCount=" + currentPostsCount + ", previousPostsCount=" + previousPostsCount + ", current_comments_count=" + current_comments_count + ", previousCommentsCount=" + previousCommentsCount + ", currentMentionsCount=" + currentMentionsCount + ", previousMentionsCount=" + previousMentionsCount + ", currentMentionsPostsCount=" + currentMentionsPostsCount + ", previousMentionsPostsCount=" + previousMentionsPostsCount + ", currentMentionsCommentsCount=" + currentMentionsCommentsCount + ", previousMentionsCommentsCount=" + previousMentionsCommentsCount + ", currentPosition=" + currentPosition + ", previousPosition=" + previousPosition + ", createdTime=" + createdTime + ", rankIndicator=" + rankIndicator + '}';
    }

}
