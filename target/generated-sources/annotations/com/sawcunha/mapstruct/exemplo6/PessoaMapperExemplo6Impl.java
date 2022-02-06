package com.sawcunha.mapstruct.exemplo6;

import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.classes.Pessoa.PessoaBuilder;
import com.sawcunha.mapstruct.dto.PessoaDTO;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-06T17:14:51-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_322 (Amazon.com Inc.)"
)
public class PessoaMapperExemplo6Impl implements PessoaMapperExemplo6 {

    private final TelefoneMapperExemplo6 telefoneMapperExemplo6 = Mappers.getMapper( TelefoneMapperExemplo6.class );

    @Override
    public Pessoa pessoaDTOParaPessoa(PessoaDTO pessoaDTO) {
        if ( pessoaDTO == null ) {
            return null;
        }

        PessoaBuilder pessoa = Pessoa.builder();

        pessoa.pais( convertePais( pessoaDTO.getNomePais() ) );
        pessoa.telefones( telefoneMapperExemplo6.telefoneDTOsParaTelefones( pessoaDTO.getTelefones() ) );
        pessoa.nome( pessoaDTO.getNome() );
        pessoa.sobrenome( pessoaDTO.getSobrenome() );
        pessoa.usuario( pessoaDTO.getUsuario() );
        pessoa.ativo( pessoaDTO.getAtivo() );

        return pessoa.build();
    }
}
