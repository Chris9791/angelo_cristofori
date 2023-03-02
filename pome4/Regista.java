package pome4;

public class Regista extends Persona {
	//attributi
	private String regia;

	//costruttori
	public Regista() {

	}

	public Regista(String regia) {
		
		this.regia = regia;
	}

	//metodi
	public String getRegia() {
		return regia;
	}

	public void setRegia(String regia) {
		this.regia = regia;
	}

	@Override
	public String toString() {
		return "Regista [regia=" + regia + "]";
	}
	
	
}
