package org.devdom.influencer.model.dto;

import java.io.Serializable;
import java.text.DecimalFormat;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.annotations.Direction;
import org.eclipse.persistence.annotations.NamedStoredProcedureQueries;
import org.eclipse.persistence.annotations.NamedStoredProcedureQuery;
import org.eclipse.persistence.annotations.StoredProcedureParameter;

/**
 *
 * @author Carlos Vásquez Polanco
 */
@Entity
@Table(name = "fb_groups")
@XmlRootElement
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
    @NamedQuery(name = "GroupInformation.findAll", 
                query = "SELECT g FROM GroupInformation g"),
    @NamedQuery(name = "GroupInformation.findByGroupId", 
                query = "SELECT g FROM GroupInformation g WHERE g.groupId = :group_id")
})
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery( name="GroupInformation.updTopInfluencers",
                                procedureName="updTopInfluencers",
                                returnsResultSet=true,
                                resultClass=GroupInformation.class,
                                parameters={@StoredProcedureParameter(queryParameter="group_id",
                                                                      name="group_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class),
                                            @StoredProcedureParameter(queryParameter="min_interaction",
                                                                      name="min_interaction",
                                                                      direction=Direction.IN,
                                                                      type=Integer.class)}
                                ),
    @NamedStoredProcedureQuery( name="GroupInformation.updTablesInformationYear",
                                procedureName="updTablesInformationYear",
                                returnsResultSet=true,
                                resultClass=GroupInformation.class
                               ),
    @NamedStoredProcedureQuery( name="GroupInformation.findGroupActivityByGroupId",
                                procedureName="findGroupActivityByGroupId",
                                returnsResultSet=true,
                                resultClass=GroupInformation.class,
                                parameters={@StoredProcedureParameter(queryParameter="group_id",
                                                                      name="group_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class
                                                                      )}
                                ),
    @NamedStoredProcedureQuery( name="GroupInformation.updTopInfluencers_monthBatch",
                                procedureName="updTopInfluencers_monthBatch",
                                returnsResultSet=true,
                                resultClass=GroupInformation.class,
                                parameters={@StoredProcedureParameter(queryParameter="group_id",
                                                                      name="group_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class
                                                                      )}
                                ),
    @NamedStoredProcedureQuery( name="GroupInformation.updTopInfluencers_year",
                                procedureName="updTopInfluencers_year",
                                returnsResultSet=true,
                                resultClass=GroupInformation.class,
                                parameters={@StoredProcedureParameter(queryParameter="in_group_id",
                                                                      name="in_group_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class
                                                                      ),
                                            @StoredProcedureParameter(queryParameter="in_min_interactions",
                                                                      name="in_min_interactions",
                                                                      direction=Direction.IN,
                                                                      type=Integer.class),
                                            @StoredProcedureParameter(queryParameter="in_interval_month",
                                                                      name="in_interval_month",
                                                                      direction=Direction.IN,
                                                                      type=Integer.class)
                                }
                                ),
    @NamedStoredProcedureQuery( name="GroupInformation.updTopInfluencers_day",
                                procedureName="updTopInfluencers_day",
                                returnsResultSet=true,
                                resultClass=GroupInformation.class,
                                parameters={@StoredProcedureParameter(queryParameter="min_interactions",
                                                                      name="min_interactions",
                                                                      direction=Direction.IN,
                                                                      type=Integer.class),
                                            @StoredProcedureParameter(queryParameter="day_of_year",
                                                                      name="day_of_year",
                                                                      direction=Direction.IN,
                                                                      type=Integer.class),
                                            @StoredProcedureParameter(queryParameter="in_year",
                                                                      name="in_year",
                                                                      direction=Direction.IN,
                                                                      type=Integer.class),
                                            @StoredProcedureParameter(queryParameter="group_id",
                                                                      name="group_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class
                                                                      )
                                }
                                )
})
public class GroupInformation implements Serializable{

    private static final long serialVersionUID = -5627702548138785477L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "post_amount")
    private int postAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "comments_amount")
    private int commentsAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_interactions")
    private int minInteractions;
    @Column(name = "active_members_in_year")
    private int activeMembersInYear;
    @Column(name = "created_time_from")
    private String createdTimeFrom;
    @Column(name = "created_time_to")
    private String createdTimeTo;
    @Column(name = "post_per_day")
    private int postPerDay;
    @Column(name = "comments_per_day")
    private int commentsPerDay;
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "fb_id")
    private String groupId;
    @Column(name = "name")
    private String groupName;

    /**
     * @return the groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param groupId the groupId to set
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return the postAmount
     */
    public String getPostAmount() {
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        return df.format(Long.valueOf(postAmount));
    }

    /**
     * @param postAmount the postAmount to set
     */
    public void setPostAmount(int postAmount) {
        this.postAmount = postAmount;
    }

    /**
     * @return the commentsAmount
     */
    public String getCommentsAmount() {
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        return df.format(Long.valueOf(commentsAmount));
    }

    /**
     * @param commentsAmount the commentsAmount to set
     */
    public void setCommentsAmount(int commentsAmount) {
        this.commentsAmount = commentsAmount;
    }

    /**
     * @return the minInteractions
     */
    public int getMinInteractions() {
        return minInteractions;
    }

    /**
     * @param minInteractions the minInteractions to set
     */
    public void setMinInteractions(int minInteractions) {
        this.minInteractions = minInteractions;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the activeMembersInYear
     */
    public int getActiveMembersInYear() {
        return activeMembersInYear;
    }

    /**
     * @param activeMembersInYear the activeMembersInYear to set
     */
    public void setActiveMembersInYear(int activeMembersInYear) {
        this.activeMembersInYear = activeMembersInYear;
    }

    /**
     * @return the postPerDay
     */
    public int getPostPerDay() {
        return postPerDay;
    }

    /**
     * @param postPerDay the postPerDay to set
     */
    public void setPostPerDay(int postPerDay) {
        this.postPerDay = postPerDay;
    }

    /**
     * @return the commentsPerDay
     */
    public int getCommentsPerDay() {
        return commentsPerDay;
    }

    /**
     * @param commentsPerDay the commentsPerDay to set
     */
    public void setCommentsPerDay(int commentsPerDay) {
        this.commentsPerDay = commentsPerDay;
    }

    /**
     * @return the createdTimeFrom
     */
    public String getCreatedTimeFrom() {
        return createdTimeFrom;
    }

    /**
     * @param createdTimeFrom the createdTimeFrom to set
     */
    public void setCreatedTimeFrom(String createdTimeFrom) {
        this.createdTimeFrom = createdTimeFrom;
    }

    /**
     * @return the createdTimeTo
     */
    public String getCreatedTimeTo() {
        return createdTimeTo;
    }

    /**
     * @param createdTimeTo the createdTimeTo to set
     */
    public void setCreatedTimeTo(String createdTimeTo) {
        this.createdTimeTo = createdTimeTo;
    }

    public GroupInformation() {
    }
}