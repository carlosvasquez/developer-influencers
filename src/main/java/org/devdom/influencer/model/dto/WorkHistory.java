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
 * @author Carlos Vásquez
 */
@Entity
@XmlRootElement
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery( name="WorkHistory.findWorkByUid",
                                procedureName="findWorkByUid",
                                returnsResultSet=true,
                                resultClass=WorkHistory.class,
                                parameters={@StoredProcedureParameter(queryParameter="from_id",
                                                                      name="from_id",
                                                                      direction=Direction.IN,
                                                                      type=String.class)}
                                )
})
public class WorkHistory implements Serializable {

    private static final long serialVersionUID = 7126305115992683492L;
    @Id
    @Column(name = "work_id")
    protected String workId;
    
    @Column(name = "work_name")
    protected String workName;
    
    @Column(name = "category")
    protected String category;
    
    @Column(name = "from_id")
    protected String fromId;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    @Override
    public String toString() {
        return "WorkHistory{" + "workId=" + workId + ", work=" + workName + ", category=" + category + ", fromId=" + fromId + '}';
    }
    
}
