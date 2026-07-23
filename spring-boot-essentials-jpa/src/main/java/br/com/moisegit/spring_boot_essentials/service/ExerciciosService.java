package br.com.moisegit.spring_boot_essentials.service;

import br.com.moisegit.spring_boot_essentials.dto.ExerciciosDto;
import br.com.moisegit.spring_boot_essentials.model.ExerciciosEntity;
import br.com.moisegit.spring_boot_essentials.repository.ExerciciosRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class ExerciciosService {

    private final ExerciciosRepository exerciciosRepository;

    public List<ExerciciosEntity> findAll() {
        return exerciciosRepository.findAll();
    }


    public void save(ExerciciosDto exerciciosDto) {
        exerciciosRepository.save(ExerciciosEntity.builder()
                        .nome(exerciciosDto.getNome())
                        .grupoMuscular(exerciciosDto.getGrupoMuscular())
                .build());
    }

    public List<ExerciciosEntity> getExerciciosDtoByGrupoMuscular(String grupoMuscular) {
        return exerciciosRepository.findAllBygrupoMuscular(grupoMuscular);
    }
}
