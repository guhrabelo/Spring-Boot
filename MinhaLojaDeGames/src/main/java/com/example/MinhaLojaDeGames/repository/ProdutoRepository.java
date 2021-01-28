package com.example.MinhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MinhaLojaDeGames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByProdutoContainingIgnoreCase(String nome);
}
