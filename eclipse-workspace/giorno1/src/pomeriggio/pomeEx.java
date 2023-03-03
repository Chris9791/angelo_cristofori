package pomeriggio;

import java.util.Scanner;

public class pomeEx {
	public static void main(String[] args) {
		
		try (//faccio inserire all'utente il CF
		Scanner in = new Scanner(System.in)) {
			//l'utente inserisce il cf
			String codiceFiscale = in.nextLine().toUpperCase();
			
			//solo se di 16 caratteri il programma funziona
			if (codiceFiscale.length() == 16) {
				
			
			
				System.out.println("Il tuo codice fiscale è: " + codiceFiscale);
				
				//
				String cognome = codiceFiscale.substring(0, 3);
				System.out.println("cognome: " + cognome);
				
				String nome = codiceFiscale.substring(3, 6);
				System.out.println("nome: " + nome);
				
				String annoNascita = codiceFiscale.substring(6, 8);
//				if (annoNascita < 2000) {
//					
//				}
				
				System.out.println("anno di nascita: " + annoNascita);
				
				String meseNascita = codiceFiscale.substring(8, 9);
	//			System.out.println("mese di nascita: " + meseNascita);
				
				switch (meseNascita) {
					case "A":
						System.out.println("mese di nascita: gennaio");
						break;
					case "B":
						System.out.println("mese di nascita: febbraio");
						break;
					case "C":
						System.out.println("mese di nascita: marzo");
						break;
					case "D":
						System.out.println("mese di nascita: aprile");
						break;
					case "E":
						System.out.println("mese di nascita: maggio");
						break;
					case "F":
						System.out.println("mese di nascita: giugno");
						break;
					case "G":
						System.out.println("mese di nascita: luglio");
						break;
					case "H":
						System.out.println("mese di nascita: agosto");
						break;
					case "I":
						System.out.println("mese di nascita: settembre");
						break;
					case "J":
						System.out.println("mese di nascita: ottobre");
						break;
					case "K":
						System.out.println("mese di nascita: novembre");
						break;
					case "L":
						System.out.println("mese di nascita: dicembre");
						break;
					default:
						System.out.println("non presente in archivio");
						
				}
				
	//			int meseNascitaNum = codiceFiscale.substring(8, 9).hashCode();
	//			System.out.println("mese di nascita numero: " + (meseNascitaNum - 64));
				
	//			String[] mesi = {"gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", 
	//					"luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre"
	//			};
	//			
	//			for (int i=1; i<13; i++) {
	//				if (i == meseNascitaNum) {
	//					System.out.println(mesi[i]);
	//				}
	//			}
				
				//ricavo il giorno di nascita
				String giornoNascita = codiceFiscale.substring(9, 11);
			
				
				//converto il giorno di nascita da str a int
				int giornoNascitaNum = Integer.parseInt(giornoNascita);
				
				if (giornoNascitaNum > 0 && giornoNascitaNum < 32) {
					System.out.println("giorno di nascita: " + giornoNascita);
					System.out.println("sesso: Maschio");
				} else {
					System.out.println("giorno di nascita: " + (giornoNascitaNum - 40));
					System.out.println("sesso: Femmina");
				}
			
			} else {
				System.out.println("hai inserito erroneamente il codice fiscale");
			}
			
			
		}
		
		
		
		
		
		
		
	}
}
