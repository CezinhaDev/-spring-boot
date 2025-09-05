package com.example.Projeto.Spring_Boot.service;

import org.springframework.stereotype.Service;

import com.example.Projeto.Spring_Boot.repository.MensagemRepository;

@Service // isso indica que essa classe é um serviço para o Spring gerenciar ela como um bean de serviço 
public class MensagemService {
    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem() {
        return mensagemRepository.ObterMensagem();
    }
}
