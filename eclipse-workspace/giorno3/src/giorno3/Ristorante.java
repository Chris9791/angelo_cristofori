package giorno3;

//import java.util.ArrayList;
import java.util.Scanner;

public class Ristorante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu = {
				"Pasta al sugo, 6, pasta - pelati - formaggio",
				"Carbonara, 10, pasta - uova - pecorino - guanciale",
				"Pasta al pesto, 8, pasta - pesto"				
		};
		
		
		boolean confirm = true;
		Scanner select = new Scanner(System.in);
		int start = 3;
		//variabile scelta ordina o esci
		int scelta1 = -1;
		//variabile scelta vedi menu, ordina e esci
		int scelta2;
		//variabile scelta ordini
		int scelta3;
		//variabile del carrello
		int carrello = 0;
		
		int id = 0;
		
		//variabili per creazioni utenti
		String name;
		String password;
		String register;
		Integer identificativo = 0;
		//booleano per creazione utente
		boolean confirmUs = true;
		
		
		while (confirmUs == true) {
			//entrata nel programma
			System.out.println("Benvenuto\nSei registrato? s/n");
			//risposta utente
			register = select.nextLine();
			//controllo se registrato o meno
			if(register.equals("n"))//registrazione utente
			{
					
					System.out.println("Inserisci username:");
					name = select.nextLine();
					System.out.println("Inserisci password:");
					password = select.nextLine();
					identificativo += 1;
					String appoggio = String.valueOf(identificativo);
	//				System.out.println(appoggio);
					
					
					Utente utenza = new Utente (name, password, appoggio);
					String[] user = utenza.createUt();
					System.out.println("le tue credenziali:");
					
					for (int i=0; i<user.length; i++) {
						System.out.println(user[i]);
					}
					
					confirmUs = false;

			} else { //log utente
				//
			}
			
			
			
			
		}
		
		
//		System.out.println(menu.length);
		
//		
//		System.out.println("Vuoi sederti o uscire dal ristorante?\nPremi:\n1) "
//				+ "per accomodarti\n2) per uscire");
//		
//		System.out.println(scelta);
		//dopo aver inserito la scelta con 1 o 2 utilizziamo lo switch per imporre un'altra
		//scelta all'utente, menu, ordinazione, o uscire dallo switch
		
		while ((start>2 || start<1) && confirm) {
			System.out.println("Vuoi sederti o uscire dal ristorante?\nPremi:\n1) "
					+ "per accomodarti\n2) per uscire");
			start = select.nextInt();
			if (start == 1) {
				
				while(scelta1 < 1 || scelta1 > 3 ) {
					System.out.println("Scegli tra le seguenti opzioni:\n1) Vedi menu\'\n2) "
							+ "Ordina un piatto\n3) Esci e paga");
					scelta2 = select.nextInt();
					switch (scelta2) {
					case 1: //scelta di vedere il menù
						System.out.println("menu:");
						for (int i=0; i<menu.length; i++) {
							System.out.println(menu[i].split(",")[0] + ". Ingredienti: " + 
									menu[i].split(",")[2].trim());
						}
						System.out.println("\n");
//					scelta1 = scelta2;
						break;
					case 2: //scelta per ordinare un piatto
						System.out.println("ordina selezionando uno dei numeri proposti");
						for (int i=0; i<menu.length; i++) {
							System.out.println(i+1 + ") " + menu[i].split(",")[0] + " € " + 
									menu[i].split(",")[1].trim());
						}
						System.out.println("\n");
						scelta3 = select.nextInt();
						//impongo una condizione per poter far scegliere solo le pietanze in lista
						while (scelta3>3 || scelta3<1) {
							System.out.println("hai inserito prodotti non in lista, "
									+ "scegli solo quelli presentati.");
							scelta3 = select.nextInt();
						}
						
						carrello = carrello + Integer.parseInt(menu[scelta3 - 1].split(",")[1].trim());
//					System.out.println("Attualmente stai spendendo € " + carrello);
						System.out.println("Hai scelto " + menu[scelta3 - 1].split(",")[0] + " ed è "
								+ "stato inserito nel pre-conto.\nFai altro?");
						break;
					case 3: //scelta per uscire dove viene mostrato il conto
						System.out.println("Recati in cassa per pagare, il conto è di € " + carrello);
						start = 3;
						scelta1 = scelta2;
						break;
					default:
						System.out.println("Hai inserito un numero errato, riprova.");
//					scelta = select.nextInt();
					}
					
					
				}
				
			} else if (start == 2) {
				System.out.println("Sei uscito");
				select.close();
				confirm = false;
			} else {
				System.out.println("Hai inserito una scelta errata, riprova");
			}
			
		}
		
		
		
		
		
	}

}
