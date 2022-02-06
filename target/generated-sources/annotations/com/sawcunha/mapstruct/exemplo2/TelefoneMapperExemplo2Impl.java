package com.sawcunha.mapstruct.exemplo2;

import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.TelefoneDTO;
import com.sawcunha.mapstruct.dto.TelefoneDTO.TelefoneDTOBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-06T17:02:32-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_322 (Amazon.com Inc.)"
)
public class TelefoneMapperExemplo2Impl implements TelefoneMapperExemplo2 {

    @Override
    public TelefoneDTO telefoneParaTelefoneDTO(Telefone telefone) {
        if ( telefone == null ) {
            return null;
        }

        TelefoneDTOBuilder telefoneDTO = TelefoneDTO.builder();

        if ( telefone.getNumero() != null ) {
            telefoneDTO.telefone( String.valueOf( telefone.getNumero() ) );
        }
        telefoneDTO.operadora( telefone.getOperadora() );

        return telefoneDTO.build();
    }
}
