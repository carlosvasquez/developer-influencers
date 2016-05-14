package org.devdom.influencer.model.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.annotations.Direction;
import org.eclipse.persistence.annotations.NamedStoredProcedureQueries;
import org.eclipse.persistence.annotations.NamedStoredProcedureQuery;
import org.eclipse.persistence.annotations.StoredProcedureParameter;

/**
 *
 * @author Carlos Vasquez Polanco
 */
@Entity
@XmlRootElement
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery( name="Skill.findSkillsByUid",
                                procedureName="findSkillsByUid",
                                returnsResultSet=true,
                                resultClass=Skill.class,
                                parameters={@StoredProcedureParameter(queryParameter="from_id",
                                                                      name="from_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class)}
                                )
})
public class Skill implements Serializable {

    private static final long serialVersionUID = 1058236012242514460L;
    @Id
    @Column(name = "skill_id")
    String skillId;
    
    @Column(name = "uid")
    String uid;
    
    @Column(name = "skill")
    String name;
    
    @Column(name = "votes")
    int votes;
    
    @Column(name = "category_id")
    String categoryId;
    
    @Column(name = "category")
    String category;
    
    @Column(name = "imagen_icon")
    String imagenIcon;

    Skill(String uid) {
        this.uid = uid;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImagenIcon() {
        return imagenIcon;
    }

    public void setImagenIcon(String imagenIcon) {
        this.imagenIcon = imagenIcon;
    }

    @Override
    public String toString() {
        return "Skill{" + "skillId=" + skillId + ", uid=" + uid + ", name=" + name + ", votes=" + votes + ", categoryId=" + categoryId + ", category=" + category + ", imagenIcon=" + imagenIcon + '}';
    }

}
