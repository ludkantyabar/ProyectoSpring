package com.proyecto.proyectospring.service;

import com.proyecto.proyectospring.model.Sede;
import com.proyecto.proyectospring.repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SedeServiceImpl implements SedeService {

    private final SedeRepository sedeRepository;

    @Autowired
    public SedeServiceImpl(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }

    @Override
    public List<Sede> listarSedes() {
        return sedeRepository.findAll();
    }
}