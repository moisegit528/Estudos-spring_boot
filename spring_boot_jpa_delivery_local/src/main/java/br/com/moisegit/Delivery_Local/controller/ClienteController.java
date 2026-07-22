package br.com.moisegit.Delivery_Local.controller;

import br.com.moisegit.Delivery_Local.dto.ClienteDto;
import br.com.moisegit.Delivery_Local.model.ClienteEntity;
import br.com.moisegit.Delivery_Local.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
@Validated
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("/")
    public void create(@Validated @RequestBody ClienteDto clienteDto){
        clienteService.save(clienteDto);
    }

    @GetMapping("/")
    public List<ClienteEntity> findAll(){
        return clienteService.findAll();
    }
}
