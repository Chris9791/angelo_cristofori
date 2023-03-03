package pome3;

public class Materiale {
// descrizione, reciclabile, infiammabile, colore
	
	//attributi
	private String descrizione;
	private boolean reciclabile;
	private boolean infiammabile;
	private String colore;
	
	
	//costruttori
	public Materiale(String descrizione, boolean reciclabile, boolean infiammabile, String colore){
		
		this.descrizione = descrizione;
		this.reciclabile = reciclabile;
		this.infiammabile = infiammabile;
		this.colore = colore;
		
	}

	//metodi

	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public boolean isReciclabile() {
		return reciclabile;
	}


	public void setReciclabile(boolean reciclabile) {
		this.reciclabile = reciclabile;
	}


	public boolean isInfiammabile() {
		return infiammabile;
	}


	public void setInfiammabile(boolean infiammabile) {
		this.infiammabile = infiammabile;
	}


	public String getColore() {
		return colore;
	}


	public void setColore(String colore) {
		this.colore = colore;
	}
	
	
	
}


