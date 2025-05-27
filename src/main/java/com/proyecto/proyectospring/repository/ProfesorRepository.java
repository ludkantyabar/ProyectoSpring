package com.proyecto.proyectospring.repository;

import com.proyecto.proyectospring.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}