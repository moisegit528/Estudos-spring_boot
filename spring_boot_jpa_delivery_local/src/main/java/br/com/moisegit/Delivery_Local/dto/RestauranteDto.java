package br.com.moisegit.Delivery_Local.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestauranteDto {

        @NotNull
        private UUID id;
        @NotNull
        private String nome;
        @NotNull
        private String telefone;
        @NotNull
        private String endereco;
}
