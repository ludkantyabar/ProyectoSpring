package com.proyecto.proyectospring.service;


import com.proyecto.proyectospring.repository.CursoRegistroRepository;
import com.proyecto.proyectospring.model.CursoRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    private final CursoRegistroRepository repository;

    @Autowired
    public CursoService(CursoRegistroRepository repository){
        this.repository = repository;
    }

    public void guardarCurso(CursoRegistro curso){
        repository.save(curso);
    }

    public List<CursoRegistro> listarCursos(){
        return repository.findAll();
    }

    public void eliminarCurso(Long id){
        repository.deleteById(id);
    }
}
