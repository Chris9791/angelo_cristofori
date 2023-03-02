package pome4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UscitaPerCinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// istanzio gli oggetti di tipo Cinema che verranno successivamente riempiti
		Cinema corso = new Cinema("corso", "Latina", "Via del boh", "300");
		Cinema uciCinema = new Cinema("Uci Cinema", "Roma", "Via del boh2", "1000");
		Cinema supercinema = new Cinema("supercinema", "Latina", "Via del boh3", "300");


		//istanzio primo regista
		Regista francisLawrence = new Regista();
		francisLawrence.setCognome("Lawrence");
		francisLawrence.setNome("Francis");
		francisLawrence.setEta("52");
		francisLawrence.setTelefono("00000000000");
		francisLawrence.setRegia("Thriller");
		

		// istanzio gli oggetti Film
		// nome; cognome;eta;telefono;
		Film redSparrow = new Film();
		redSparrow.setTitolo("Red Sparrow");

//		redSparrow.setRegista(francisLawrence.setCognome("Lawrence"));
//				francisLawrence.setCognome("Lawrence"));

		// istanzio l'oggetto scannero solo per il testo che mi servirà ad inserire
		// tutti i nomi
		Scanner text = new Scanner(System.in);

		// istanzio la variabile booleana d'appoggio per scegliere il cinema
		boolean boolCinema = true;

		// inserisci caratteristiche cinema

		while (boolCinema == true) {
			System.out.println("Vuoi andare al cinema? s/n");
			String risposta = text.nextLine();
			if (risposta.toLowerCase().equals("s")) {
				
				System.out.println("Scegli cinema");
				List<Cinema> listaCinema = new ArrayList<Cinema>();
				listaCinema.add(corso);
				listaCinema.add(uciCinema);
				listaCinema.add(supercinema);
				// creo l'iteratore
				Iterator<Cinema> itCinema = listaCinema.iterator();
				while (itCinema.hasNext()) {
					Cinema testCinema = itCinema.next();
					System.out.println(testCinema.getName());
				}

			} else if (risposta.toLowerCase().equals("n")) {

			} else {
				System.out.println("Hai sbagliato lettera riprova.");
			}

		}
	}

}
