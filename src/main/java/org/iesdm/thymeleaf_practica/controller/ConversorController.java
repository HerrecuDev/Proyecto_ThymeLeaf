package org.iesdm.thymeleaf_practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.thymeleaf_practica.dto.ConversorDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ConversorController {

    @GetMapping("/cambioMoneda")
    public String cambiarEfectivo(Model model , @ModelAttribute ConversorDTO conversorDTO){


        return "cambioMoneda";
    }

    @PostMapping("/cambioMoneda")
    public String cambioMoneda(Model model , @ModelAttribute ConversorDTO conversorDTO){
    //Actualmente 1USD = 0.92€ :
        double divisa€ = 0.92;
        double cambio = conversorDTO.getDolares() * divisa€;
        String redondearImporte = String.format("%.2f" , cambio);
        model.addAttribute("cambio" , "El valor en euros = " + redondearImporte + "€");

        log.info(conversorDTO.toString());

        return "/cambioMoneda";
    }
}
