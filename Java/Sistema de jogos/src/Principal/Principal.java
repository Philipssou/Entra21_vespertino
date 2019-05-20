package Principal;

import java.util.ArrayList;

import beans.jogo;
import formulario.FormularioPrincipal;

public class Principal {
	
	//ArrayList
	public static ArrayList<jogo> vetorJogos = new ArrayList<jogo>();
	
	
	public static void main(String[] args) {
				FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true);
	}
}
