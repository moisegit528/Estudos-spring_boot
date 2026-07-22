package br.com.moisegit.spring_boot_essentials.repository;

import br.com.moisegit.spring_boot_essentials.model.AlunosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository<AlunosEntity, Integer> {
}
