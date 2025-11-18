package org.iesdm.thymeleaf_practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.thymeleaf_practica.dto.TablaMultiplicarDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/tabla")

public class TablaMultiplicarController {

    //Recogemos los datos
    @GetMapping("")
    private String recogerNumero(Model model , @ModelAttribute TablaMultiplicarDTO tablaMultiplicarDTO){

        model.addAttribute("tablaMultiplicarDTO" , tablaMultiplicarDTO);
        return "tabla";
    }

    //Delvolvemos en el html

    @PostMapping("")

    private String calcularTabla(Model model , @ModelAttribute TablaMultiplicarDTO tablaMultiplicarDTO){


        int numero = tablaMultiplicarDTO.getNumero();

        //Genero un ArrayList para introducir en el cada uno de los resultados :
        List<String> resultado = new ArrayList<>();

        for (int i = 1; i <= 10 ; i++) {

            resultado.add(numero + "x" + i + "=" + (numero*i));

        }

        model.addAttribute("resultado" , resultado);

        //Enviamos al html
        return "tabla";
    }

}
