package com.proyecto.proyectospring.service;

import com.proyecto.proyectospring.model.Horario;
import com.proyecto.proyectospring.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HorarioServiceImpl implements HorarioService {

    private final HorarioRepository horarioRepository;

    @Autowired
    public HorarioServiceImpl(HorarioRepository horarioRepository) {
        this.horarioRepository = horarioRepository;
    }

    @Override
    public List<Horario> listarHorarios() {
        return horarioRepository.findAll();
    }
}