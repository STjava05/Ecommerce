package it.esedra.corso.Ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private int prezzo;
	
	public Product() {
		
	}

	public Product(int id, String nome, int prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", nome=" + nome + ", prezzo=" + prezzo + "]";
	}
	

}
