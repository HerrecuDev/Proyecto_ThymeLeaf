package org.iesdm.thymeleaf_practica.controller;

import org.iesdm.thymeleaf_practica.dto.ConfiguradorCocheDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Configurador")
public class ConfiguradorCocheController {
    //Recoge los datos
    @GetMapping("")
    private String configurar(Model model , @ModelAttribute ConfiguradorCocheDTO configurardocheDTO){


        model.addAttribute("ConfiguradorCocheDTO", configurardocheDTO);
        return "configurador";


    }

    //Los envia a la web :

    @PostMapping("")
    private String cambiarTapiceria(){


        return "configurador";
    }




}
