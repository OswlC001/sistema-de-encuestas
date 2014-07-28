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
@Table(name = "RESPUESTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Respuestas.findAll", query = "SELECT r FROM Respuestas r"),
    @NamedQuery(name = "Respuestas.findByResCodigo", query = "SELECT r FROM Respuestas r WHERE r.resCodigo = :resCodigo"),
    @NamedQuery(name = "Respuestas.findByPreCodigo", query = "SELECT r FROM Respuestas r WHERE r.preCodigo = :preCodigo"),
    @NamedQuery(name = "Respuestas.findByOreCodigo", query = "SELECT r FROM Respuestas r WHERE r.oreCodigo = :oreCodigo"),
    @NamedQuery(name = "Respuestas.findByResResplibre", query = "SELECT r FROM Respuestas r WHERE r.resResplibre = :resResplibre")})
public class Respuestas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RES_CODIGO")
    private Long resCodigo;
    @Column(name = "PRE_CODIGO")
    private Long preCodigo;
    @Column(name = "ORE_CODIGO")
    private Long oreCodigo;
    @Size(max = 400)
    @Column(name = "RES_RESPLIBRE")
    private String resResplibre;
    @Column(name = "EUS_CODIGO")
    private Long eusCodigo;

    public Respuestas() {
    }

    public Long getEusCodigo() {
        return eusCodigo;
    }

    public void setEusCodigo(Long eusCodigo) {
        this.eusCodigo = eusCodigo;
    }

     
    
    public Respuestas(Long resCodigo) {
        this.resCodigo = resCodigo;
    }

    public Long getResCodigo() {
        return resCodigo;
    }

    public void setResCodigo(Long resCodigo) {
        this.resCodigo = resCodigo;
    }

   
    public Long getPreCodigo() {
        return preCodigo;
    }

    public void setPreCodigo(Long preCodigo) {
        this.preCodigo = preCodigo;
    }

    public Long getOreCodigo() {
        return oreCodigo;
    }

    public void setOreCodigo(Long oreCodigo) {
        this.oreCodigo = oreCodigo;
    }

    public String getResResplibre() {
        return resResplibre;
    }

    public void setResResplibre(String resResplibre) {
        this.resResplibre = resResplibre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resCodigo != null ? resCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Respuestas)) {
            return false;
        }
        Respuestas other = (Respuestas) object;
        if ((this.resCodigo == null && other.resCodigo != null) || (this.resCodigo != null && !this.resCodigo.equals(other.resCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Respuestas[ resCodigo=" + resCodigo + " ]";
    }

}
