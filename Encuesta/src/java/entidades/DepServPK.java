/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author SiperProg
 */
@Embeddable
public class DepServPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERV_ID")
    private long servId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEP_ID")
    private long depId;

    public DepServPK() {
    }

    public DepServPK(long servId, long depId) {
        this.servId = servId;
        this.depId = depId;
    }

    public long getServId() {
        return servId;
    }

    public void setServId(long servId) {
        this.servId = servId;
    }

    public long getDepId() {
        return depId;
    }

    public void setDepId(long depId) {
        this.depId = depId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) servId;
        hash += (int) depId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepServPK)) {
            return false;
        }
        DepServPK other = (DepServPK) object;
        if (this.servId != other.servId) {
            return false;
        }
        if (this.depId != other.depId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.DepServPK[ servId=" + servId + ", depId=" + depId + " ]";
    }
    
}
