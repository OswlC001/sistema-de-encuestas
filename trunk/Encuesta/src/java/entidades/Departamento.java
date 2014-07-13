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
@Table(name = "DEPARTAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d"),
    @NamedQuery(name = "Departamento.findByDepId", query = "SELECT d FROM Departamento d WHERE d.depId = :depId"),
    @NamedQuery(name = "Departamento.findByRepaCodigo2", query = "SELECT d FROM Departamento d WHERE d.repaCodigo2 = :repaCodigo2"),
    @NamedQuery(name = "Departamento.findByDepSiglas", query = "SELECT d FROM Departamento d WHERE d.depSiglas = :depSiglas"),
    @NamedQuery(name = "Departamento.findByDepDenominacion", query = "SELECT d FROM Departamento d WHERE d.depDenominacion = :depDenominacion"),
    @NamedQuery(name = "Departamento.findByDepActi", query = "SELECT d FROM Departamento d WHERE d.depActi = :depActi")})
public class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "DEP_ID")
    private Long depId;
    @Size(max = 6)
    @Column(name = "REPA_CODIGO2")
    private String repaCodigo2;
    @Size(max = 3)
    @Column(name = "DEP_SIGLAS")
    private String depSiglas;
    @Size(max = 100)
    @Column(name = "DEP_DENOMINACION")
    private String depDenominacion;
    @Column(name = "DEP_ACTI")
    private Boolean depActi;

    public Departamento() {
    }

    public Departamento(Long depId) {
        this.depId = depId;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getRepaCodigo2() {
        return repaCodigo2;
    }

    public void setRepaCodigo2(String repaCodigo2) {
        this.repaCodigo2 = repaCodigo2;
    }

    public String getDepSiglas() {
        return depSiglas;
    }

    public void setDepSiglas(String depSiglas) {
        this.depSiglas = depSiglas;
    }

    public String getDepDenominacion() {
        return depDenominacion;
    }

    public void setDepDenominacion(String depDenominacion) {
        this.depDenominacion = depDenominacion;
    }

    public Boolean getDepActi() {
        return depActi;
    }

    public void setDepActi(Boolean depActi) {
        this.depActi = depActi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depId != null ? depId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.depId == null && other.depId != null) || (this.depId != null && !this.depId.equals(other.depId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Departamento[ depId=" + depId + " ]";
    }
    
}
