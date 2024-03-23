
package com.restaurant.restaurante.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Menu {
    private int id;
    private String nombrePlato;
    private double precio;
    private String description;
    
    public Menu() {
        
    }

    public Menu(int id, String nombrePlato, double precio, String description) {
        this.id = id;
        this.nombrePlato = nombrePlato;
        this.precio = precio;
        this.description = description;
    }
    
    
    
}
