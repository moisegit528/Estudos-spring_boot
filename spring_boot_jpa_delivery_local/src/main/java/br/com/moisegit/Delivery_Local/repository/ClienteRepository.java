package br.com.moisegit.Delivery_Local.repository;

import br.com.moisegit.Delivery_Local.dto.ClienteDto;
import br.com.moisegit.Delivery_Local.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<ClienteEntity, UUID> {
}
