package com.sawcunha.mapstruct.exemplo4;

import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.TelefoneDTO;
import com.sawcunha.mapstruct.dto.TelefoneDTO.TelefoneDTOBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-06T17:02:31-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_322 (Amazon.com Inc.)"
)
public class TelefoneMapperExemplo4Impl implements TelefoneMapperExemplo4 {

    @Override
    public TelefoneDTO telefoneParaTelefoneDTO(Telefone telefone) {
        if ( telefone == null ) {
            return null;
        }

        TelefoneDTOBuilder telefoneDTO = TelefoneDTO.builder();

        telefoneDTO.operadora( telefone.getOperadora() );

        telefoneDTO.telefone( telefone.getTelefone() );

        return telefoneDTO.build();
    }
}
