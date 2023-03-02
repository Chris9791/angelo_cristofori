package pome4;

public class Attore extends Persona {
	//attributi
	private String recitazione;
	
	//costruttori
	public Attore() {
		
	}

	public Attore(String recitazione) {
		
		this.recitazione = recitazione;
		
	}

	//metodi
	public String getRecitazione() {
		return recitazione;
	}

	public void setRecitazione(String recitazione) {
		this.recitazione = recitazione;
	}

	@Override
	public String toString() {
		return "Attore [recitazione=" + recitazione + "]";
	}
	
		

	
	
}
