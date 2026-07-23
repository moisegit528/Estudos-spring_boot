package br.com.moisegit.spring_boot_essentials.controller;

import br.com.moisegit.spring_boot_essentials.dto.ExerciciosDto;
import br.com.moisegit.spring_boot_essentials.model.ExerciciosEntity;
import br.com.moisegit.spring_boot_essentials.service.ExerciciosService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
@Data
@Validated
public class ExerciciosController {

    private final ExerciciosService exerciciosService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity> findAll(){
        return exerciciosService.findAll();
    }

    @GetMapping("/grupo/{grupoMuscular}")
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity>  findAllBygrupoMuscular(@PathVariable String grupoMuscular){
        return exerciciosService.getExerciciosDtoByGrupoMuscular(grupoMuscular);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveExercicio(@Valid @RequestBody ExerciciosDto exerciciosDto) {
        exerciciosService.save(exerciciosDto);
    }


}
