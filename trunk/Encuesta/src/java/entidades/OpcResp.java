/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SiperProg
 */
@Entity
@Table(name = "OPC_RESP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpcResp.findAll", query = "SELECT o FROM OpcResp o"),
    @NamedQuery(name = "OpcResp.findByOreCodigo", query = "SELECT o FROM OpcResp o WHERE o.oreCodigo = :oreCodigo"),
    @NamedQuery(name = "OpcResp.findByTreCodigo", query = "SELECT o FROM OpcResp o WHERE o.treCodigo = :treCodigo"),
    @NamedQuery(name = "OpcResp.findByOreDescri", query = "SELECT o FROM OpcResp o WHERE o.oreDescri = :oreDescri")})
public class OpcResp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ORE_CODIGO")
    private Long oreCodigo;
    @Column(name = "TRE_CODIGO")
    private Long treCodigo;
    @Size(max = 100)
    @Column(name = "ORE_DESCRI")
    private String oreDescri;

    public OpcResp() {
    }

    public OpcResp(Long oreCodigo) {
        this.oreCodigo = oreCodigo;
    }

    public Long getOreCodigo() {
        return oreCodigo;
    }

    public void setOreCodigo(Long oreCodigo) {
        this.oreCodigo = oreCodigo;
    }

    public Long getTreCodigo() {
        return treCodigo;
    }

    public void setTreCodigo(Long treCodigo) {
        this.treCodigo = treCodigo;
    }

    public String getOreDescri() {
        return oreDescri;
    }

    public void setOreDescri(String oreDescri) {
        this.oreDescri = oreDescri;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oreCodigo != null ? oreCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpcResp)) {
            return false;
        }
        OpcResp other = (OpcResp) object;
        if ((this.oreCodigo == null && other.oreCodigo != null) || (this.oreCodigo != null && !this.oreCodigo.equals(other.oreCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.OpcResp[ oreCodigo=" + oreCodigo + " ]";
    }
    
}
