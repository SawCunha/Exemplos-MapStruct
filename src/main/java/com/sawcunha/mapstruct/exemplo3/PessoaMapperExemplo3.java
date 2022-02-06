package com.sawcunha.mapstruct.exemplo3;

import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.dto.PessoaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = TelefoneMapperExemplo3.class)
public interface PessoaMapperExemplo3 {

    PessoaMapperExemplo3 INSTANCIA =
            Mappers.getMapper(PessoaMapperExemplo3.class);

    static PessoaMapperExemplo3 meuMapeador() { return INSTANCIA; }

    PessoaDTO pessoaParaPessoaDTO(Pessoa pessoa);

}
