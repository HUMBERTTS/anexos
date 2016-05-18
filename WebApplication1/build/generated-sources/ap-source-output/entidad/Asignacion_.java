package entidad;

import entidad.Alumnos;
import entidad.Materiase;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-14T19:34:30")
@StaticMetamodel(Asignacion.class)
public class Asignacion_ { 

    public static volatile SingularAttribute<Asignacion, Alumnos> idAlumno;
    public static volatile SingularAttribute<Asignacion, Integer> calificacion;
    public static volatile SingularAttribute<Asignacion, Materiase> idMateriaE;
    public static volatile SingularAttribute<Asignacion, Integer> idConvalidacion;

}