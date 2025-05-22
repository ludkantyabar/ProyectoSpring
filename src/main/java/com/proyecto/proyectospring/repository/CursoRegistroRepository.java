package com.proyecto.proyectospring.repository;


import com.proyecto.proyectospring.model.CursoRegistro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRegistroRepository extends JpaRepository <CursoRegistro, Long>{
}

