package com.proyecto.proyectospring.Controller;

import com.proyecto.proyectospring.model.CursoRegistro;
import com.proyecto.proyectospring.model.Cursos;
import com.proyecto.proyectospring.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CursoController {

    private final CursoService cursoService;

    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/cursos")
    public String mostrarCursos(Model model) {
        model.addAttribute("registro", new CursoRegistro());
        model.addAttribute("registros", cursoService.listarCursos());
        return "cursos"; // Carga cursos.html
    }

    @GetMapping("/eliminar")
    public String eliminarCurso(@RequestParam Long id) {
        cursoService.eliminarCurso(id);
        return "redirect:/cursos";
    }
    @PostMapping("/guardarCurso")
    public String guardarCurso(@ModelAttribute CursoRegistro registro) {
        cursoService.guardarCurso(registro);
        return "redirect:/cursos";
    }



    /*private List<Cursos> obtenerListaCursos(Model model) {
        return List.of(
                new Cursos("Java", 200, "Curso de Java", "3 meses", "Intermedio", "Online"),
                new Cursos("Python", 150, "Curso de Python", "2 meses", "Principiante", "Presencial"),
                new Cursos("JavaScript", 180, "Curso de JavaScript", "1 mes", "Avanzado", "Online"),
                new Cursos("C++", 220, "Curso de C++", "4 meses", "Intermedio", "Presencial")
        );
    }*/
}