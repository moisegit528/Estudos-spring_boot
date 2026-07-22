package br.com.moisegit.Delivery_Local.repository;

import br.com.moisegit.Delivery_Local.model.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoRepository extends JpaRepository<PedidoEntity, UUID> {
}
