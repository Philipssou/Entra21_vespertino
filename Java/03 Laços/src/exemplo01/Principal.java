package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Obter o n�mero
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		
		//Tabuada
		String tabuada = "A tabuada de "+numero+" �:";

		
		//La�o
		int indice = 0;
		while (indice <= 10) {
			tabuada+= "\n"+numero*indice;
			indice++;
			}
		
		//Exibir
		JOptionPane.showMessageDialog(null, tabuada);
		
		
	}

}
