/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SiperProg
 */
@Entity
@Table(name = "DEP_SERV")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DepServ.findAll", query = "SELECT d FROM DepServ d"),
    @NamedQuery(name = "DepServ.findByServId", query = "SELECT d FROM DepServ d WHERE d.depServPK.servId = :servId"),
    @NamedQuery(name = "DepServ.findByDepId", query = "SELECT d FROM DepServ d WHERE d.depServPK.depId = :depId"),
    @NamedQuery(name = "DepServ.findByTipAccion", query = "SELECT d FROM DepServ d WHERE d.tipAccion = :tipAccion")})
public class DepServ implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepServPK depServPK;
    @Column(name = "TIP_ACCION")
    private Character tipAccion;

    public DepServ() {
    }

    public DepServ(DepServPK depServPK) {
        this.depServPK = depServPK;
    }

    public DepServ(long servId, long depId) {
        this.depServPK = new DepServPK(servId, depId);
    }

    public DepServPK getDepServPK() {
        return depServPK;
    }

    public void setDepServPK(DepServPK depServPK) {
        this.depServPK = depServPK;
    }

    public Character getTipAccion() {
        return tipAccion;
    }

    public void setTipAccion(Character tipAccion) {
        this.tipAccion = tipAccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depServPK != null ? depServPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepServ)) {
            return false;
        }
        DepServ other = (DepServ) object;
        if ((this.depServPK == null && other.depServPK != null) || (this.depServPK != null && !this.depServPK.equals(other.depServPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.DepServ[ depServPK=" + depServPK + " ]";
    }
    
}
