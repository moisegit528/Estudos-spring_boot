package br.com.moisegit.Delivery_Local.service;

import br.com.moisegit.Delivery_Local.dto.ClienteDto;
import br.com.moisegit.Delivery_Local.dto.PedidoDto;
import br.com.moisegit.Delivery_Local.model.ClienteEntity;
import br.com.moisegit.Delivery_Local.repository.ClienteRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Data
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public List<ClienteEntity> findAll(){
        return clienteRepository.findAll();
    }

    public void save(ClienteDto clienteDto) {
        clienteRepository.save(ClienteEntity.builder()
                        .nome(clienteDto.getNome())
                        .endereco(clienteDto.getEndereco())
                        .telefone(clienteDto.getTelefone())
                .build());

    }

}
