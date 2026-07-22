package br.com.moisegit.Delivery_Local.dto;

import br.com.moisegit.Delivery_Local.repository.ClienteRepository;
import br.com.moisegit.Delivery_Local.service.ClienteService;
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
public class ClienteDto {

    @NotNull
    private UUID id;
    @NotNull
    private String nome;
    @NotNull
    private String endereco;
    @NotNull
    private String telefone;
}
