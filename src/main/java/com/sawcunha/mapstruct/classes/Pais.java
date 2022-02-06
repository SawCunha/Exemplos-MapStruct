package com.sawcunha.mapstruct.classes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pais {

    private Long id;
    private String nome;

}
