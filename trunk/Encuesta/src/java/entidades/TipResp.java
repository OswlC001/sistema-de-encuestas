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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "TIP_RESP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipResp.findAll", query = "SELECT t FROM TipResp t"),
    @NamedQuery(name = "TipResp.findByTreCodigo", query = "SELECT t FROM TipResp t WHERE t.treCodigo = :treCodigo"),
    @NamedQuery(name = "TipResp.findByTreDescri", query = "SELECT t FROM TipResp t WHERE t.treDescri = :treDescri")})
public class TipResp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "TRE_CODIGO")
    private Long treCodigo;
    @Size(max = 100)
    @Column(name = "TRE_DESCRI")
    private String treDescri;

    public TipResp() {
    }

    public TipResp(Long treCodigo) {
        this.treCodigo = treCodigo;
    }

    public Long getTreCodigo() {
        return treCodigo;
    }

    public void setTreCodigo(Long treCodigo) {
        this.treCodigo = treCodigo;
    }

    public String getTreDescri() {
        return treDescri;
    }

    public void setTreDescri(String treDescri) {
        this.treDescri = treDescri;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (treCodigo != null ? treCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipResp)) {
            return false;
        }
        TipResp other = (TipResp) object;
        if ((this.treCodigo == null && other.treCodigo != null) || (this.treCodigo != null && !this.treCodigo.equals(other.treCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipResp[ treCodigo=" + treCodigo + " ]";
    }
    
}
