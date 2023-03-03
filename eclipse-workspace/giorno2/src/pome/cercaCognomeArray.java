package pome;

import java.util.ArrayList;
import java.util.Scanner;

public class cercaCognomeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaNomi = new ArrayList<String>();
		Scanner obj = new Scanner(System.in);
		boolean confirm = true;
		String Marca;
		
		while (confirm == true) {
			System.out.println("Inserisci un nome, se inserisci quit termina l'inserimento");
			Marca = obj.nextLine();
			if (Marca.equals("quit")) {
				System.out.println(listaNomi);
				System.out.println("lista ordinata: ");
				listaNomi.sort(null);
				System.out.println(listaNomi);
				obj.close();
				confirm = false;
			} else {
				listaNomi.add(Marca);
			}
			
		}
		
	}

}
