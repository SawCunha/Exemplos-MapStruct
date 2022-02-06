package com.sawcunha.mapstruct.exemplo3;

import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.PessoaDTO;
import com.sawcunha.mapstruct.dto.PessoaDTO.PessoaDTOBuilder;
import com.sawcunha.mapstruct.dto.TelefoneDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-06T17:02:31-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_322 (Amazon.com Inc.)"
)
public class PessoaMapperExemplo3Impl implements PessoaMapperExemplo3 {

    private final TelefoneMapperExemplo3 telefoneMapperExemplo3 = Mappers.getMapper( TelefoneMapperExemplo3.class );

    @Override
    public PessoaDTO pessoaParaPessoaDTO(Pessoa pessoa) {
        if ( pessoa == null ) {
            return null;
        }

        PessoaDTOBuilder pessoaDTO = PessoaDTO.builder();

        pessoaDTO.nome( pessoa.getNome() );
        pessoaDTO.sobrenome( pessoa.getSobrenome() );
        pessoaDTO.usuario( pessoa.getUsuario() );
        pessoaDTO.ativo( pessoa.getAtivo() );
        pessoaDTO.telefones( telefoneListToTelefoneDTOList( pessoa.getTelefones() ) );

        return pessoaDTO.build();
    }

    protected List<TelefoneDTO> telefoneListToTelefoneDTOList(List<Telefone> list) {
        if ( list == null ) {
            return null;
        }

        List<TelefoneDTO> list1 = new ArrayList<TelefoneDTO>( list.size() );
        for ( Telefone telefone : list ) {
            list1.add( telefoneMapperExemplo3.telefoneParaTelefoneDTO( telefone ) );
        }

        return list1;
    }
}
