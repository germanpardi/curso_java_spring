package com.sinensia.modelo.beans;

import com.sinensia.modelo.beans.Cliente;
import com.sinensia.modelo.beans.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-22T09:21:25")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile SingularAttribute<Compra, Double> precio;
    public static volatile SingularAttribute<Compra, Cliente> clienteId;
    public static volatile SingularAttribute<Compra, Producto> productoId;
    public static volatile SingularAttribute<Compra, Integer> id;
    public static volatile SingularAttribute<Compra, Integer> cantidad;

}