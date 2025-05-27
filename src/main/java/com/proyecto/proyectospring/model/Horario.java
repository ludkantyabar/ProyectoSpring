// src/main/java/com/proyecto/proyectospring/model/Horario.java
package com.proyecto.proyectospring.model;

import jakarta.persistence.*;

@Entity
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dia;
    private String horaInicio;
    private String horaFin;

    // getters y setters

    public Long getId() {
        return id;
    }

    public Horario setId(Long id) {
        this.id = id;
        return this;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public Horario setHoraFin(String horaFin) {
        this.horaFin = horaFin;
        return this;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public Horario setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
        return this;
    }

    public String getDia() {
        return dia;
    }

    public Horario setDia(String dia) {
        this.dia = dia;
        return this;
    }
}