/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "materiasi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materiasi.findAll", query = "SELECT m FROM Materiasi m"),
    @NamedQuery(name = "Materiasi.findByIdMateriaI", query = "SELECT m FROM Materiasi m WHERE m.idMateriaI = :idMateriaI"),
    @NamedQuery(name = "Materiasi.findByNombre", query = "SELECT m FROM Materiasi m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Materiasi.findByClave", query = "SELECT m FROM Materiasi m WHERE m.clave = :clave"),
    @NamedQuery(name = "Materiasi.findByCreditos", query = "SELECT m FROM Materiasi m WHERE m.creditos = :creditos")})
public class Materiasi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMateriaI")
    private Integer idMateriaI;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Clave")
    private String clave;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Creditos")
    private int creditos;
    @JoinColumn(name = "idPlanI", referencedColumnName = "idPlanI")
    @ManyToOne(optional = false)
    private Planesi idPlanI;
    @OneToMany(mappedBy = "idMateriaI")
    private Collection<Materiase> materiaseCollection;

    public Materiasi() {
    }

    public Materiasi(Integer idMateriaI) {
        this.idMateriaI = idMateriaI;
    }

    public Materiasi(Integer idMateriaI, String nombre, String clave, int creditos) {
        this.idMateriaI = idMateriaI;
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
    }

    public Integer getIdMateriaI() {
        return idMateriaI;
    }

    public void setIdMateriaI(Integer idMateriaI) {
        this.idMateriaI = idMateriaI;
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Planesi getIdPlanI() {
        return idPlanI;
    }

    public void setIdPlanI(Planesi idPlanI) {
        this.idPlanI = idPlanI;
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
        hash += (idMateriaI != null ? idMateriaI.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiasi)) {
            return false;
        }
        Materiasi other = (Materiasi) object;
        if ((this.idMateriaI == null && other.idMateriaI != null) || (this.idMateriaI != null && !this.idMateriaI.equals(other.idMateriaI))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Materiasi[ idMateriaI=" + idMateriaI + " ]";
    }
    
}
