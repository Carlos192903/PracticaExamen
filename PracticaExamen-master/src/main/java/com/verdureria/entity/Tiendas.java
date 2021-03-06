package com.verdureria.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tiendas")//nombre de la tabla donde esta o a la que pertence
public class Tiendas implements Serializable {
    
    //Creacion del Primary key autoicremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se le dice que va a ser un valor autoincremental - Me va a crear uno el solo
    private long id; //Primary Key
    //atributo normal
    private String nombre; 

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
