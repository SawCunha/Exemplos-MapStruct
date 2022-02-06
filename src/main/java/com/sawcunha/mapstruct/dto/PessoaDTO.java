package com.sawcunha.mapstruct.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PessoaDTO {

    private String nome;
    private String sobrenome;
    private String usuario;
    private Boolean ativo;
    private String nomePais;
    private List<TelefoneDTO> telefones;

}
