package pome4;

public class Cinema {

	private String name;
	private String citta;
	private String indirizzo;
	private String numeroPosti;
	
	public Cinema() {
		
	}
	
	public Cinema(String name, String citta, String indirizzo, String numeroPosti) {
		
		this.name = name;
		this.citta = citta;
		this.indirizzo = indirizzo;
		this.numeroPosti = numeroPosti;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(String numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	@Override
	public String toString() {
		return "Cinema [name=" + name + ", citta=" + citta + ", indirizzo=" + indirizzo + ", numeroPosti=" + numeroPosti
				+ "]";
	}
	
	

}
