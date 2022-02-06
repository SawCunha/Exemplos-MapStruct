package com.sawcunha.mapstruct.exemplo2;

import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.dto.PessoaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = TelefoneMapperExemplo2.class)
public interface PessoaMapperExemplo2 {

    PessoaMapperExemplo2 INSTANCIA =
            Mappers.getMapper(PessoaMapperExemplo2.class);

    static PessoaMapperExemplo2 meuMapeador() { return INSTANCIA; }

    PessoaDTO pessoaParaPessoaDTO(Pessoa pessoa);

}
