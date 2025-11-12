package org.iesdm.thymeleaf_practica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CalculadoraDTO {
    private double nota1;
    private double nota2;
    private double nota3;

}
