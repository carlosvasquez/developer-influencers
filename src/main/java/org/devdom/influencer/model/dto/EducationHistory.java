package org.devdom.influencer.model.dto;

import java.io.Serializable;
import java.util.Objects;
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
    @NamedStoredProcedureQuery( name="EducationHistory.findEducationByUid",
                                procedureName="findEducationByUid",
                                returnsResultSet=true,
                                resultClass=EducationHistory.class,
                                parameters={@StoredProcedureParameter(queryParameter="from_id",
                                                                      name="from_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class)}
                                )
})
public class EducationHistory implements Serializable {

    private static final long serialVersionUID = 5306224326824069189L;
    @Id
    @Column(name = "institution_id")
    private String institutionId;
    
    @Column(name = "category")
    private String category;
            
    @Column(name = "institution")
    private String institution;
    
    @Column(name = "type")
    String type;
    
    @Column(name = "from_id")
    String fromId;

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.institutionId);
        hash = 31 * hash + Objects.hashCode(this.category);
        hash = 31 * hash + Objects.hashCode(this.institution);
        hash = 31 * hash + Objects.hashCode(this.type);
        hash = 31 * hash + Objects.hashCode(this.fromId);
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
        final EducationHistory other = (EducationHistory) obj;
        if (!Objects.equals(this.institutionId, other.institutionId)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.institution, other.institution)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.fromId, other.fromId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EducationHistory{" + "institutionId=" + institutionId + ", category=" + category + ", institution=" + institution + ", type=" + type + ", fromId=" + fromId + '}';
    }
    
}
