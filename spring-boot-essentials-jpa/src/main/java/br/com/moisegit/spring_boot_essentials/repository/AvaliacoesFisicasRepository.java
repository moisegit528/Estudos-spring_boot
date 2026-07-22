package br.com.moisegit.spring_boot_essentials.repository;

import br.com.moisegit.spring_boot_essentials.model.AvaliacoesFisicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacoesFisicasRepository extends JpaRepository<AvaliacoesFisicasEntity, Integer> {
}
