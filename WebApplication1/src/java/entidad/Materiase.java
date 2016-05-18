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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jovanny
 */
@Entity
@Table(name = "materiase")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materiase.findAll", query = "SELECT m FROM Materiase m"),
    @NamedQuery(name = "Materiase.findByIdMateriaE", query = "SELECT m FROM Materiase m WHERE m.idMateriaE = :idMateriaE"),
    @NamedQuery(name = "Materiase.findByNombreE", query = "SELECT m FROM Materiase m WHERE m.nombreE = :nombreE"),
    @NamedQuery(name = "Materiase.findByPorcentaje", query = "SELECT m FROM Materiase m WHERE m.porcentaje = :porcentaje")})
public class Materiase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMateriaE")
    private Integer idMateriaE;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreE")
    private String nombreE;
    @Size(max = 45)
    @Column(name = "porcentaje")
    private String porcentaje;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateriaE")
    private Collection<Asignacion> asignacionCollection;
    @JoinColumn(name = "idMateriaI", referencedColumnName = "idMateriaI")
    @ManyToOne
    private Materiasi idMateriaI;
    @JoinColumn(name = "idPlanE", referencedColumnName = "idPlanE")
    @ManyToOne(optional = false)
    private Planese idPlanE;

    public Materiase() {
    }

    public Materiase(Integer idMateriaE) {
        this.idMateriaE = idMateriaE;
    }

    public Materiase(Integer idMateriaE, String nombreE) {
        this.idMateriaE = idMateriaE;
        this.nombreE = nombreE;
    }

    public Integer getIdMateriaE() {
        return idMateriaE;
    }

    public void setIdMateriaE(Integer idMateriaE) {
        this.idMateriaE = idMateriaE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    @XmlTransient
    public Collection<Asignacion> getAsignacionCollection() {
        return asignacionCollection;
    }

    public void setAsignacionCollection(Collection<Asignacion> asignacionCollection) {
        this.asignacionCollection = asignacionCollection;
    }

    public Materiasi getIdMateriaI() {
        return idMateriaI;
    }

    public void setIdMateriaI(Materiasi idMateriaI) {
        this.idMateriaI = idMateriaI;
    }

    public Planese getIdPlanE() {
        return idPlanE;
    }

    public void setIdPlanE(Planese idPlanE) {
        this.idPlanE = idPlanE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateriaE != null ? idMateriaE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiase)) {
            return false;
        }
        Materiase other = (Materiase) object;
        if ((this.idMateriaE == null && other.idMateriaE != null) || (this.idMateriaE != null && !this.idMateriaE.equals(other.idMateriaE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Materiase[ idMateriaE=" + idMateriaE + " ]";
    }
    
}
