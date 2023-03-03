package giorno1;

public class primoGiorno {
	public static void main(String[] args) {
		//dichiarato intero successivamente stampato
		int x = 30;
		
		System.out.println("Ciao Mondo");
		System.out.println(3);
		System.out.println(3*3);
		System.out.println(x);
		
		int provaNumero = 2;
		char provaCarattere = 'c';
		String provaFrase = "prova di stampa stringa";
		//per i float si deve specificare la f finale, per il double la d
		float provaVirgola = 245.0f;
		boolean prova = true;
		
		System.out.println(provaNumero);
		System.out.println(provaCarattere);
		System.out.println(provaFrase);
		System.out.println(provaVirgola);
		System.out.println(prova);
		
		System.out.println("Prova " + provaFrase + " " + provaNumero);
		
		//possiamo dichiarare più interi e in generale altre variabili solo dello stesso tipo in
		//questo modo:
		int y ,z;
		y = 1;
		z = 32;
		System.out.println(y + z);
		
		
		String a = "Ciao sono";
		String b = "Angelo";
		String c = "Cristofori";
		//concatenazione frase
		String finale = a + " " + b + " " + c;
		//stampa concatenazione
		System.out.println(finale);
		//se effettuo il replace senza salvarlo in una variabile ottengo di nuovo i caratteri iniziali
		finale.replace("i", "1");
		
		System.out.println(finale);
		
		String frase = 	finale.replace("i", "1");
		
		System.out.println(frase);
		
		//data una stringa fissa, se c'è quel carattere tiriamo la sottostringa fuori,
		//se non c'è stampa quello dopo, se non c'è l'1 esce "stringa non trovata"
		
		//substring ritorna da un determinato indice una nuova stringa
		//lenght la lunghezza di caratteri di una stringa
		
		int posizione = frase.indexOf("1");
		
		if (posizione>0) {
			System.out.println(frase.substring(posizione));
			//stampa solo dopo il primo 1
			System.out.println(frase.substring(posizione+1));
			
		} else {
			System.out.println("frase non trovata");
		}
		
	
	
//		System.out.println(codiceFiscale);
		
		
		
	}
}
