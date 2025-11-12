package org.iesdm.thymeleaf_practica.controller;

import org.iesdm.thymeleaf_practica.dto.CalculadoraDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculadoraController {

    @GetMapping("/calculadora")
    public String calcular(Model mopdel , @ModelAttribute CalculadoraDTO calculadoraDTO){


        return "calculadora";
    }

    @PostMapping("/calculadora")
    public String calcularSubmit(Model model , @ModelAttribute CalculadoraDTO calculadoraDTO){

        void notaMedia(){
             double suma =

        }

        return "calculadora";
    }



}
