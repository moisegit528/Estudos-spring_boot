package br.com.moisegit.Delivery_Local.repository;

import br.com.moisegit.Delivery_Local.model.EntregadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntregadorRepository extends JpaRepository<EntregadorEntity, UUID> {
}
