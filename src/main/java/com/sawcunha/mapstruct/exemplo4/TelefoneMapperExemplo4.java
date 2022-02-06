package com.sawcunha.mapstruct.exemplo4;

import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.TelefoneDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TelefoneMapperExemplo4 {

    TelefoneMapperExemplo4 INSTANCIA =
            Mappers.getMapper(TelefoneMapperExemplo4.class);

    static TelefoneMapperExemplo4 meuMapeador() { return INSTANCIA; }

    @Mapping(target = "telefone", expression = "java(telefone.getTelefone())")
    TelefoneDTO telefoneParaTelefoneDTO(Telefone telefone);
}
