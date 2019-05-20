package principal;

import java.util.ArrayList;

import beans.Jogo;
import formulario.FormularioPrincipal;

public class Principal {

	
	public static ArrayList<Jogo>vetorJogos = new ArrayList<Jogo>();
	
	
	public static void main(String[] args) {
		
		FormularioPrincipal frame = new FormularioPrincipal();
		frame.setVisible(true);

			
			
	}

}
