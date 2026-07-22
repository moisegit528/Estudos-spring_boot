package br.com.moisegit.Delivery_Local.controller;


import br.com.moisegit.Delivery_Local.dto.PedidoDto;
import br.com.moisegit.Delivery_Local.model.PedidoEntity;
import br.com.moisegit.Delivery_Local.repository.PedidoRepository;
import br.com.moisegit.Delivery_Local.service.PedidoService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
@RequiredArgsConstructor
@Validated
public class PedidoController {

    private final PedidoService pedidoService;

   @PostMapping("/")
    public void create(@Validated @RequestBody PedidoDto pedidoDto) {
       pedidoService.save(pedidoDto);
   }

   @GetMapping("/")
   @ResponseStatus(HttpStatus.OK)
   public List<PedidoEntity> findAll(){return pedidoService.findAll();}

}
