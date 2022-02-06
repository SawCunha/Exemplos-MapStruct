package com.sawcunha.mapstruct.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TelefoneDTO {

    private String operadora;
    private String telefone;

}
