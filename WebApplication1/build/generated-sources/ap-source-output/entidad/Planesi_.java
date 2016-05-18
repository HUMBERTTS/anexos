package entidad;

import entidad.Materiasi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-14T19:34:30")
@StaticMetamodel(Planesi.class)
public class Planesi_ { 

    public static volatile SingularAttribute<Planesi, String> clave;
    public static volatile CollectionAttribute<Planesi, Materiasi> materiasiCollection;
    public static volatile SingularAttribute<Planesi, Integer> idPlanI;
    public static volatile SingularAttribute<Planesi, String> nombre;

}