package entidad;

import entidad.Asignacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-14T19:34:30")
@StaticMetamodel(Alumnos.class)
public class Alumnos_ { 

    public static volatile SingularAttribute<Alumnos, Integer> idAlumno;
    public static volatile CollectionAttribute<Alumnos, Asignacion> asignacionCollection;
    public static volatile SingularAttribute<Alumnos, String> apeMaterno;
    public static volatile SingularAttribute<Alumnos, String> nombre;
    public static volatile SingularAttribute<Alumnos, String> apePaterno;

}