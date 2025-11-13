package org.iesdm.thymeleaf_practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.thymeleaf_practica.dto.EcuacionDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller

@RequestMapping("/ecuacion")
public class EcuaciónController {

    //Ruta ecuacion/obtener:

    @GetMapping("/formulario")
    public String formulario(Model model ,@ModelAttribute EcuacionDTO ecuacionDTO){

        model.addAttribute("ecuacionDTO" , ecuacionDTO);
        return "ecuacion";
    }

    @PostMapping("/formulario/enviar")

    public String formularioEnviar(){



        return "ecuacion";
    }

}
