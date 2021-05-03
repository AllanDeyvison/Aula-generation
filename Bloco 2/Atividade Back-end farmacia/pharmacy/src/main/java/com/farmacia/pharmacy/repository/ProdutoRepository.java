package com.farmacia.pharmacy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.pharmacy.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByDescricaoProdutoAndTituloContainigIgnoreCase (String descricaoProduto, String titulo);
}

