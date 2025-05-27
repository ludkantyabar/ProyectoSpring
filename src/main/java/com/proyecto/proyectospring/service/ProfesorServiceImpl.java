package com.proyecto.proyectospring.service;

import com.proyecto.proyectospring.model.Profesor;
import com.proyecto.proyectospring.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    private final ProfesorRepository profesorRepository;

    @Autowired
    public ProfesorServiceImpl(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public List<Profesor> listarProfesores() {
        return profesorRepository.findAll();
    }
}