/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SiperProg
 */
@Entity
@Table(name = "ENC_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EncUsuario.findAll", query = "SELECT e FROM EncUsuario e"),
    @NamedQuery(name = "EncUsuario.findByEusCodigo", query = "SELECT e FROM EncUsuario e WHERE e.eusCodigo = :eusCodigo"),
    @NamedQuery(name = "EncUsuario.findByEncCodigo", query = "SELECT e FROM EncUsuario e WHERE e.encCodigo = :encCodigo"),
    @NamedQuery(name = "EncUsuario.findByUsrId", query = "SELECT e FROM EncUsuario e WHERE e.usrId = :usrId"),
    @NamedQuery(name = "EncUsuario.findByEusFecha", query = "SELECT e FROM EncUsuario e WHERE e.eusFecha = :eusFecha")})
public class EncUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EUS_CODIGO")
    private Long eusCodigo;
    @Column(name = "ENC_CODIGO")
    private Long encCodigo;
    @Column(name = "USR_ID")
    private Long usrId;
    @Column(name = "EUS_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eusFecha;

    public EncUsuario() {
    }

    public EncUsuario(Long eusCodigo) {
        this.eusCodigo = eusCodigo;
    }

    public Long getEusCodigo() {
        return eusCodigo;
    }

    public void setEusCodigo(Long eusCodigo) {
        this.eusCodigo = eusCodigo;
    }

    public Long getEncCodigo() {
        return encCodigo;
    }

    public void setEncCodigo(Long encCodigo) {
        this.encCodigo = encCodigo;
    }

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public Date getEusFecha() {
        return eusFecha;
    }

    public void setEusFecha(Date eusFecha) {
        this.eusFecha = eusFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eusCodigo != null ? eusCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EncUsuario)) {
            return false;
        }
        EncUsuario other = (EncUsuario) object;
        if ((this.eusCodigo == null && other.eusCodigo != null) || (this.eusCodigo != null && !this.eusCodigo.equals(other.eusCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EncUsuario[ eusCodigo=" + eusCodigo + " ]";
    }

}
