package calcolatrice;
//import libreria scanner
import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		//esercizio creare un sistema di menu, che permetta dopo aver scelto di procedere
		//(esci o calcolatrice), di avere disponibili 4 operazioni matematiche su due addendi,
		//scegli se gli addendi int o double.
		//Le operazioni devono riportare il risultato corretto e il risultato sbagliato riportato
		//con random. Quando esco mi stamperà quante volte ho fatto le operazioni
		
		// login solo se inserito correttamente parte tutto
		
		//creo le variabili di confronto
		String userName = "angelo";
		String password = "angelo";
		String userIns;
		String pwIns;
		
		//dichiaro le due variabili che verranno valorizzate dall'utente
		double x, y, totale;
		//dichiaro la variabile che userò per generare il numero casuale
		double randomNum;
		//dichiaro la variabile che manda avanti o meno il ciclo while
		boolean confirm = false;
		//dichiaro la variabile char dove l'utente mi dice se vuole o meno fare altre operazioni
		Scanner objStr = new Scanner(System.in);
		Scanner objInt = new Scanner(System.in);
		Scanner objDouble = new Scanner(System.in);
		String calcolatrice;
		String operazione;
//		String signIn;
		
		//dichiaro la variabile di conteggio cicli
		int i = 0;
		
//		if ()
		
		while (confirm == false) {
			
			System.out.println("Inserisci il tuo Username");
			userIns = objStr.nextLine();
			System.out.println("Inserisci la tua password");
			pwIns = objStr.nextLine();
			
			if (userIns.equals(userName) && pwIns.equals(password)) {
				confirm = true;
			} else {
				System.out.println("Hai inserito o la password o il nome utente sbagliato, ritenta");
			}
		}

		
		while (confirm == true) {
			System.out.println("Vuoi utilizzare la calcolatrice? Inserisci \"Y\" se si, \"N\" se no");
			calcolatrice = objStr.nextLine();
			if (calcolatrice.toLowerCase().equals("y")) {
//				System.out.println(calcolatrice);
				i++;
				//faccio inserie all'utente i due numeri decimali
				System.out.println("Inserisci il primo numero decimale:");
				x = objDouble.nextDouble();
				System.out.println("Inserisci il secondo numero decimale:");
				y = objDouble.nextDouble();
				//faccio scegliere all'utente l'operazione
				System.out.println("Scegli l\'operazione da poter fare tra le seguenti: divisione, "
						+ "moltiplicazione, addizione, sottrazione");
				operazione = objStr.nextLine();
				
				//uso lo switch per vedere quale operazione far fare rispetto quello
				//che ha inserito l'utente
				switch (operazione.toLowerCase()) {
					case "divisione":
						totale = x / y;
						randomNum = (double)(Math.random()*101);
						System.out.println("il tuo risultato è: " + totale + 
								". Il risultato random è: " + randomNum);
						break;
					case "moltiplicazione":
						totale = x * y;
						randomNum = (double)(Math.random()*101);
						System.out.println("il tuo risultato è: " + totale + 
								". Il risultato random è: " + randomNum);
						break;
					case "addizione":
						totale = x + y;
						randomNum = (double)(Math.random()*101);
						System.out.println("il tuo risultato è: " + totale + 
								". Il risultato random è: " + randomNum);
						break;
					case "sottrazione":
						totale = x - y;
						randomNum = (double)(Math.random()*101);
						System.out.println("il tuo risultato è: " + totale + 
								". Il risultato random è: " + randomNum);
						break;
					default:
						System.out.println("Hai inserito una stringa errata");
					
				}
				
				
				
			} else if (calcolatrice.toLowerCase().equals("n")){
				//chiudo gli scanner, imposto in false il confirm e comunico all'utente quante
				//operazioni ha fatto
				objStr.close();
				objInt.close();
				objDouble.close();
				System.out.println("Hai effettuato " + i + " operazioni");
				confirm = false;
			} else {
				System.out.println("Hai inserito un carattere sbagliato, inserisci Y o N");
			}
		}

	}

}
