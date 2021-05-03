package com.farmacia.pharmacy.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@Table (name = "tb_produto")
public class Produto {
	
	private @Id @GeneratedValue (strategy = GenerationType.IDENTITY) long id;
	
	private @NotNull @Size (min = 5, max =15 )String titulo;
	
	private @NotNull @Size (min = 10, max =25 )String descricaoProduto;
	
	private @NotNull double preco;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JsonIgnoreProperties ("produto")
	private Categoria categoria;

	public long getId_produto() {
		return id;
	}

	public void setId_produto(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	
}
