package com.sawcunha.mapstruct.exemplo6;

import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.classes.Telefone.TelefoneBuilder;
import com.sawcunha.mapstruct.dto.TelefoneDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-06T17:19:36-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_322 (Amazon.com Inc.)"
)
public class TelefoneMapperExemplo6Impl implements TelefoneMapperExemplo6 {

    @Override
    public List<Telefone> telefoneDTOsParaTelefones(List<TelefoneDTO> telefoneDTOs) {
        if ( telefoneDTOs == null ) {
            return null;
        }

        List<Telefone> list = new ArrayList<Telefone>( telefoneDTOs.size() );
        for ( TelefoneDTO telefoneDTO : telefoneDTOs ) {
            list.add( telefoneDTOParaTelefone( telefoneDTO ) );
        }

        return list;
    }

    @Override
    public Telefone telefoneDTOParaTelefone(TelefoneDTO telefoneDTO) {
        if ( telefoneDTO == null ) {
            return null;
        }

        TelefoneBuilder telefone = Telefone.builder();

        telefone.DDI( converteDDI( telefoneDTO.getTelefone() ) );
        telefone.DDD( converteDDD( telefoneDTO.getTelefone() ) );
        telefone.numero( converteNumero( telefoneDTO.getTelefone() ) );
        telefone.operadora( telefoneDTO.getOperadora() );

        return telefone.build();
    }
}
