package pome;

public class StringaDivisione {
	
	public static String[] dividiStringa (String stringa) {
//		elencoStud[i].split(",")[2].trim().substring(1).equals(matr)
		String[] newStr = new String[2];
		//ciao
		int l = stringa.length()/2;
		newStr[0] = stringa.substring(0, l);
		newStr[1] = stringa.substring(l);
		return newStr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prova = "ciao";
		String[ ] s=dividiStringa(prova);
		for(int i=0;i<2;i++) {
			
			System.out.println(s[i]);
		}			

	}

}
