package pome3;

public class Bottiglia {
	//attributi
	private String tipo;
	private String marca;
	private Colore colore;
	private double litri;
	private double costo;
	private Materiale materiale;
	
	//costruttori
	public Bottiglia(String tipo, String marca, double litri, double costo, Colore colore, Materiale materiale){
		
		this.tipo = tipo;
		this.marca = marca;
		this.litri = litri;
		this.costo = costo;
		this.colore = colore;
		this.materiale = materiale;
		
	}
	
	//metodi
	
	public Bottiglia() {
		// TODO Auto-generated constructor stub
	}

	//metodi get
	public String getTipo() {
		return this.tipo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public double getLitri() {
		return this.litri;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public Colore getColore() {
		return this.colore;
	}
	
	public Materiale getMateriale() {
		return this.materiale;
	}
	
	//metodi set
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setLitri(double litri) {
		this.litri = litri;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public void setColore(Colore colore) {
		this.colore = colore;
	}
	
	public void setMateriale (Materiale materiale) {
		this.materiale = materiale;
	}
	
	//metodi toString
	public String toString() {
		return "Hai scelto " + this.marca + ", " + this.tipo + ", da " + this.litri + " L al costo di €" + this.costo;
	}


}
