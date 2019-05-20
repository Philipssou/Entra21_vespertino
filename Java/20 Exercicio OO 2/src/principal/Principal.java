package principal;

import java.util.ArrayList;

import beans.login;


public class Principal {
	
	//Arraylist
			public static ArrayList<login> vetorLogin = new ArrayList<login>();
	
	public static void main(String[] args) {
		
		//Instanciar um obj
		login adm = new login();
		adm.setNome("admin");
		adm.setSenha("admin");

		
	}

}
