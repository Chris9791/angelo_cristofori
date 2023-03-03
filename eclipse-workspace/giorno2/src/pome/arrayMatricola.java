package pome;

public class arrayMatricola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cercare tramite matricola uno studente, in caso positivo 
		//manda in output gli attributi della matricola
		String [] elencoStud = {
				"Angelo, Cristofori, #1",
				"Studente, Prova, #2",
				"Stud, ProvaProva, #3"
		};
		String matr = "4";
		
		int i;
		int contatore = 0;
		
		for(i=0; i<elencoStud.length; i++) {
			if (elencoStud[i].split(",")[2].trim().substring(1).equals(matr)) {
				System.out.println(elencoStud[i]);
				contatore++;
			}
		}
		if(contatore == 0) {
			System.out.println("matricola non trovata");
		}
	}

}
