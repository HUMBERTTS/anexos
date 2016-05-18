package entidad;

import entidad.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-14T19:34:30")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, String> nombreRol;
    public static volatile CollectionAttribute<Roles, Usuarios> usuariosCollection;
    public static volatile SingularAttribute<Roles, Integer> idroles;

}