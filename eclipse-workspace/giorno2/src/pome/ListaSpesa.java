package pome;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaSpesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaSpesa = new ArrayList<String>();
		Scanner myStr = new Scanner(System.in);
		boolean confirm = true;
		String prodotto;
		int contatore;

		//Creare un sistema di gestione della lista della spesa, inserimento del prodotto,
		//stampa e quit. Lo stesso prodotto non può essere inserito più di una volta

		
		while (confirm == true) {
			System.out.println("Inserisci prodotto da aggiungere alla lista della spesa, "
					+ "inserisci quit per terminare");
			prodotto = myStr.nextLine();
			
			//controllo doppio inserimento

			//se viene inserito quit termina il programma e ci restituisce la lista della spesa
			//se non termina aggiunge all'ultima posizione dell'arrayList il prodotto
			
			if (prodotto.equals("quit")) {
				System.out.println("la tua lista della spesa contiene: " + listaSpesa);

				myStr.close();
				confirm = false;
			} else {
				boolean contain = false;
				for (contatore=0; contatore<listaSpesa.size(); contatore++) {
					if(listaSpesa.get(contatore).equals(prodotto)) {
						System.out.println("Hai già inserito questo prodotto, inseriscine "
								+ "un altro o termina con quit");
						contain = true;
					}
				}
				
				if (!contain) {
					listaSpesa.add(prodotto);
				} 
			}
			
		}
		
	}

}
