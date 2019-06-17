package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="voto")
public class Voto {
	@Id
	private long idVoto;
	
	@Column(name = "voto")
	private Integer voto;

	public long getIdVoto() {
		return idVoto;
	}

	public void setIdVoto(long idVoto) {
		this.idVoto = idVoto;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	
	
	
}
