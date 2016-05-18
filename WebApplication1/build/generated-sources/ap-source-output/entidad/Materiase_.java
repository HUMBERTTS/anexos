package entidad;

import entidad.Asignacion;
import entidad.Materiasi;
import entidad.Planese;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-14T19:34:30")
@StaticMetamodel(Materiase.class)
public class Materiase_ { 

    public static volatile SingularAttribute<Materiase, Integer> idMateriaE;
    public static volatile CollectionAttribute<Materiase, Asignacion> asignacionCollection;
    public static volatile SingularAttribute<Materiase, Materiasi> idMateriaI;
    public static volatile SingularAttribute<Materiase, String> nombreE;
    public static volatile SingularAttribute<Materiase, String> porcentaje;
    public static volatile SingularAttribute<Materiase, Planese> idPlanE;

}