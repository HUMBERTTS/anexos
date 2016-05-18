package entidad;

import entidad.Materiase;
import entidad.Planesi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-14T19:34:30")
@StaticMetamodel(Materiasi.class)
public class Materiasi_ { 

    public static volatile SingularAttribute<Materiasi, String> clave;
    public static volatile SingularAttribute<Materiasi, Integer> idMateriaI;
    public static volatile SingularAttribute<Materiasi, Planesi> idPlanI;
    public static volatile SingularAttribute<Materiasi, Integer> creditos;
    public static volatile CollectionAttribute<Materiasi, Materiase> materiaseCollection;
    public static volatile SingularAttribute<Materiasi, String> nombre;

}