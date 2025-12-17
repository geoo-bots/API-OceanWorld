package br.com.oceanworld.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oceanworld.api.service.AtracaoService;

@RestController
@RequestMapping(value="/atracoes")
public class AtracaoController {

    @Autowired
    private AtracaoService atracaoService;

    
    
}
