package model;

public interface EleitorDAO {
	public Eleitor findByTitle(String titulo);
	public boolean liberaVoto(String titulo);
}
