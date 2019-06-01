package model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Voto {
	@Id
	private long idVoto;
	
	@Column(name = "voto")
	private String voto;

	public long getIdVoto() {
		return idVoto;
	}

	public void setIdVoto(long idVoto) {
		this.idVoto = idVoto;
	}

	public String getVoto() {
		return voto;
	}

	public void setVoto(String voto) {
		this.voto = voto;
	}
	
	
}
