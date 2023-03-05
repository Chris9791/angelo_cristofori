package entity;

import java.util.ArrayList;



public class Utente {
	//attributi
	private String name;
	private String password;
	private String id;
//	private int contatore;
	
	//costruttori
	public Utente (String name, String password, String id) {
		this.name = name;
		this.password = password;
		this.id = id;
//		this.contatore = contatore;
	}

	public String[] createUt(
//			String name, String password, String id
			) {
//		id = "0";
//		contatore = contatore + 1;
//		
//		id.replace("0", contatore);
		
		ArrayList<String> auth = new ArrayList<String>();
//		ArrayList<E>
		
		auth.add(id);
		auth.add(name);
		auth.add(password);
		
		String[] arrayUtenti = {};
		
		arrayUtenti = auth.toArray(arrayUtenti);
		
		return arrayUtenti;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Utente name=" + name + ", password=" + password + ", id=" + id;
	}
}
