// src/main/java/com/proyecto/proyectospring/model/Profesor.java
package com.proyecto.proyectospring.model;

import jakarta.persistence.*;

@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String especialidad;

    // getters y setters

    public Long getId() {
        return id;
    }

    public Profesor setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Profesor setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Profesor setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
        return this;
    }
}