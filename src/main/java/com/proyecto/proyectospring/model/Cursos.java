package com.proyecto.proyectospring.model;

public class Cursos {
    private String nombre;
    private double precio;
    private String descripcion;
    private String duracion;
    private String nivel;
    private String modalidad;


    public Cursos(String nombre, double precio, String descripcion, String duracion, String nivel, String modalidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.nivel = nivel;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getNivel() {
        return nivel;
    }

    public String getModalidad() {
        return modalidad;
    }
}
