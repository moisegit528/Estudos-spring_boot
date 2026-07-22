package br.com.moisegit.Delivery_Local.controller;


import br.com.moisegit.Delivery_Local.dto.RestauranteDto;
import br.com.moisegit.Delivery_Local.model.RestauranteEntity;
import br.com.moisegit.Delivery_Local.repository.RestauranteRepository;
import br.com.moisegit.Delivery_Local.service.RestauranteService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
@RequiredArgsConstructor
@Validated
public class RestauranteController {

    private final RestauranteService restauranteService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Validated @RequestBody RestauranteDto restauranteDto){
        restauranteService.save(restauranteDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<RestauranteEntity> findAll(){return restauranteService.findAll();}


}
