package org.iesdm.thymeleaf_practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.thymeleaf_practica.dto.EcuacionDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.math.MathContext;


@Slf4j
@Controller

@RequestMapping("/ecuacion")
public class EcuacionController {

    //Ruta ecuacion/obtener:

    @GetMapping("/formulario")
    public String formulario(Model model ,@ModelAttribute EcuacionDTO ecuacionDTO){

        model.addAttribute("ecuacionDTO" , ecuacionDTO);
        return "ecuacion";
    }

    @PostMapping("/formulario/enviar")

    public String formularioEnviar(Model model ,@ModelAttribute EcuacionDTO ecuacionDTO){


        BigDecimal a = ecuacionDTO.getA();
        BigDecimal b = ecuacionDTO.getB();
        BigDecimal c = ecuacionDTO.getC();

        BigDecimal discriminante = b.pow(2).subtract(BigDecimal.valueOf(4).multiply(a).multiply(c));
        if (discriminante.compareTo(BigDecimal.ZERO) >= 0){

            BigDecimal raizDiscriminante = discriminante.sqrt(MathContext.DECIMAL128);

            BigDecimal raiz1 = b.negate().add(raizDiscriminante).divide(BigDecimal.valueOf(2).multiply(a),MathContext.DECIMAL128);
            BigDecimal raiz2 = b.negate().subtract(raizDiscriminante).divide(BigDecimal.valueOf(2).multiply(a) , MathContext.DECIMAL128);



            model.addAttribute("raiz1" , raiz1);
            model.addAttribute("raiz2" , raiz2);
        }else{

            model.addAttribute("msg" ,"Ec sin soluciones" );
        }

        log.info(ecuacionDTO.toString());
        return "ecuacion";
    }

}
