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
@Table(name = "escuelasext")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Escuelasext.findAll", query = "SELECT e FROM Escuelasext e"),
    @NamedQuery(name = "Escuelasext.findByIdEscuelaExt", query = "SELECT e FROM Escuelasext e WHERE e.idEscuelaExt = :idEscuelaExt"),
    @NamedQuery(name = "Escuelasext.findByNombre", query = "SELECT e FROM Escuelasext e WHERE e.nombre = :nombre")})
public class Escuelasext implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEscuelaExt")
    private Integer idEscuelaExt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEscuelaExt")
    private Collection<Planese> planeseCollection;

    public Escuelasext() {
    }

    public Escuelasext(Integer idEscuelaExt) {
        this.idEscuelaExt = idEscuelaExt;
    }

    public Escuelasext(Integer idEscuelaExt, String nombre) {
        this.idEscuelaExt = idEscuelaExt;
        this.nombre = nombre;
    }

    public Integer getIdEscuelaExt() {
        return idEscuelaExt;
    }

    public void setIdEscuelaExt(Integer idEscuelaExt) {
        this.idEscuelaExt = idEscuelaExt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Planese> getPlaneseCollection() {
        return planeseCollection;
    }

    public void setPlaneseCollection(Collection<Planese> planeseCollection) {
        this.planeseCollection = planeseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEscuelaExt != null ? idEscuelaExt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escuelasext)) {
            return false;
        }
        Escuelasext other = (Escuelasext) object;
        if ((this.idEscuelaExt == null && other.idEscuelaExt != null) || (this.idEscuelaExt != null && !this.idEscuelaExt.equals(other.idEscuelaExt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Escuelasext[ idEscuelaExt=" + idEscuelaExt + " ]";
    }
    
}
