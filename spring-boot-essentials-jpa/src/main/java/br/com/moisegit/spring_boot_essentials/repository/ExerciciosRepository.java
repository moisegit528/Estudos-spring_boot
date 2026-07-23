package br.com.moisegit.spring_boot_essentials.repository;

import br.com.moisegit.spring_boot_essentials.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciciosRepository extends JpaRepository<ExerciciosEntity, Integer> {

    List<ExerciciosEntity> findAllBygrupoMuscular(String grupoMuscular);
}
