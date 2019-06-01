package model;

import javax.persistence.Column;
import javax.persistence.Id;

public class UF {
	@Id
	private long idUF;
	
	@Column(name = "nome")
	private String nome;
	
	public UF() {}

	public long getIdUF() {
		return idUF;
	}

	public void setIdUF(long idUF) {
		this.idUF = idUF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
