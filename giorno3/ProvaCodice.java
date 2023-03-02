package giorno3;

import java.util.Scanner;

public class ProvaCodice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner text = new Scanner(System.in);
		
		String name;
		String password;
		Integer identificativo = 0;
		boolean confirmUs = true;
		
		
		while (confirmUs == true) {
			
			System.out.println("Inserisci username:");
			name = text.nextLine();
			System.out.println("Inserisci password:");
			password = text.nextLine();
			identificativo += 1;
			String appoggio = String.valueOf(identificativo);
//			System.out.println(appoggio);
			
			
			Utente utenza = new Utente (name, password, appoggio);
			String[] user = utenza.createUt();
			System.out.println("");
			
			for (int i=0; i<user.length; i++) {
				System.out.println(user[i]);
			}
			
			System.out.println("vuoi continuare? s/n:");
			String cart = text.nextLine();
			if (cart == "n") {
				text.close();
				confirmUs = false;
			}
		}

		
		
	}

}
