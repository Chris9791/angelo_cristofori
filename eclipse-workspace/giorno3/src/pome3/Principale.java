package pome3;

import java.time.LocalDate;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrafica anagrafica = new Anagrafica("cristofori", "angelo", null, 'M');
		
		System.out.println("nome: " + anagrafica.getNome());
		anagrafica.setNome("Giuseppe");
		System.out.println("nome mod: " + anagrafica.getNome());
		
		System.out.println(anagrafica.toString()); 
		
		Bottiglia acqua = new Bottiglia();
		Colore trasparente = new Colore("trasparente");
		Colore verde = new Colore("verde");
		Colore blu = new Colore("blu");
		Colore nero = new Colore("nero");
		
		Materiale plastica = new Materiale ("plastica", true, true, nero.getDescrizione());
		
		System.out.println(nero.getDescrizione());
		
		acqua.setMarca("Guizza");
		acqua.setTipo("acqua naturale");
		acqua.setLitri(1.5);
		acqua.setCosto(0.43);
		acqua.setColore(trasparente);
		acqua.setMateriale(plastica);
		
		System.out.println(acqua.toString());
		System.out.println("Il materiale è " + acqua.getMateriale().getDescrizione() + " "
				+ "ed il colore è " + acqua.getMateriale().getColore());
		System.out.println("Il colore della bottiglia è: " + acqua.getColore().getDescrizione());
//		System.out.println();
		
	}

}

//creare oggetto bottiglia