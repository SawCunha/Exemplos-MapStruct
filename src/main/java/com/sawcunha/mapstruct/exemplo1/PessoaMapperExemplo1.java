package com.sawcunha.mapstruct.exemplo1;

import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.dto.PessoaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PessoaMapperExemplo1 {

    PessoaMapperExemplo1 INSTANCIA =
            Mappers.getMapper(PessoaMapperExemplo1.class);

    static PessoaMapperExemplo1 meuMapeador() { return INSTANCIA; }

    PessoaDTO pessoaParaPessoaDTO(Pessoa pessoa);

}
