package com.sawcunha.mapstruct.exemplo5;

import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.dto.PessoaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = TelefoneMapperExemplo5.class)
public interface PessoaMapperExemplo5 {

    PessoaMapperExemplo5 INSTANCIA =
            Mappers.getMapper(PessoaMapperExemplo5.class);

    static PessoaMapperExemplo5 meuMapeador() { return INSTANCIA; }

    @Mapping(defaultExpression = "java(Boolean.FALSE)",
            target = "ativo")
    PessoaDTO pessoaParaPessoaDTO(Pessoa pessoa);

}
