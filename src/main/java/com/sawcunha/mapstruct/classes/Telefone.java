package com.sawcunha.mapstruct.classes;

import lombok.Builder;
import lombok.Data;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

@Data
@Builder
public class Telefone {

    private String operadora;
    private Integer DDD;
    private Integer DDI;
    private Long numero;

    public String getTelefone() {
        String telefone = String.format("%s%s%s", this.getDDI(), this.getDDD(), this.getNumero());
        String mascara = "##-(##) ####-####";
        MaskFormatter maskFormatter= null;
        try {
            maskFormatter = new MaskFormatter(mascara);
            maskFormatter.setValueContainsLiteralCharacters(false);
            return maskFormatter.valueToString(telefone);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

}
