package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "eleitor")
public class Eleitor {
	@Id
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "nascimento")
	private String nasc;
	
	/*@JoinColumn(name = "municipio", referencedColumnName = "idMunicipio")
	@ManyToOne
	private Municipio municipio;*/
	
	@Column(name = "zona")
	private String zona;
	
	@Column(name = "secao")
	private String secao;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "libera")
	private String libera;
	
	public Eleitor() {}

	/*public long getIdEleitor() {
		return idEleitor;
	}

	public void setIdEleitor(long idEleitor) {
		this.idEleitor = idEleitor;
	}*/

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	/*public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}*/

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
