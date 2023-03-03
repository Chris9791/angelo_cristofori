package pome3;

import java.util.Date;

public class Anagrafica {
	//attributi
	private String cognome;
	private String nome;
	private Date dataNascita;
	private char sesso;
	
	//costruttore
	public Anagrafica(String cognome, String nome, Date dataNascita, char sesso) {
		this.cognome = cognome;
		this.nome = nome;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
	}
	
	//metodi, senza get e set il programma va in blocco
	public String getNome() {
		return this.nome;
	}
	
	//come si imposta un parametro nella classe
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date dataNascita() {
		return this.dataNascita;
	}
	
	public void setCognome(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	public String toString() {
		return this.cognome + " " + this.nome + " " + this.dataNascita;
	}
	
	
}
