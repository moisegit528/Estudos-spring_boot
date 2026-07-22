package br.com.moisegit.Delivery_Local.service;

import br.com.moisegit.Delivery_Local.dto.EntregadorDto;
import br.com.moisegit.Delivery_Local.model.EntregadorEntity;
import br.com.moisegit.Delivery_Local.repository.EntregadorRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Data
@Service
public class EntregadorService {

    private final EntregadorRepository entregadorRepository;

    public List<EntregadorEntity> findAll() {
        return entregadorRepository.findAll();
    }

    public void save(EntregadorDto  entregadorDto) {
        entregadorRepository.save(EntregadorEntity.builder()
                        .nome(entregadorDto.getNome())
                        .telefone(entregadorDto.getTelefone())
                        .tipoveiculo(entregadorDto.getTipoveiculo())
                .build());
    }
}
