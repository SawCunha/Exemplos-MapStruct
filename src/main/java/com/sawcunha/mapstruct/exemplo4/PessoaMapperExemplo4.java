package com.sawcunha.mapstruct.exemplo4;

import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.dto.PessoaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = TelefoneMapperExemplo4.class)
public interface PessoaMapperExemplo4 {

    PessoaMapperExemplo4 INSTANCIA =
            Mappers.getMapper(PessoaMapperExemplo4.class);

    static PessoaMapperExemplo4 meuMapeador() { return INSTANCIA; }

    PessoaDTO pessoaParaPessoaDTO(Pessoa pessoa);

}
