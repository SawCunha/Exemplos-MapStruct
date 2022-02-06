package com.sawcunha.mapstruct.exemplo5;

import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.TelefoneDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TelefoneMapperExemplo5 {

    TelefoneMapperExemplo5 INSTANCIA =
            Mappers.getMapper(TelefoneMapperExemplo5.class);

    static TelefoneMapperExemplo5 meuMapeador() { return INSTANCIA; }

    @Mapping(target = "telefone", expression = "java(telefone.getTelefone())")
    TelefoneDTO telefoneParaTelefoneDTO(Telefone telefone);
}
