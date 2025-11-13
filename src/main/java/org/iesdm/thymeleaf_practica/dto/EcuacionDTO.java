package org.iesdm.thymeleaf_practica.dto;

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

    private BigDecimal a;
    private BigDecimal b;
    private BigDecimal c;



}
