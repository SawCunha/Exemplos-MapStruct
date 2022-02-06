package com.sawcunha.mapstruct.exemplo5;

import com.github.javafaker.Faker;
import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.PessoaDTO;

import java.util.ArrayList;
import java.util.List;

public class ConversaoComValorParaCasosDeVariaveisNullEntityParaDto {


    private static final Faker FAKER = new Faker();
    public static void main(String[] args) {

        PessoaMapperExemplo5 pessoaMapperExemplo5 = PessoaMapperExemplo5.INSTANCIA;
        Pessoa pessoa = criaPessoa(null);

        PessoaDTO pessoaDTO = pessoaMapperExemplo5.pessoaParaPessoaDTO(pessoa);

        System.out.println("ATIVO NAO INFORMADO");
        System.out.println("Dado da Pessoa:");
        System.out.println(pessoa);
        System.out.println("Dado da PessoaDTO:");
        System.out.println(pessoaDTO);

        pessoa = criaPessoa(true);

        pessoaDTO = pessoaMapperExemplo5.pessoaParaPessoaDTO(pessoa);

        System.out.println("ATIVO INFORMADO");
        System.out.println("Dado da Pessoa:");
        System.out.println(pessoa);
        System.out.println("Dado da PessoaDTO:");
        System.out.println(pessoaDTO);

    }

    private static Pessoa criaPessoa(Boolean ativo){
        return Pessoa.builder()
                .nome(FAKER.name().firstName())
                .sobrenome(FAKER.name().lastName())
                .usuario(FAKER.name().username())
                .telefones(criaTelefones())
                .ativo(ativo)
                .build();
    }

    private static List<Telefone> criaTelefones(){
        List<Telefone> telefones = new ArrayList<>();
        telefones.add(criaTelefone());
        return telefones;
    }

    private static Telefone criaTelefone(){
        return Telefone.builder()
                .DDD(32)
                .DDI(55)
                .numero(33333333L)
                .operadora("Fluker")
                .build();

    }

}
