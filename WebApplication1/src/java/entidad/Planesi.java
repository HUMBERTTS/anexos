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
@Table(name = "planesi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planesi.findAll", query = "SELECT p FROM Planesi p"),
    @NamedQuery(name = "Planesi.findByIdPlanI", query = "SELECT p FROM Planesi p WHERE p.idPlanI = :idPlanI"),
    @NamedQuery(name = "Planesi.findByClave", query = "SELECT p FROM Planesi p WHERE p.clave = :clave"),
    @NamedQuery(name = "Planesi.findByNombre", query = "SELECT p FROM Planesi p WHERE p.nombre = :nombre")})
public class Planesi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlanI")
    private Integer idPlanI;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlanI")
    private Collection<Materiasi> materiasiCollection;

    public Planesi() {
    }

    public Planesi(Integer idPlanI) {
        this.idPlanI = idPlanI;
    }

    public Planesi(Integer idPlanI, String clave, String nombre) {
        this.idPlanI = idPlanI;
        this.clave = clave;
        this.nombre = nombre;
    }

    public Integer getIdPlanI() {
        return idPlanI;
    }

    public void setIdPlanI(Integer idPlanI) {
        this.idPlanI = idPlanI;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Materiasi> getMateriasiCollection() {
        return materiasiCollection;
    }

    public void setMateriasiCollection(Collection<Materiasi> materiasiCollection) {
        this.materiasiCollection = materiasiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlanI != null ? idPlanI.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planesi)) {
            return false;
        }
        Planesi other = (Planesi) object;
        if ((this.idPlanI == null && other.idPlanI != null) || (this.idPlanI != null && !this.idPlanI.equals(other.idPlanI))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Planesi[ idPlanI=" + idPlanI + " ]";
    }
    
}
