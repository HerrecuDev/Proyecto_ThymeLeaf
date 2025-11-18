package org.iesdm.thymeleaf_practica.controller;

import org.iesdm.thymeleaf_practica.dto.AjedrezDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/ajedrez")
public class AjedrezController {

    @GetMapping("")
    private String posiciones(Model model , @ModelAttribute AjedrezDTO ajedrezDTO){

        // Etiquetas de columnas y filas
        List<String> columnas = Arrays.asList("a","b","c","d","e","f","g","h");
        List<Integer> filas = Arrays.asList(8,7,6,5,4,3,2,1); // filas etiquetadas 8..1

        int filaAlfil = (int)(Math.random()*8);
        int columnaAlfil = (int)(Math.random()*8);

        int filaCaballo;
        int columnaCaballo;

        do {
            filaCaballo = (int)(Math.random()*8);
            columnaCaballo = (int)(Math.random()*8);
        }while(filaAlfil == filaCaballo && columnaAlfil == columnaCaballo);


        model.addAttribute("filas" , filas);
        model.addAttribute("columnas" , columnas);

        model.addAttribute("filaAlfil" , filaAlfil);
        model.addAttribute("columnaAlfil" , columnaAlfil);

        model.addAttribute("filaCaballo" , filaCaballo);
        model.addAttribute("columnaCaballo" , columnaCaballo);

        return "ajedrez";
    }

    @PostMapping("")
    private String pintarFigura(Model model , @ModelAttribute AjedrezDTO ajedrezDTO){


        return "/ajedrez";
    }

    //Enviamos los datos al html :





}
