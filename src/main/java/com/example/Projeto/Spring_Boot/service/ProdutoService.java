package com.example.Projeto.Spring_Boot.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.Projeto.Spring_Boot.exceptions.RecursoNaoEncontradoException;
import com.example.Projeto.Spring_Boot.model.Produto;
import com.example.Projeto.Spring_Boot.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Produto com ID "+id+" não encontrado."));
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {

        if (!produtoRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("Produto com ID "+id +" não encontrado.");
        }
        produtoRepository.deleteById(id);
    }
    
}