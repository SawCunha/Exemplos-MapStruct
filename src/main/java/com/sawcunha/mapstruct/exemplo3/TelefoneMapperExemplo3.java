package com.sawcunha.mapstruct.exemplo3;

import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.TelefoneDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TelefoneMapperExemplo3 {

    TelefoneMapperExemplo3 INSTANCIA =
            Mappers.getMapper(TelefoneMapperExemplo3.class);

    static TelefoneMapperExemplo3 meuMapeador() { return INSTANCIA; }

    @Mapping(source = ".", target = "telefone", qualifiedByName = "converteTelefone")
    TelefoneDTO telefoneParaTelefoneDTO(Telefone telefone);

    @Named("converteTelefone")
    default String converteTelefone(Telefone telefone){
        return String.format("%s - (%s) %s", telefone.getDDI(), telefone.getDDD(), telefone.getNumero());
    }

}
