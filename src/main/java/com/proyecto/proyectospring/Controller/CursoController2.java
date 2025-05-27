package com.proyecto.proyectospring.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CursoController2 {
   /* List<CursoRegistro> registros = new ArrayList<>();

    @GetMapping("/index")
    public String verFormulario(Model model) {
        model.addAttribute("registro", new CursoRegistro());
        model.addAttribute("registros", registros);
        return "index"; // Carga index.html
    }

    @PostMapping("/guardarCurso")
    public String guardarCurso(@ModelAttribute CursoRegistro registro, Model model) {
        registros.add(registro);
        return "redirect:/index"; // Redirige a la página de inicio después de guardar

    }*/

}
