package org.iesdm.thymeleaf_practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.thymeleaf_practica.dto.TablaMultiplicarDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/tablaMultiplicar")

public class TablaMultiplicarController {

    //Recogemos los datos
    @GetMapping()
    private String recogerNumero(Model model , @ModelAttribute TablaMultiplicarDTO tablaMultiplicarDTO){

        return "tablaMultiplicar";
    }

    //Delvolvemos en el html

    private String calcularTabla(Model model , @ModelAttribute TablaMultiplicarDTO tablaMultiplicarDTO){


        return "tablaMultiplicar";
    }

}
