package org.iesdm.thymeleaf_practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.thymeleaf_practica.dto.HeladoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller

@RequestMapping("/helado")
public class HeladoController {
    @GetMapping("")
    private String porcentajesHelado(Model model , @ModelAttribute HeladoDTO heladoDTO){

        model.addAttribute("HeladoDTO" , heladoDTO);

        return "helado";
    }


    @PostMapping("")
    private String generarHelado(Model model , @ModelAttribute HeladoDTO heladoDTO){

        int porcentajeChocolate = heladoDTO.getPorcentajeChocolate();
        int porcentajeFresa = heladoDTO.getPorcentajefresa();
        int porcentajeVainilla = heladoDTO.getPorcentajeVainilla();

        int sumaPorcentajes = porcentajeChocolate + porcentajeFresa + porcentajeVainilla;
        //Añado los datos al html :
        model.addAttribute("HeladoDTO" , heladoDTO);
        model.addAttribute("sumaPorcentajes" , sumaPorcentajes);
        model.addAttribute("porcentajeChocolate", porcentajeChocolate);
        model.addAttribute("porcentajefresa", porcentajeFresa);
        model.addAttribute("porcentajeVainilla", porcentajeVainilla);

        if(sumaPorcentajes > 100){

            model.addAttribute("La suma de los porcentajes supera el 100% es imposible realizar el helado");
        }




        return "helado";
    }
}




