package org.iesdm.thymeleaf_practica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HeladoDTO {

    private int porcentajeChocolate;
    private int porcentajeVainilla;
    private int porcentajefresa;
}
