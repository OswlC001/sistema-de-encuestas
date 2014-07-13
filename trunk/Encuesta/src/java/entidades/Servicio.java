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
@Table(name = "SERVICIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s"),
    @NamedQuery(name = "Servicio.findByServId", query = "SELECT s FROM Servicio s WHERE s.servId = :servId"),
    @NamedQuery(name = "Servicio.findByServSiglas", query = "SELECT s FROM Servicio s WHERE s.servSiglas = :servSiglas"),
    @NamedQuery(name = "Servicio.findByServDeno", query = "SELECT s FROM Servicio s WHERE s.servDeno = :servDeno")})
public class Servicio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "SERV_ID")
    private Long servId;
    @Size(max = 3)
    @Column(name = "SERV_SIGLAS")
    private String servSiglas;
    @Size(max = 60)
    @Column(name = "SERV_DENO")
    private String servDeno;

    public Servicio() {
    }

    public Servicio(Long servId) {
        this.servId = servId;
    }

    public Long getServId() {
        return servId;
    }

    public void setServId(Long servId) {
        this.servId = servId;
    }

    public String getServSiglas() {
        return servSiglas;
    }

    public void setServSiglas(String servSiglas) {
        this.servSiglas = servSiglas;
    }

    public String getServDeno() {
        return servDeno;
    }

    public void setServDeno(String servDeno) {
        this.servDeno = servDeno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servId != null ? servId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.servId == null && other.servId != null) || (this.servId != null && !this.servId.equals(other.servId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Servicio[ servId=" + servId + " ]";
    }
    
}
