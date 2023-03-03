package fileVerifica;

import java.util.ArrayList;
import java.util.Scanner;

public class FileVerifica {

	public static int somma(int num1, int num2) {
		int somma = num1 + num2;
		return somma;
	}

	public static double media(Integer[] arrayInt) {
		double media = 0;
		int appoggio = 0;

		for (int i = 0; i < arrayInt.length; i++) {
			appoggio += arrayInt[i];
		}

		media = (double) appoggio / arrayInt.length;

		return media;
	}

	public static String reverseStr (String stringa) {
		char[] splitStringa = stringa.toCharArray();
		String reverseStr = "";
		for(int i=stringa.length()-1; i>=0; i--) {
			reverseStr += splitStringa[i];
		}
		
		
		
		return reverseStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insInt = new Scanner(System.in);
		Scanner insTxt = new Scanner(System.in);
		int x;
		int y;

		// Scrivere la definizione di un metodo in Java chiamato "somma" che prende due
		// interi
		// come argomenti e restituisce la loro somma.

		// ! Risposta testuale: Il metodo somma è stato inizializzato fuori il main, in
		// modo che possa essere
		// riutilizzato in qualsiasi parte del codice senza scrivere nuovamente altro.
		// Prende come argomenti due interi il num1 e il num2 ed essendo un metodo int
		// ci restituisce con return
		// un intero (chiamato somma) che fa l'addizione dei due numeri. A questo punto
		// faccio inserire all'utente
		// (grazie all'oggetto Scanner), i due parametri x e y. Nel System out lo
		// richiamo semplicemente con il nome
		// del metodo stesso passandogli x e y

		// codice:

		System.out.println("Inserisci il primo numero intero;");
		x = insInt.nextInt();
		System.out.println("Inserisci il secondo numero intero;");
		y = insInt.nextInt();

		System.out.println("La somma dei due è " + somma(x, y));

		// Scrivere il codice per chiamare il metodo "somma" definito nella domanda 1,
		// passando
		// i valori 5 e 7 come argomenti e stampando il risultato.
		// ! Risposta testuale: in questo caso visto che non è l'utente ad inserire
		// degli interi ma passiamo
		// due interi prefissati stampiamo direttamente del testo + richiamo il metodo e
		// passo come parametri
		// 5 e 7

		// codice:
		System.out.println("\nLa somma di 5 e 7 è " + somma(5, 7));

		// Scrivere la definizione di un metodo in Java chiamato "media" che prende un
		// array
		// di numeri interi come argomento e restituisce la loro media come un valore
		// double.

		// Risposta testuale: inizializzo un arrayList per poter far inserire quanti
		// numeri vuole all'utente.
		// Questo lo faccio attraverso uno scanner di testo inserendo nella variabile di
		// appoggio z il valore
		// con il metodo .nextLine()
		// finchè il booleano confirm è true l'utente potrà inserire e scegliere se
		// inserire o meno dei numeri.
		// nel caso in cui vuole vermarsi deve scrivere necessariamente no e lo
		// controllo con un if
		// a quel punto l'if se la risposta dell'utente è uguale a "no" passa il
		// booleano in false
		// da li trasformo l'arrayList in un array e attraverso il metodo media faccio
		// stampare il risultato.
		// il metodo media ha come argomento un array di interi e all'interno attraverso
		// un ciclo for inserisco
		// nella variabile appoggio la somma di tutti i numeri inseriti.
		// a quel punto in media inserisco il casting da int a double di appoggio e
		// divido il numero per la lunghezza
		// dell'array (con .lenght())

		// codice:
		ArrayList<Integer> arrayMedia = new ArrayList<Integer>();
		String z;
		boolean confirm = true;

		System.out.println("Inserisci dei numeri interi");
		while (confirm == true) {
			x = insInt.nextInt();
			arrayMedia.add(x);
			System.out.println("Vuoi inserirne un altro? scrivi \"no\" se vuoi finire.");
			z = insTxt.nextLine();
			if (z.toLowerCase().equals("no")) {
				confirm = false;
			}
		}

		Integer[] arrayCalcolo = {};
		arrayCalcolo = arrayMedia.toArray(arrayCalcolo);
		System.out.println("la media dei valori inseriti è: " + media(arrayCalcolo));

		// Scrivere il codice per chiamare il metodo "media" definito nella domanda 3,
		// passando
		// l'array {2, 4, 6, 8, 10} come argomento e stampando il risultato.
		// Risposta testuale: come descritto prima possiamo semplicemente utilizzare il
		// metodo di media
		// ma inserendo l'array con valori già prefissati

		Integer[] array = { 2, 4, 6, 8, 10 };
		System.out.println("La media di 2, 4, 6, 8 e 10 è " + media(array));

		// Scrivere la definizione di un metodo in Java chiamato "inverti" che prende
		// una stringa
		// come argomento e restituisce la stringa invertita.
		
//		char[] splitStringa = stringa.toCharArray();
//		String reverseStr = "";
//		for(int i=stringa.length()-1; i>=0; i--) {
//			reverseStr += splitStringa[i];
//		}
//		return reverseStr;
		
		// Risposta testuale: Innanzi tutto faccio inserire all'utente una qualsisi parola
		//il metodo quando verrà richiamato accetterà come argomento una stringa, che entrando nel metodo
		//verrà divisa in un array di char attraverso il metodo toCharArray. A quel punto inizializzo una stringa
		//vuota e attraverso un ciclo for dove scorriamo al contrario l'array di char "sommiamo" i caratteri alla stringa
		//reverseStr (in se stiamo usando il metodo concat()) a quel punto ritorniamo la reverseStr
		//se stampiamo abbiamo la parola inserita al contrario

		// codice:
		System.out.println("Inserisci una parola:");
		String testoUtente;
		testoUtente = insTxt.nextLine();
		System.out.println("La stringa " + testoUtente + " invertita è " + reverseStr(testoUtente));

		// Scrivere il codice per chiamare il metodo "inverti" definito nella domanda 5,
		// passando
		// la stringa "ciao" come argomento e stampando il risultato.
		// Risposta testuale: stessa cosa del punto 5 ma in questo caso viene passata direttamente la una stringa
		

		// codice:
		String testo = "ciao";
		System.out.println("La stringa " + testo + " invertita è " + reverseStr(testo));

		insInt.close();
		insTxt.close();
	}

}
