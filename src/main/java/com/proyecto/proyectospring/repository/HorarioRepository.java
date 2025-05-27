package com.proyecto.proyectospring.repository;

import com.proyecto.proyectospring.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioRepository extends JpaRepository<Horario, Long> {
}