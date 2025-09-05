package com.example.Projeto.Spring_Boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Projeto.Spring_Boot.service.MensagemService;

@RestController
@RequestMapping("/api")
public class MensagemController {
    private final MensagemService mensagemService;

    // ISSO É INJEÇÃO DE DEPENDÊNCIA
    public MensagemController(MensagemService mensagemService) {
        this.mensagemService = mensagemService;
    }

    @GetMapping("/mensagem")
    public String mensagem() {
        return mensagemService.obterMensagem();
    }
    
}
