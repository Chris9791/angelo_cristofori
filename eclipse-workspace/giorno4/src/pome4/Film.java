package pome4;

import java.time.LocalDate;
import java.util.List;

public class Film {
	//attributi
	private String titolo;
	private String genere;
	private List<Attore> attore;
	private Regista regista;
	private	String durata;
	private LocalDate dataUscita;
	
	//costruttore
	
	public Film() {

	}
	
	public Film(String titolo, String genere, Regista regista, List<Attore> attore, String durata, LocalDate dataUscita) {

		this.titolo = titolo;
		this.genere = genere;
		this.regista = regista;
		this.attore = attore;
		this.durata = durata;
		this.dataUscita = dataUscita;
	}
	
	//metodi
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public List<Attore> getAttore() {
		return attore;
	}
	public void setAttore(List<Attore> attore) {
		this.attore = attore;
	}
	public List<Attore> stampAttori() {
		
		return  attore;
	}
	public Regista getRegista() {
		return regista;
	}
	public void setRegista(Regista regista) {
		this.regista = regista;
	}
	public String getDurata() {
		return durata;
	}
	public void setDurata(String durata) {
		this.durata = durata;
	}
	public LocalDate getDataUscita() {
		return dataUscita;
	}
	public void setDataUscita(LocalDate dataUscita) {
		this.dataUscita = dataUscita;
	}

	@Override
	public String toString() {
		return "Film [titolo=" + titolo + ", genere=" + genere + ", regista=" + regista + ", durata=" + durata
				+ ", dataUscita=" + dataUscita + "]";
	}
	
	//stampa lista attori e lista genere
	
	
}
