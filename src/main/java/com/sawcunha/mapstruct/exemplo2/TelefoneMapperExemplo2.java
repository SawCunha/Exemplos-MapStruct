package com.sawcunha.mapstruct.exemplo2;

import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.TelefoneDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TelefoneMapperExemplo2 {

    TelefoneMapperExemplo2 INSTANCIA =
            Mappers.getMapper(TelefoneMapperExemplo2.class);

    static TelefoneMapperExemplo2 meuMapeador() { return INSTANCIA; }

    @Mapping(source = "numero", target = "telefone")
    TelefoneDTO telefoneParaTelefoneDTO(Telefone telefone);

}
