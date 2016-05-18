/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jovanny
 */
@Entity
@Table(name = "roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roles.findAll", query = "SELECT r FROM Roles r"),
    @NamedQuery(name = "Roles.findByIdroles", query = "SELECT r FROM Roles r WHERE r.idroles = :idroles"),
    @NamedQuery(name = "Roles.findByNombreRol", query = "SELECT r FROM Roles r WHERE r.nombreRol = :nombreRol")})
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idroles")
    private Integer idroles;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreRol")
    private String nombreRol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolesIdroles")
    private Collection<Usuarios> usuariosCollection;

    public Roles() {
    }

    public Roles(Integer idroles) {
        this.idroles = idroles;
    }

    public Roles(Integer idroles, String nombreRol) {
        this.idroles = idroles;
        this.nombreRol = nombreRol;
    }

    public Integer getIdroles() {
        return idroles;
    }

    public void setIdroles(Integer idroles) {
        this.idroles = idroles;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @XmlTransient
    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idroles != null ? idroles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roles)) {
            return false;
        }
        Roles other = (Roles) object;
        if ((this.idroles == null && other.idroles != null) || (this.idroles != null && !this.idroles.equals(other.idroles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Roles[ idroles=" + idroles + " ]";
    }
    
}
