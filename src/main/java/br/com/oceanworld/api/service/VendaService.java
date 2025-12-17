package br.com.oceanworld.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.oceanworld.api.model.Venda;
import br.com.oceanworld.api.repository.VendaRepository;

@Service
public class VendaService {
    
    @Autowired
    private VendaRepository  vendaRepository;

    public List <Venda> consultarVendas(){
        return vendaRepository.findAll();
    }
}
