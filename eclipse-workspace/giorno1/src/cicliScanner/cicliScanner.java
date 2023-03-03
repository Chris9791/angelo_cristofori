package cicliScanner;

public class cicliScanner {
	public static void main(String[] args) {
		//dato in ingresso due numeri il ciclo si ripete se la somma dei due numeri è pari
		//oppure uno dei due numeri è maggiore di 100
		//stampa la somma se o è pari o è maggiore di 100
		// da 0 alla somma
		
		
		
		int a = 2;
		int b = 2;
		int somma = a + b;
		int i = 1;
		
		System.out.println("la somma è: " + somma);
		
		while ((somma%2 == 0 || somma > 100 ) && i<=somma) {

//			if (i<=somma) {
				System.out.println(i);
				i++;
//			}
						
		}
	
		

		
		
	}
}
