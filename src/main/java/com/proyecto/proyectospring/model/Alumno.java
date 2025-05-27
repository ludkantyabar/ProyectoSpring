// src/main/java/com/proyecto/proyectospring/model/Alumno.java
package com.proyecto.proyectospring.model;

import jakarta.persistence.*;

@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String dni;

    // getters y setters

    public Long getId() {
        return id;
    }

    public Alumno setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Alumno setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Alumno setDni(String dni) {
        this.dni = dni;
        return this;
    }
}