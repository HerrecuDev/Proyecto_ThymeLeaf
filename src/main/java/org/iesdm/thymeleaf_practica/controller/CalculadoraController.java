package org.iesdm.thymeleaf_practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.thymeleaf_practica.dto.CalculadoraDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Slf4j
@Controller
public class CalculadoraController {

    @GetMapping("/calculadora")
    public String calcular(Model model , @ModelAttribute CalculadoraDTO calculadoraDTO){


        return "calculadora";
    }

    @PostMapping("/calculadora")
    public String calcularSubmit(Model model , @ModelAttribute CalculadoraDTO calculadoraDTO){

       double media = (calculadoraDTO.getNota1() + calculadoraDTO.getNota2() + calculadoraDTO.getNota3()) /3;

        String mediaFormateada = String.format("%.2f" , media);

       //Le asigno al valor al model :

        model.addAttribute( "media","La nota media = " + mediaFormateada);

        log.info(calculadoraDTO.toString());
        return "calculadora";
    }



}
