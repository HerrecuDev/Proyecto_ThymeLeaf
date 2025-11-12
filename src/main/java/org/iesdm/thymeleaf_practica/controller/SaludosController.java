package org.iesdm.thymeleaf_practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.thymeleaf_practica.dto.SaludoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Slf4j
@Controller
public class SaludosController {

    //Generamos el Empoint para la ruta http://local:8080/saludo

    @GetMapping("/saludos")
    public String saludar(Model model ,@ModelAttribute SaludoDTO saludoDTO){





        return "saludos";
    }

    @PostMapping("/saludos")

    public String saludosSubmit(Model model,@ModelAttribute SaludoDTO saludoDTO){

        log.info(saludoDTO.toString());

        return "saludos";
    }

}
