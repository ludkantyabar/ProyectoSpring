package com.proyecto.proyectospring.model;

import jakarta.persistence.*;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

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