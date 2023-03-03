package pome;

import java.util.Scanner;

public class Matricola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dichiaro le variabili
		String lista = "";
		Scanner obj = new Scanner(System.in);
		String firstName;
		String lastName;
		String matricola;
		
		boolean confirm = true;
		
		while (confirm == true) {
			System.out.println("Inserisci il cognome dello studente");
			lastName = obj.nextLine();
			
			if (lastName.equals("quit")) {
				
				System.out.println("prima di uscire inserisci un cognome da ricercare:");
				lastName = obj.nextLine();
				if (lista.contains(lastName)) {
					System.out.println("Tra gli studenti c\'è lo studente " + lastName);
				} else {
					System.out.println("Tra gli studenti non c\'è lo studente " + lastName);
				}
//				int contatore = 0;
//				while (lista.contains(lastName)) {
//					contatore++;
//		implementa contatore
//				}
				
				obj.close();
				confirm = false;
				System.out.println("uscito dal programma");
				//inserire ricerca del cognome
			} else {
				
				System.out.println("Inserisci il nome dello studente");
				firstName = obj.nextLine();
				System.out.println("Inserisci la matricola dello studente");
				matricola = obj.nextLine();
				lista = lista + lastName + " " + firstName + " " + matricola + " ";
				System.out.println(lista);
			}
			


		}
		
		

		
		
	}

}
