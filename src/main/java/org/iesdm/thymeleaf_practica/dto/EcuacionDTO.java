package org.iesdm.thymeleaf_practica.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EcuacionDTO {

    @NotNull
    private BigDecimal a;
    @NotNull
    private BigDecimal b;
    @NotNull
    private BigDecimal c;


    //Sin validacion :

    private BigDecimal raiz1;
    private BigDecimal raiz2;


}
