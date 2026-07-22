package br.com.moisegit.Delivery_Local.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {

    private String nomeitem;
    private int quantidade;
    private BigDecimal valorTotal;
}
