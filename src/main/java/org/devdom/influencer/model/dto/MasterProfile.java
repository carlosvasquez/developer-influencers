package org.devdom.influencer.model.dto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos Vasquez Polanco
 */
@Entity
@XmlRootElement
public class MasterProfile implements Serializable {

    private static final long serialVersionUID = 9163605965518075788L;
    @Id
    private String fromId;
    @OneToOne
    private FacebookProfile profile;
    @OneToMany
    private List<Skill> skill;
    @OneToMany
    private List<WorkHistory> work;
    @OneToMany
    private List<EducationHistory> education;

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public FacebookProfile getProfile() {
        return profile;
    }

    public void setProfile(FacebookProfile profile) {
        this.profile = profile;
    }

    public List<Skill> getSkill() {
        return skill;
    }

    public void setSkill(List<Skill> skill) {
        this.skill = skill;
    }

    public List<WorkHistory> getWork() {
        return work;
    }

    public void setWork(List<WorkHistory> work) {
        this.work = work;
    }

    public List<EducationHistory> getEducation() {
        return education;
    }

    public void setEducation(List<EducationHistory> education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "MasterProfile{" + "fromId=" + fromId + ", profile=" + profile + ", skill=" + skill + ", work=" + work + ", education=" + education + '}';
    }

}
