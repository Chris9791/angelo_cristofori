package pome4;

public class Persona {
	private String nome;
	private String cognome;
	private String eta;
	private String telefono;
	

	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, String eta, String telefono) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.eta = telefono;
	}

	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	
	
}
