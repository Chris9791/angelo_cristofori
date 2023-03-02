package giorno3;

import java.util.ArrayList;

public class Utente {
	//attributi
	private String name;
	private String password;
	private String id;
	private int contatore;
	
	//costruttori
	public Utente (String name, String password, String id, int contatore) {
		this.name = name;
		this.password = password;
		this.id = id;
		this.contatore = contatore;
	}

	public String[] createUt(String name, String password, String id) {
		
		
		ArrayList<String> auth = new ArrayList<String>();
//		ArrayList<E>
		
		auth.add(name);
		auth.add(password);
		auth.add(id);
		
		return null;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Utente name=" + name + ", password=" + password + ", id=" + id;
	}
}
