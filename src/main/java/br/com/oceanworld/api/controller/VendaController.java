package br.com.oceanworld.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oceanworld.api.model.Venda;
import br.com.oceanworld.api.service.VendaService;

@RestController
@RequestMapping(value="/vendas")
public class VendaController {
    
    @Autowired
    private VendaService vendaService;
    
    @GetMapping
    public ResponseEntity<List<Venda>>listarVendas(){
        return ResponseEntity.ok().body(vendaService.consultarVendas());
    }
}
