package com.sawcunha.mapstruct.exemplo6;

import com.sawcunha.mapstruct.classes.Pais;
import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.dto.PessoaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(uses = TelefoneMapperExemplo6.class)
public interface PessoaMapperExemplo6 {

    PessoaMapperExemplo6 INSTANCIA =
            Mappers.getMapper(PessoaMapperExemplo6.class);

    static PessoaMapperExemplo6 meuMapeador() { return INSTANCIA; }

    @Mapping(source = "nomePais", target = "pais", qualifiedByName = "convertePais")
    @Mapping(source = "telefones", target = "telefones")
    Pessoa pessoaDTOParaPessoa(PessoaDTO pessoaDTO);

    @Named("convertePais")
    default Pais convertePais(String nomePais){
        String[] dadosPais = nomePais.split("-");

        return Pais.builder()
                .nome(dadosPais[1].trim())
                .id(
                        Long.parseLong(dadosPais[0].trim())
                )
                .build();
    }
}
