package com.proyecto.proyectospring.Controller;

import com.proyecto.proyectospring.model.Cursos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class Controladores {
    @RequestMapping("/")
    public String index() {
        return "index"; // Carga index.html
    }

    @RequestMapping("/nosotros")
    public String nosotros() {
        return "nosotros"; // Carga nosotros.html
    }

    @RequestMapping("/servicios")
    public String servicios() {
        return "servicios"; // Carga servicios.html
    }


}
