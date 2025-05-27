package com.proyecto.proyectospring.model;

import jakarta.persistence.*;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double precio;
    private String descripcion;
    private String nivel;
    private String modalidad;

    @ManyToOne
    private Profesor profesor;

    @ManyToOne
    private Horario horario;

    @ManyToOne
    private Sede sede;

    // getters y setters

    public Long getId() {
        return id;
    }

    public Curso setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Curso setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Curso setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Curso setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public String getNivel() {
        return nivel;
    }

    public Curso setNivel(String nivel) {
        this.nivel = nivel;
        return this;
    }

    public String getModalidad() {
        return modalidad;
    }

    public Curso setModalidad(String modalidad) {
        this.modalidad = modalidad;
        return this;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Curso setProfesor(Profesor profesor) {
        this.profesor = profesor;
        return this;
    }

    public Horario getHorario() {
        return horario;
    }

    public Curso setHorario(Horario horario) {
        this.horario = horario;
        return this;
    }

    public Sede getSede() {
        return sede;
    }

    public Curso setSede(Sede sede) {
        this.sede = sede;
        return this;
    }
}