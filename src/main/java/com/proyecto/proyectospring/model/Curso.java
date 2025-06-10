package com.proyecto.proyectospring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String nombre;

    @NotBlank
    private String modalidad;

    @ManyToOne
    @NotNull
    private Profesor profesor;

    @ManyToOne
    @NotNull
    private Horario horario;

    @ManyToOne
    @NotNull
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