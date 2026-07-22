package br.com.moisegit.Delivery_Local.repository;

import br.com.moisegit.Delivery_Local.model.RestauranteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RestauranteRepository extends JpaRepository<RestauranteEntity, UUID> {
}
