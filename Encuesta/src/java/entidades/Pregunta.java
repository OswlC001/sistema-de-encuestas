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
@Table(name = "PREGUNTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregunta.findAll", query = "SELECT p FROM Pregunta p"),
    @NamedQuery(name = "Pregunta.findByPreCodigo", query = "SELECT p FROM Pregunta p WHERE p.preCodigo = :preCodigo"),
    @NamedQuery(name = "Pregunta.findByTreCodigo", query = "SELECT p FROM Pregunta p WHERE p.treCodigo = :treCodigo"),
    @NamedQuery(name = "Pregunta.findByServId", query = "SELECT p FROM Pregunta p WHERE p.servId = :servId"),
    @NamedQuery(name = "Pregunta.findByEncCodigo", query = "SELECT p FROM Pregunta p WHERE p.encCodigo = :encCodigo"),
    @NamedQuery(name = "Pregunta.findByPrePregunta", query = "SELECT p FROM Pregunta p WHERE p.prePregunta = :prePregunta")})
public class Pregunta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PRE_CODIGO")
    private Long preCodigo;
    @Column(name = "TRE_CODIGO")
    private Long treCodigo;
    @Column(name = "SERV_ID")
    private Long servId;
    @Column(name = "ENC_CODIGO")
    private Long encCodigo;
    @Size(max = 400)
    @Column(name = "PRE_PREGUNTA")
    private String prePregunta;
    @Column(name = "PRE_LIBRE")
    private Boolean preLibre;
    @Column(name = "PRE_OBLIG")
    private Boolean preOblig;

    public Pregunta() {
    }
    
    public Pregunta(Long preCodigo) {
        this.preCodigo = preCodigo;
    }

    public Boolean getPreLibre() {
        return preLibre;
    }

    public void setPreLibre(Boolean preLibre) {
        this.preLibre = preLibre;
    }

    public Boolean getPreOblig() {
        return preOblig;
    }

    public void setPreOblig(Boolean preOblig) {
        this.preOblig = preOblig;
    }  
    
    public Long getPreCodigo() {
        return preCodigo;
    }

    public void setPreCodigo(Long preCodigo) {
        this.preCodigo = preCodigo;
    }

    public Long getTreCodigo() {
        return treCodigo;
    }

    public void setTreCodigo(Long treCodigo) {
        this.treCodigo = treCodigo;
    }

    public Long getServId() {
        return servId;
    }

    public void setServId(Long servId) {
        this.servId = servId;
    }

    public Long getEncCodigo() {
        return encCodigo;
    }

    public void setEncCodigo(Long encCodigo) {
        this.encCodigo = encCodigo;
    }

    public String getPrePregunta() {
        return prePregunta;
    }

    public void setPrePregunta(String prePregunta) {
        this.prePregunta = prePregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (preCodigo != null ? preCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.preCodigo == null && other.preCodigo != null) || (this.preCodigo != null && !this.preCodigo.equals(other.preCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Pregunta[ preCodigo=" + preCodigo + " ]";
    }
    
}
