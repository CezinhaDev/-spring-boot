package com.example.Projeto.Spring_Boot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    // Aqui você pode adicionar métodos para acessar o banco de dados

    public String ObterMensagem(){
        return "Hello, do repositório!";
    }
}
