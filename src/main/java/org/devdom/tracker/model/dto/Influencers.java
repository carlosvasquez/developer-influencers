package org.devdom.tracker.model.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.annotations.NamedStoredProcedureQueries;
import org.eclipse.persistence.annotations.NamedStoredProcedureQuery;

/**
 *
 * @author Carlos Vásquez Polanco
 */
@Entity
@XmlRootElement
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery( name="Influencers.findTop10DevsInfluents", 
                                procedureName="findTop10DevsInfluents",
                                returnsResultSet=true,
                                resultClass=Influencers.class)
})
public class Influencers  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "position")
    private int position;
    
    @Column(name = "from_id")
    private int fromId;
    
    @Column(name = "full_name")
    private String fullName;
    
    @Column(name = "likes_count")
    private int likesCount;
    
    @Column(name = "messages_count")
    private int messagesCount;
    
    @Column(name = "posts_count")
    private int postsCount;
    
    @Column(name = "ratio")
    private double ratio;

    /**
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * @return the fromId
     */
    public int getFromId() {
        return fromId;
    }

    /**
     * @param fromId the fromId to set
     */
    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the likesCount
     */
    public int getLikesCount() {
        return likesCount;
    }

    /**
     * @param likesCount the likesCount to set
     */
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    /**
     * @return the messagesCount
     */
    public int getMessagesCount() {
        return messagesCount;
    }

    /**
     * @param messagesCount the messagesCount to set
     */
    public void setMessagesCount(int messagesCount) {
        this.messagesCount = messagesCount;
    }

    /**
     * @return the postsCount
     */
    public int getPostsCount() {
        return postsCount;
    }

    /**
     * @param postsCount the postsCount to set
     */
    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    /**
     * @return the ratio
     */
    public double getRatio() {
        return ratio;
    }

    /**
     * @param ratio the ratio to set
     */
    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

}
