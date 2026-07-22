package br.com.moisegit.spring_boot_essentials.repository;

import br.com.moisegit.spring_boot_essentials.model.TreinosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinosRepository extends JpaRepository<TreinosEntity, Integer> {
}
