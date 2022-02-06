package com.sawcunha.mapstruct.exemplo6;

import com.sawcunha.mapstruct.classes.Telefone;
import com.sawcunha.mapstruct.dto.TelefoneDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TelefoneMapperExemplo6 {

    TelefoneMapperExemplo6 INSTANCIA =
            Mappers.getMapper(TelefoneMapperExemplo6.class);

    static TelefoneMapperExemplo6 meuMapeador() { return INSTANCIA; }

    List<Telefone> telefoneDTOsParaTelefones(List<TelefoneDTO> telefoneDTOs);

    @Mapping(source = "telefone", target = "DDI", qualifiedByName = "converteDDI")
    @Mapping(source = "telefone", target = "DDD", qualifiedByName = "converteDDD")
    @Mapping(source = "telefone", target = "numero", qualifiedByName = "converteNumero")
    Telefone telefoneDTOParaTelefone(TelefoneDTO telefoneDTO);

    @Named("converteDDI")
    default Integer converteDDI(String telefone){
        return Integer.parseInt(telefone.split("-")[0].trim());
    }

    @Named("converteDDD")
    default Integer converteDDD(String telefone){
        String[] dadosTelefone = telefone.split("-");
        String DDD = dadosTelefone[1].split(" ")[0].trim();
        DDD = DDD.replace("(", "");
        DDD = DDD.replace(")", "");
        return Integer.parseInt(DDD);
    }

    @Named("converteNumero")
    default Long converteNumero(String telefone){
        String[] dadosTelefone = telefone.split("-");
        String primeiraParte = dadosTelefone[1].split(" ")[1].trim();
        String segundaParte = dadosTelefone[2].trim();

        String numero = String.format("%s%s",primeiraParte, segundaParte);
        return Long.parseLong(numero);
    }
}
