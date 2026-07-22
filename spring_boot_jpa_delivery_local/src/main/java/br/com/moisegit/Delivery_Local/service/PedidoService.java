package br.com.moisegit.Delivery_Local.service;

import br.com.moisegit.Delivery_Local.dto.ClienteDto;
import br.com.moisegit.Delivery_Local.dto.PedidoDto;
import br.com.moisegit.Delivery_Local.dto.RestauranteDto;
import br.com.moisegit.Delivery_Local.exception.NotFoundException;
import br.com.moisegit.Delivery_Local.model.ClienteEntity;
import br.com.moisegit.Delivery_Local.model.PedidoEntity;
import br.com.moisegit.Delivery_Local.model.RestauranteEntity;
import br.com.moisegit.Delivery_Local.repository.ClienteRepository;
import br.com.moisegit.Delivery_Local.repository.PedidoRepository;
import br.com.moisegit.Delivery_Local.repository.RestauranteRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Data
@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final RestauranteRepository restauranteRepository;

    public List<PedidoEntity> findAll(){
        return pedidoRepository.findAll();
    }

    public void save (PedidoDto pedidoDto) {
        pedidoRepository.save(PedidoEntity.builder()
                        .nomedoitem(pedidoDto.getNomeitem())
                        .quantidade(pedidoDto.getQuantidade())
                        .valorTotal(pedidoDto.getValorTotal())
                .build());
    }

    public void clienteCadastrado(ClienteDto clienteDto) throws NotFoundException {
        ClienteEntity cliente =  clienteRepository.findById(clienteDto.getId())
                .orElseThrow(() -> new NotFoundException("Cliente não encontrado"));
    }
    public void restauranteCadastrado(RestauranteDto restauranteDto) throws NotFoundException {
        RestauranteEntity restaurante = restauranteRepository.findById(restauranteDto.getId())
            .orElseThrow(() -> new NotFoundException("Restaurante não encontrado"));
    }
}
