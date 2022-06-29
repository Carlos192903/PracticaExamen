
package com.verdureria.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="verduras")

public class Verduras  implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se le dice que va a ser un valor autoincremental - Me va a crear uno el solo
    private long id; //Primary Key
    
    private String nombre;
    private int cantidad;
    private int precio;
  
    
    //Foreign key
    @ManyToOne // establezco la relacion
    @JoinColumn (name = "tiendas_id")//Aqui digo con que tabla y con que valor se pega
    private Tiendas tiendas;

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

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the tiendas
     */
    public Tiendas getTiendas() {
        return tiendas;
    }

    /**
     * @param tiendas the tiendas to set
     */
    public void setTiendas(Tiendas tiendas) {
        this.tiendas = tiendas;
    }

    
    
    
    
        
}
