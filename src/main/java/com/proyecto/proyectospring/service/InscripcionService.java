// src/main/java/com/proyecto/proyectospring/service/InscripcionService.java
package com.proyecto.proyectospring.service;

import com.proyecto.proyectospring.model.Inscripcion;
import java.util.List;
import java.util.Optional;

public interface InscripcionService {
    List<Inscripcion> listarInscripciones();
    Optional<Inscripcion> obtenerInscripcion(Long id); // <-- Agregar este método
    Inscripcion guardarInscripcion(Inscripcion inscripcion);
    void eliminarInscripcion(Long id); // <-- Agregar este método
}