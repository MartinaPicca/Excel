package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "excel_prodotto")
public class Excel {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nome_prodotto")
	@NotBlank
	@NotEmpty
	@NotNull
	private String nomeProdotto;

	@Column(name = "categoria_prodotto")
	@NotBlank
	@NotEmpty
	@NotNull
	private String categoriaProdotto;

	@Column(name = "prezzo")
	@NotNull
	private double prezzo;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public String getCategoriaProdotto() {
		return categoriaProdotto;
	}

	public void setCategoriaProdotto(String categoriaProdotto) {
		this.categoriaProdotto = categoriaProdotto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
	

}

