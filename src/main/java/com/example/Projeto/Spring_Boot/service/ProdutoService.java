package com.example.Projeto.Spring_Boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

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

    public Optional <Produto> buscarPorId(Long id){
        return produtoRepository.findById(id); // findById é um método fornecido pelo JpaRepository para buscar uma entidade pelo seu ID
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto); // save é um método fornecido pelo JpaRepository para salvar ou atualizar uma entidade
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id); // deleteById é um método fornecido pelo JpaRepository para deletar uma entidade pelo seu ID
    }
}
