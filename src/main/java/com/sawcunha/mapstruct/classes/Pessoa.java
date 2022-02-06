package com.sawcunha.mapstruct.classes;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Pessoa {

    private String nome;
    private String sobrenome;
    private String usuario;
    private Boolean ativo;
    private List<Telefone> telefones;
    private Pais pais;

}
