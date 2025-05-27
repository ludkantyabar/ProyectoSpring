// src/main/java/com/proyecto/proyectospring/repository/InscripcionRepository.java
package com.proyecto.proyectospring.repository;

import com.proyecto.proyectospring.model.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
}