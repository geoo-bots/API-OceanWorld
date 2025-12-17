package br.com.oceanworld.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.oceanworld.api.model.Atracao;
import br.com.oceanworld.api.repository.AtracaoRepository;

@Service
public class AtracaoService {
    
    @Autowired
    private AtracaoRepository atracaoRepository;

    public Atracao salvarAtracao(Atracao atracao){
        return atracaoRepository.save(atracao);
    }

    public List <Atracao> consultarAtracoes(){
        return atracaoRepository.findAll();
    }
}
