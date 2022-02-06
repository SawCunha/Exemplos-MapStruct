package com.sawcunha.mapstruct.exemplo2;

import com.github.javafaker.Faker;
import com.sawcunha.mapstruct.classes.Pessoa;
import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.PessoaDTO;

import java.util.ArrayList;
import java.util.List;

public class ComMapeamentoDeValoresDoEntityParaDto {


    private static final Faker FAKER = new Faker();
    public static void main(String[] args) {

        PessoaMapperExemplo2 pessoaMapperExemplo1 = PessoaMapperExemplo2.INSTANCIA;
        Pessoa pessoa = criaPessoa();

        PessoaDTO pessoaDTO = pessoaMapperExemplo1.pessoaParaPessoaDTO(pessoa);

        System.out.println("Dado da Pessoa:");
        System.out.println(pessoa);
        System.out.println("Dado da PessoaDTO:");
        System.out.println(pessoaDTO);

    }

    private static Pessoa criaPessoa(){
        return Pessoa.builder()
                .nome(FAKER.name().firstName())
                .sobrenome(FAKER.name().lastName())
                .usuario(FAKER.name().username())
                .telefones(criaTelefones())
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
