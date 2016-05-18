/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jovanny
 */
@Entity
@Table(name = "asignacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignacion.findAll", query = "SELECT a FROM Asignacion a"),
    @NamedQuery(name = "Asignacion.findByCalificacion", query = "SELECT a FROM Asignacion a WHERE a.calificacion = :calificacion"),
    @NamedQuery(name = "Asignacion.findByIdConvalidacion", query = "SELECT a FROM Asignacion a WHERE a.idConvalidacion = :idConvalidacion")})
public class Asignacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calificacion")
    private int calificacion;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdConvalidacion")
    private Integer idConvalidacion;
    @JoinColumn(name = "idAlumno", referencedColumnName = "idAlumno")
    @ManyToOne(optional = false)
    private Alumnos idAlumno;
    @JoinColumn(name = "idMateriaE", referencedColumnName = "idMateriaE")
    @ManyToOne(optional = false)
    private Materiase idMateriaE;

    public Asignacion() {
    }

    public Asignacion(Integer idConvalidacion) {
        this.idConvalidacion = idConvalidacion;
    }

    public Asignacion(Integer idConvalidacion, int calificacion) {
        this.idConvalidacion = idConvalidacion;
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getIdConvalidacion() {
        return idConvalidacion;
    }

    public void setIdConvalidacion(Integer idConvalidacion) {
        this.idConvalidacion = idConvalidacion;
    }

    public Alumnos getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumnos idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Materiase getIdMateriaE() {
        return idMateriaE;
    }

    public void setIdMateriaE(Materiase idMateriaE) {
        this.idMateriaE = idMateriaE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConvalidacion != null ? idConvalidacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignacion)) {
            return false;
        }
        Asignacion other = (Asignacion) object;
        if ((this.idConvalidacion == null && other.idConvalidacion != null) || (this.idConvalidacion != null && !this.idConvalidacion.equals(other.idConvalidacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Asignacion[ idConvalidacion=" + idConvalidacion + " ]";
    }
    
}
