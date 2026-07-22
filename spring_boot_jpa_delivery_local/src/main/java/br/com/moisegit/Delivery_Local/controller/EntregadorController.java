package br.com.moisegit.Delivery_Local.controller;


import br.com.moisegit.Delivery_Local.dto.EntregadorDto;
import br.com.moisegit.Delivery_Local.model.EntregadorEntity;
import br.com.moisegit.Delivery_Local.service.EntregadorService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/entregador")
@RequiredArgsConstructor
@Validated
public class EntregadorController {

    private final EntregadorService entregadorService;

    @PostMapping("/")
    public void create(@Validated @RequestBody EntregadorDto entregadorDto){
        entregadorService.save(entregadorDto);
    }

    @GetMapping("/")
    public List<EntregadorEntity> findAll(){return entregadorService.findAll();}
}
