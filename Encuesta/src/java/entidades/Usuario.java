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
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUsrId", query = "SELECT u FROM Usuario u WHERE u.usrId = :usrId"),
    @NamedQuery(name = "Usuario.findByDepId", query = "SELECT u FROM Usuario u WHERE u.depId = :depId"),
    @NamedQuery(name = "Usuario.findByRepaCodigo", query = "SELECT u FROM Usuario u WHERE u.repaCodigo = :repaCodigo"),
    @NamedQuery(name = "Usuario.findByUsrCi", query = "SELECT u FROM Usuario u WHERE u.usrCi = :usrCi"),
    @NamedQuery(name = "Usuario.findByUsrApellido", query = "SELECT u FROM Usuario u WHERE u.usrApellido = :usrApellido"),
    @NamedQuery(name = "Usuario.findByUsrGrado", query = "SELECT u FROM Usuario u WHERE u.usrGrado = :usrGrado"),
    @NamedQuery(name = "Usuario.findByUsrCargo", query = "SELECT u FROM Usuario u WHERE u.usrCargo = :usrCargo"),
    @NamedQuery(name = "Usuario.findByUsrCorreo", query = "SELECT u FROM Usuario u WHERE u.usrCorreo = :usrCorreo"),
    @NamedQuery(name = "Usuario.findByUsrActi", query = "SELECT u FROM Usuario u WHERE u.usrActi = :usrActi"),
    @NamedQuery(name = "Usuario.findByUsrClave", query = "SELECT u FROM Usuario u WHERE u.usrClave = :usrClave"),
    @NamedQuery(name = "Usuario.findByUsrTipo", query = "SELECT u FROM Usuario u WHERE u.usrTipo = :usrTipo")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "USR_ID")
    private Long usrId;
    @Column(name = "DEP_ID")
    private Long depId;
    @Size(max = 6)
    @Column(name = "REPA_CODIGO")
    private String repaCodigo;
    @Size(max = 10)
    @Column(name = "USR_CI")
    private String usrCi;
    @Size(max = 100)
    @Column(name = "USR_APELLIDO")
    private String usrApellido;
    @Size(max = 4)
    @Column(name = "USR_GRADO")
    private String usrGrado;
    @Size(max = 100)
    @Column(name = "USR_CARGO")
    private String usrCargo;
    @Size(max = 100)
    @Column(name = "USR_CORREO")
    private String usrCorreo;
    @Column(name = "USR_ACTI")
    private Boolean usrActi;
    @Size(max = 30)
    @Column(name = "USR_CLAVE")
    private String usrClave;
    @Column(name = "USR_TIPO")
    private Character usrTipo;

    public Usuario() {
    }

    public Usuario(Long usrId) {
        this.usrId = usrId;
    }

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getRepaCodigo() {
        return repaCodigo;
    }

    public void setRepaCodigo(String repaCodigo) {
        this.repaCodigo = repaCodigo;
    }

    public String getUsrCi() {
        return usrCi;
    }

    public void setUsrCi(String usrCi) {
        this.usrCi = usrCi;
    }

    public String getUsrApellido() {
        return usrApellido;
    }

    public void setUsrApellido(String usrApellido) {
        this.usrApellido = usrApellido;
    }

    public String getUsrGrado() {
        return usrGrado;
    }

    public void setUsrGrado(String usrGrado) {
        this.usrGrado = usrGrado;
    }

    public String getUsrCargo() {
        return usrCargo;
    }

    public void setUsrCargo(String usrCargo) {
        this.usrCargo = usrCargo;
    }

    public String getUsrCorreo() {
        return usrCorreo;
    }

    public void setUsrCorreo(String usrCorreo) {
        this.usrCorreo = usrCorreo;
    }

    public Boolean getUsrActi() {
        return usrActi;
    }

    public void setUsrActi(Boolean usrActi) {
        this.usrActi = usrActi;
    }

    public String getUsrClave() {
        return usrClave;
    }

    public void setUsrClave(String usrClave) {
        this.usrClave = usrClave;
    }

    public Character getUsrTipo() {
        return usrTipo;
    }

    public void setUsrTipo(Character usrTipo) {
        this.usrTipo = usrTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Usuario[ usrId=" + usrId + " ]";
    }
    
}
