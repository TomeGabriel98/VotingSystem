package model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Municipio {
	@Id
	private long idMunicipio;
	
	@Column(name = "nome")
	private String nome;
	
	@JoinColumn(name = "uf", referencedColumnName = "idUF")
	@ManyToOne
	private UF uf;
	
	public Municipio() {}

	public long getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(long idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	
}
