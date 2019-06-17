package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "candidato")
public class Candidato {
	@Id
	@Column(name = "numero", nullable = false)
	private int numero;
	
	@Column(name = "nome", nullable = false)
	private String nome;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
	
}
