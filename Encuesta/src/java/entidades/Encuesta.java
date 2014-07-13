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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SiperProg
 */
@Entity
@Table(name = "ENCUESTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Encuesta.findAll", query = "SELECT e FROM Encuesta e"),
    @NamedQuery(name = "Encuesta.findByEncCodigo", query = "SELECT e FROM Encuesta e WHERE e.encCodigo = :encCodigo"),
    @NamedQuery(name = "Encuesta.findByEncDescri", query = "SELECT e FROM Encuesta e WHERE e.encDescri = :encDescri"),
    @NamedQuery(name = "Encuesta.findByEncEstado", query = "SELECT e FROM Encuesta e WHERE e.encEstado = :encEstado"),
    @NamedQuery(name = "Encuesta.findByEncFechini", query = "SELECT e FROM Encuesta e WHERE e.encFechini = :encFechini"),
    @NamedQuery(name = "Encuesta.findByEncFecfin", query = "SELECT e FROM Encuesta e WHERE e.encFecfin = :encFecfin"),
    @NamedQuery(name = "Encuesta.findByEncFiltXSrv", query = "SELECT e FROM Encuesta e WHERE e.encFiltXSrv = :encFiltXSrv")})
public class Encuesta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ENC_CODIGO")
    private Long encCodigo;
    @Size(max = 200)
    @Column(name = "ENC_DESCRI")
    private String encDescri;
    @Column(name = "ENC_ESTADO")
    private Character encEstado;
    @Column(name = "ENC_FECHINI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date encFechini;
    @Column(name = "ENC_FECFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date encFecfin;
    @Column(name = "ENC_FILT_X_SRV")
    private Character encFiltXSrv;

    public Encuesta() {
    }

    public Encuesta(Long encCodigo) {
        this.encCodigo = encCodigo;
    }

    public Long getEncCodigo() {
        return encCodigo;
    }

    public void setEncCodigo(Long encCodigo) {
        this.encCodigo = encCodigo;
    }

    public String getEncDescri() {
        return encDescri;
    }

    public void setEncDescri(String encDescri) {
        this.encDescri = encDescri;
    }

    public Character getEncEstado() {
        return encEstado;
    }

    public void setEncEstado(Character encEstado) {
        this.encEstado = encEstado;
    }

    public Date getEncFechini() {
        return encFechini;
    }

    public void setEncFechini(Date encFechini) {
        this.encFechini = encFechini;
    }

    public Date getEncFecfin() {
        return encFecfin;
    }

    public void setEncFecfin(Date encFecfin) {
        this.encFecfin = encFecfin;
    }

    public Character getEncFiltXSrv() {
        return encFiltXSrv;
    }

    public void setEncFiltXSrv(Character encFiltXSrv) {
        this.encFiltXSrv = encFiltXSrv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (encCodigo != null ? encCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encuesta)) {
            return false;
        }
        Encuesta other = (Encuesta) object;
        if ((this.encCodigo == null && other.encCodigo != null) || (this.encCodigo != null && !this.encCodigo.equals(other.encCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Encuesta[ encCodigo=" + encCodigo + " ]";
    }
    
}
