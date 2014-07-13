/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
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
 * @author SiperProg
 */
@Entity
@Table(name = "REPARTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reparto.findAll", query = "SELECT r FROM Reparto r"),
    @NamedQuery(name = "Reparto.findByRepaCodigo2", query = "SELECT r FROM Reparto r WHERE r.repaCodigo2 = :repaCodigo2"),
    @NamedQuery(name = "Reparto.findByRepRepaCodigo2", query = "SELECT r FROM Reparto r WHERE r.repRepaCodigo2 = :repRepaCodigo2"),
    @NamedQuery(name = "Reparto.findByRepaDenominacion", query = "SELECT r FROM Reparto r WHERE r.repaDenominacion = :repaDenominacion"),
    @NamedQuery(name = "Reparto.findByRepaActi", query = "SELECT r FROM Reparto r WHERE r.repaActi = :repaActi")})
public class Reparto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "REPA_CODIGO2")
    private String repaCodigo2;
    @Size(max = 6)
    @Column(name = "REP_REPA_CODIGO2")
    private String repRepaCodigo2;
    @Size(max = 50)
    @Column(name = "REPA_DENOMINACION")
    private String repaDenominacion;
    @Column(name = "REPA_ACTI")
    private Boolean repaActi;

    public Reparto() {
    }

    public Reparto(String repaCodigo2) {
        this.repaCodigo2 = repaCodigo2;
    }

    public String getRepaCodigo2() {
        return repaCodigo2;
    }

    public void setRepaCodigo2(String repaCodigo2) {
        this.repaCodigo2 = repaCodigo2;
    }

    public String getRepRepaCodigo2() {
        return repRepaCodigo2;
    }

    public void setRepRepaCodigo2(String repRepaCodigo2) {
        this.repRepaCodigo2 = repRepaCodigo2;
    }

    public String getRepaDenominacion() {
        return repaDenominacion;
    }

    public void setRepaDenominacion(String repaDenominacion) {
        this.repaDenominacion = repaDenominacion;
    }

    public Boolean getRepaActi() {
        return repaActi;
    }

    public void setRepaActi(Boolean repaActi) {
        this.repaActi = repaActi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (repaCodigo2 != null ? repaCodigo2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reparto)) {
            return false;
        }
        Reparto other = (Reparto) object;
        if ((this.repaCodigo2 == null && other.repaCodigo2 != null) || (this.repaCodigo2 != null && !this.repaCodigo2.equals(other.repaCodigo2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Reparto[ repaCodigo2=" + repaCodigo2 + " ]";
    }
    
}
