package com.example.Projeto.Spring_Boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Projeto.Spring_Boot.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
