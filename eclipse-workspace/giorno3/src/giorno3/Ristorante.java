package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ristorante {
	
//	public static Object[] transformArray (ArrayList<Object> arrayDaTrasf){
//		
//		Object[] arrayControlAccess = {};
//		
//		arrayControlAccess = arrayDaTrasf.toArray(arrayControlAccess);
//		
//		return arrayControlAccess;
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu = {
				"Pasta al sugo, 6, pasta - pelati - formaggio",
				"Carbonara, 10, pasta - uova - pecorino - guanciale",
				"Pasta al pesto, 8, pasta - pesto"				
		};


		
		boolean confirm = true;
		Scanner select = new Scanner(System.in);
		Scanner selectInt = new Scanner(System.in);
		int start;
		//variabile scelta ordina o esci
		int scelta1 = -1;
		//variabile scelta vedi menu, ordina e esci
		int scelta2;
		//variabile scelta ordini
		int scelta3;
		//variabile del carrello
		int carrello = 0;
		
//		int id = 0;
		
		//variabili per creazioni utenti
		String name;
		String password;
		String register;
		Integer identificativo = 2;
		
		String[][] user = {{"1", "admin1", "pass1"},{"2", "admin2", "pass2"}};
//		ArrayList<Utente> list = new ArrayList<Utente>();
//		list.add(admin1);
//		list.add(admin2);
		
//		String[][] userSaved = {{"admin1", "pass1", "1"}, {"admin2", "pass2", "2"}};
		//booleano per creazione utente
		boolean confirmRegister = true;
		boolean controllo = false;
		
		//ciclo while creato per entrare nel programma e far registrare o loggare l'utente
		while (confirmRegister == true) {
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
					ArrayList<Object> userList = new ArrayList<Object>(Arrays.asList(user));
//					user = utenza.createUt();
					userList.add(utenza.createUt());
					user = userList.toArray(user);
					System.out.println("le tue credenziali: ut " + user[identificativo-1][1] + " pw " + user[identificativo-1][2]);
				
					confirmRegister = false;

			} else { //log utente
				
				while (confirmRegister == true) {
					System.out.println("Inserisci il tuo username:");
					name = select.nextLine();
					System.out.println("Inserisci la tua password:");
					password = select.nextLine();
					
					for (int i=0; i<user.length; i++) {
						//prova a controllare nome e password con gli iteratori
						if (user[i][1].equals(name) && user[i][2].equals(password)) {
							
							System.out.println("Username e password inserite correttamente, benvenuto");
							controllo = true;
							confirmRegister = false;
							
						}
					}
					
					if (controllo == false) {
						System.out.println("Username o Password inseriti non corretti.\nVuoi riprovare? s/n");
						//uso name come appoggio
						name = select.nextLine();
						if (name.equals("n")) {
							confirmRegister = false;
							confirm = false;
						}
						
					}
					
				}
			}
			
		}
		
		for (int i=0; i<user.length; i++) {
			//prova a controllare nome e password con gli iteratori
			if ((user[i][1].equals("admin1") && user[i][2].equals("pass1")) || 
					(user[i][1].equals("admin2") && user[i][2].equals("pass2"))) {
				
				System.out.println("Bentornato admin, vuoi modificare il menu? s/n");
				name = select.nextLine();
				if(name.equals("s")) {
					System.out.println("Quale prodotto vuoi modificare?");
					for (int j=0; j<menu.length; j++) {
						System.out.println((j+1) + ") " + menu[j].split(",")[0] + ". Ingredienti: " + 
								menu[j].split(",")[2].trim());
					}
					scelta2 = selectInt.nextInt();
					System.out.println("Hai scelto di modificare\n" + menu[scelta2-1].split(",")[0] + ". Ingredienti: " + 
								menu[scelta2-1].split(",")[2].trim() + ". Costo: €" + menu[scelta2-1].split(",")[1]);
					System.out.println("Premi il numero in base a ciò che vuoi modificare\n1) Nome piatto\n2) Costo\n3) Ingredienti");
					//utilizzo la variabile start 
					start = selectInt.nextInt();
					switch (start) {
					case 1: //nuovo nome
						System.out.println("Inserisci nuovo nome");
						name = select.nextLine();
						menu[scelta2-1] = name + ", " + menu[scelta2-1].split(",")[1] + ", " + menu[scelta2-1].split(",")[2];
						System.out.println("Questo è il nuovo menù:\n" + menu[scelta2-1].split(",")[0] + ". Ingredienti: " + 
								menu[scelta2-1].split(",")[2].trim() + ". Costo: €" + menu[scelta2-1].split(",")[1]);
						break;
					case 2: // nuovo costo
						System.out.println("Inserisci nuovo costo");
						name = select.nextLine();
						menu[scelta2-1] = menu[scelta2-1].split(",")[0] + ", " + name + ", " + menu[scelta2-1].split(",")[2];
						System.out.println("Questo è il nuovo menù:\n" + menu[scelta2-1].split(",")[0] + ". Ingredienti: " + 
								menu[scelta2-1].split(",")[2].trim() + ". Costo: €" + menu[scelta2-1].split(",")[1]);
						break;
					case 3: // nuovi ingredienti
						System.out.println("Inserisci tutti i nuovi ingredienti intervallati da quanto segue nelle parentesi ( - )");
						name = select.nextLine();
						menu[scelta2-1] = menu[scelta2-1].split(",")[0] + ", " + menu[scelta2-1].split(",")[1] + ", " + name;
						System.out.println("Questo è il nuovo menù:\n" + menu[scelta2-1].split(",")[0] + ". Ingredienti: " + 
								menu[scelta2-1].split(",")[2].trim() + ". Costo: €" + menu[scelta2-1].split(",")[1]);
						break;
					default:
						System.out.println("Hai inserito un numero errato, riprova.");
					}
					
				}
				
			}
		}

		//dopo aver inserito la scelta con 1 o 2 utilizziamo lo switch per imporre un'altra
		//scelta all'utente, menu, ordinazione, o uscire dallo switch
		
		start = 3;
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
			
				confirm = false;
			} else {
				System.out.println("Hai inserito una scelta errata, riprova");
			}
			
		}
		System.out.println("Sei uscito");
		select.close();
		
		
		
		
		
	}

}

