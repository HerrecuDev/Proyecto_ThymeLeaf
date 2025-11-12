package org.iesdm.thymeleaf_practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SaludosController {

    //Generamos el Empoint para la ruta http://local:8080/saludo

    @GetMapping("/saludo")
    public String saludar(Model model){





        return "saludo";
    }

    @PostMapping("/saludos")

    public String

}
