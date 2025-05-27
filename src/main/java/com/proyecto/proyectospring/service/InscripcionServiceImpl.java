package com.proyecto.proyectospring.service;

import com.proyecto.proyectospring.model.Inscripcion;
import com.proyecto.proyectospring.model.Alumno;
import com.proyecto.proyectospring.repository.InscripcionRepository;
import com.proyecto.proyectospring.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InscripcionServiceImpl implements InscripcionService {

    private final InscripcionRepository inscripcionRepository;
    private final AlumnoRepository alumnoRepository;

    @Autowired
    public InscripcionServiceImpl(InscripcionRepository inscripcionRepository, AlumnoRepository alumnoRepository) {
        this.inscripcionRepository = inscripcionRepository;
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public List<Inscripcion> listarInscripciones() {
        return inscripcionRepository.findAll();
    }

    @Override
    public Optional<Inscripcion> obtenerInscripcion(Long id) {
        return inscripcionRepository.findById(id);
    }

    @Override
    public Inscripcion guardarInscripcion(Inscripcion inscripcion) {
        Alumno alumno = inscripcion.getAlumno();
        if (alumno != null) {
            if (alumno.getId() == null) {
                alumno = alumnoRepository.save(alumno);
            } else {
                alumno = alumnoRepository.findById(alumno.getId())
                        .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
            }
            inscripcion.setAlumno(alumno);
        }
        return inscripcionRepository.save(inscripcion);
    }

    @Override
    public void eliminarInscripcion(Long id) {
        inscripcionRepository.deleteById(id);
    }
}