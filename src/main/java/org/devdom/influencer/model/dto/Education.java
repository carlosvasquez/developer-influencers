package org.devdom.influencer.model.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos Vasquez Polanco
 */
@Entity
@Table(name = "dev_dom_education")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Education.findAll", query = "SELECT e FROM Education e"),
    @NamedQuery(name = "Education.findByFromId", query = "SELECT e FROM Education e WHERE e.fromId = :fromId"),
    @NamedQuery(name = "Education.findByInstitutionId", query = "SELECT e FROM Education e WHERE e.institutionId = :institutionId"),
    @NamedQuery(name = "Education.findByType", query = "SELECT e FROM Education e WHERE e.type = :type"),
    @NamedQuery(name = "Education.findByConcentration", query = "SELECT e FROM Education e WHERE e.concentration = :concentration")})
public class Education implements Serializable {

    private static final long serialVersionUID = 5677685739022698750L;    
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "from_id")
    private String fromId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "institution_id")
    private String institutionId;
    @Size(max = 120)
    @Column(name = "type")
    private String type;
    @Size(max = 600)
    @Column(name = "concentration")
    private String concentration;

    public Education(String fromId, String institutionId) {
        this.fromId = fromId;
        this.institutionId = institutionId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fromId != null ? fromId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Education other = (Education) obj;
        if (!Objects.equals(this.fromId, other.fromId)) {
            return false;
        }
        if (!Objects.equals(this.institutionId, other.institutionId)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.concentration, other.concentration)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Education{" + "fromId=" + fromId + ", institutionId=" + institutionId + ", type=" + type + ", concentration=" + concentration + '}';
    }
    
}
