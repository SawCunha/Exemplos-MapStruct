package com.sawcunha.mapstruct.exemplo6;

import com.github.javafaker.Faker;
import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.dto.PessoaDTO;
import com.sawcunha.mapstruct.dto.TelefoneDTO;

import java.util.Collections;
import java.util.List;

public class ConversaoDTOParaEntity {


    private static final Faker FAKER = new Faker();
    public static void main(String[] args) {

        PessoaMapperExemplo6 pessoaMapperExemplo6 = PessoaMapperExemplo6.INSTANCIA;
        PessoaDTO pessoaDTO = createPessoaDTO();

        Pessoa pessoa = pessoaMapperExemplo6.pessoaDTOParaPessoa(pessoaDTO);

        System.out.println("Dados da PessoaDTO:");
        System.out.println(pessoaDTO);
        System.out.println("Dados da Pessoa:");
        System.out.println(pessoa);
    }

    private static PessoaDTO createPessoaDTO(){
        return PessoaDTO.builder()
                .ativo(true)
                .nome(FAKER.name().firstName())
                .sobrenome(FAKER.name().lastName())
                .usuario(FAKER.name().username())
                .nomePais(String.format("85 - %s", FAKER.country().name()))
                .telefones(createTelefoneDTOs())
                .build();
    }

    private static List<TelefoneDTO> createTelefoneDTOs(){
        return Collections.singletonList(createTelefoneDTO());
    }

    private static TelefoneDTO createTelefoneDTO(){
        return TelefoneDTO.builder()
                .telefone("55-(32) 3333-3333")
                .operadora("Pão de Queijo")
                .build();

    }

}
