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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jovanny
 */
@Entity
@Table(name = "planese")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planese.findAll", query = "SELECT p FROM Planese p"),
    @NamedQuery(name = "Planese.findByIdPlanE", query = "SELECT p FROM Planese p WHERE p.idPlanE = :idPlanE"),
    @NamedQuery(name = "Planese.findByNombre", query = "SELECT p FROM Planese p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Planese.findByClave", query = "SELECT p FROM Planese p WHERE p.clave = :clave")})
public class Planese implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlanE")
    private Integer idPlanE;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "Clave")
    private String clave;
    @JoinColumn(name = "idEscuelaExt", referencedColumnName = "idEscuelaExt")
    @ManyToOne(optional = false)
    private Escuelasext idEscuelaExt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlanE")
    private Collection<Materiase> materiaseCollection;

    public Planese() {
    }

    public Planese(Integer idPlanE) {
        this.idPlanE = idPlanE;
    }

    public Integer getIdPlanE() {
        return idPlanE;
    }

    public void setIdPlanE(Integer idPlanE) {
        this.idPlanE = idPlanE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Escuelasext getIdEscuelaExt() {
        return idEscuelaExt;
    }

    public void setIdEscuelaExt(Escuelasext idEscuelaExt) {
        this.idEscuelaExt = idEscuelaExt;
    }

    @XmlTransient
    public Collection<Materiase> getMateriaseCollection() {
        return materiaseCollection;
    }

    public void setMateriaseCollection(Collection<Materiase> materiaseCollection) {
        this.materiaseCollection = materiaseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlanE != null ? idPlanE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planese)) {
            return false;
        }
        Planese other = (Planese) object;
        if ((this.idPlanE == null && other.idPlanE != null) || (this.idPlanE != null && !this.idPlanE.equals(other.idPlanE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Planese[ idPlanE=" + idPlanE + " ]";
    }
    
}
