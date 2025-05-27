package com.proyecto.proyectospring.repository;

import com.proyecto.proyectospring.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}