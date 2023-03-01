package giorno3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ristorante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu = {
				"Pasta al sugo, 6, pasta - pelati - formaggio",
				"Carbonara, 10, pasta - uova - pecorino - guanciale",
				"Pasta al pesto, 8, pasta - pesto"				
		};
		ArrayList<String> carrello = new ArrayList<String>();
		
		boolean confirm = true;
		Scanner select = new Scanner(System.in);
		int start;
		//variabile scelta ordina o esci
		int scelta1 = -1;
		//variabile scelta vedi menu, ordina e esci
		int scelta2;
		//variabile scelta ordini
		int scelta3;
		
//		System.out.println(menu.length);
		
		
		System.out.println("Vuoi ordinare o uscire?\nPremi:\n1) per ordinare\n2) per uscire");
		start = select.nextInt();
//		System.out.println(scelta);
		//dopo aver inserito la scelta con 1 o 2 utilizziamo lo switch per imporre un'altra
		//scelta all'utente, menu, ordinazione, o uscire dallo switch
		if (start == 1) {

			while(scelta1 < 1 || scelta1 > 3 ) {
				System.out.println("Scegli tra le seguenti opzioni:\n1) Vedi menu\'\n2) "
						+ "Ordina un piatto\n3) Esci");
				scelta2 = select.nextInt();
				switch (scelta2) {
				case 1: //scelta di vedere il menù
					System.out.println("menu:");
					for (int i=0; i<menu.length; i++) {
						System.out.println(menu[i].split(",")[0] + ". Ingredienti: " + menu[i].split(",")[2].trim());
					}
					System.out.println("\n");
//					scelta1 = scelta2;
					break;
				case 2: //scelta per ordinare un piatto
					System.out.println("ordina selezionando uno dei numeri proposti");
					for (int i=0; i<menu.length; i++) {
						System.out.println(i+1 + ") " + menu[i].split(",")[0] + " € " + menu[i].split(",")[1].trim());
					}
					System.out.println("\n");
					scelta3 = select.nextInt();
					System.out.println("Hai scelto " + menu[scelta3 - 1].split(",")[0]);

					break;
				case 3: //scelta per uscire
					System.out.println("esci");
					scelta1 = scelta2;
					break;
				default:
					System.out.println("Hai inserito un numero errato, riprova.");
//					scelta = select.nextInt();
				}
				
				
			}
			
		} else if (start == 2) {
			
		}
		
		
		
		
	}

}
