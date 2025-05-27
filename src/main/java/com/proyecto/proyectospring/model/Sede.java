// src/main/java/com/proyecto/proyectospring/model/Sede.java
package com.proyecto.proyectospring.model;

import jakarta.persistence.*;

@Entity
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String direccion;

    // getters y setters

    public Long getId() {
        return id;
    }

    public Sede setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Sede setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Sede setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
}