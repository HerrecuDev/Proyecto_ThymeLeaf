package org.iesdm.thymeleaf_practica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfiguradorCocheDTO {

    //COlores :
    private String blanco;
    private String negro;
    private String berenjena;

    //Tapiceria :
    private String madera;
    private String carbono;
}
