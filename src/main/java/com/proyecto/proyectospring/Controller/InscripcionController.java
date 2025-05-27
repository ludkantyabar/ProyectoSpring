package com.proyecto.proyectospring.Controller;

import com.proyecto.proyectospring.model.Inscripcion;
import com.proyecto.proyectospring.service.InscripcionService;
import com.proyecto.proyectospring.service.ProfesorService;
import com.proyecto.proyectospring.service.CursoService;
import com.proyecto.proyectospring.service.HorarioService;
import com.proyecto.proyectospring.service.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InscripcionController {

    private final InscripcionService inscripcionService;
    private final ProfesorService profesorService;
    private final CursoService cursoService;
    private final HorarioService horarioService;
    private final SedeService sedeService;

    @Autowired
    public InscripcionController(
            InscripcionService inscripcionService,
            ProfesorService profesorService,
            CursoService cursoService,
            HorarioService horarioService,
            SedeService sedeService
    ) {
        this.inscripcionService = inscripcionService;
        this.profesorService = profesorService;
        this.cursoService = cursoService;
        this.horarioService = horarioService;
        this.sedeService = sedeService;
    }

    @GetMapping("/cursos")
    public String mostrarInscripciones(Model model) {
        model.addAttribute("inscripcion", new Inscripcion());
        model.addAttribute("inscripciones", inscripcionService.listarInscripciones());
        model.addAttribute("docentes", profesorService.listarProfesores());
        model.addAttribute("cursos", cursoService.listarCursos());
        model.addAttribute("horarios", horarioService.listarHorarios());
        model.addAttribute("sedes", sedeService.listarSedes());
        return "cursos";
    }

    @PostMapping("/guardarInscripcion")
    public String guardarInscripcion(@ModelAttribute Inscripcion inscripcion) {
        inscripcionService.guardarInscripcion(inscripcion);
        return "redirect:/cursos";
    }

    @GetMapping("/editarInscripcion/{id}")
    public String editarInscripcion(@PathVariable Long id, Model model) {
        model.addAttribute("inscripcion", inscripcionService.obtenerInscripcion(id).orElse(new Inscripcion()));
        model.addAttribute("inscripciones", inscripcionService.listarInscripciones());
        model.addAttribute("docentes", profesorService.listarProfesores());
        model.addAttribute("cursos", cursoService.listarCursos());
        model.addAttribute("horarios", horarioService.listarHorarios());
        model.addAttribute("sedes", sedeService.listarSedes());
        return "cursos";
    }

    @GetMapping("/eliminarInscripcion/{id}")
    public String eliminarInscripcion(@PathVariable Long id) {
        inscripcionService.eliminarInscripcion(id);
        return "redirect:/cursos";
    }
}