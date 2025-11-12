package org.iesdm.thymeleaf_practica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaludoDTO {

    //Dto Data transfer Object

        private String nombre;
        private String idioma;



}
