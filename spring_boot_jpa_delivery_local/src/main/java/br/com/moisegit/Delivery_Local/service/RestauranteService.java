package br.com.moisegit.Delivery_Local.service;

import br.com.moisegit.Delivery_Local.dto.RestauranteDto;
import br.com.moisegit.Delivery_Local.exception.NotFoundException;
import br.com.moisegit.Delivery_Local.model.RestauranteEntity;
import br.com.moisegit.Delivery_Local.repository.RestauranteRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Data
@Service
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;

    public List<RestauranteEntity> findAll() {
        return restauranteRepository.findAll();
    }

    public void save (RestauranteDto  restauranteDto) {
        restauranteRepository.save(RestauranteEntity.builder()
                        .nome(restauranteDto.getNome())
                        .telefone(restauranteDto.getTelefone())
                        .endereco(restauranteDto.getEndereco())
                .build());
    }

    public void restauranteAtivo(RestauranteDto restauranteDto) throws NotFoundException {
        RestauranteEntity restaurante = restauranteRepository.findById(restauranteDto.getId())
                .orElseThrow(() -> new NotFoundException("Restaurante não encontrado"));
    }

}
