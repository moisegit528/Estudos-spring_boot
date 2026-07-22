package br.com.moisegit.Delivery_Local.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntregadorDto {

    private String nome;
    private String tipoveiculo;
    private int telefone;
}
