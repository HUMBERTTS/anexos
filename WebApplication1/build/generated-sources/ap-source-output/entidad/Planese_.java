package entidad;

import entidad.Escuelasext;
import entidad.Materiase;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-14T19:34:30")
@StaticMetamodel(Planese.class)
public class Planese_ { 

    public static volatile SingularAttribute<Planese, String> clave;
    public static volatile SingularAttribute<Planese, Escuelasext> idEscuelaExt;
    public static volatile CollectionAttribute<Planese, Materiase> materiaseCollection;
    public static volatile SingularAttribute<Planese, Integer> idPlanE;
    public static volatile SingularAttribute<Planese, String> nombre;

}