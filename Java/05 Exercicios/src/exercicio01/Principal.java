package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		Object [] op = {"Somar", "Subtrair", "Multiplicar", "Dividir"};
		int [][] numeros = new int [10][2];
		int ops=0;
		
		//Obter numeros
		numeros [0][0] = Integer.parseInt(JOptionPane.showInputDialog("1� n�"));
		numeros [1][0] = Integer.parseInt(JOptionPane.showInputDialog("2� n�"));
		numeros [2][0] = Integer.parseInt(JOptionPane.showInputDialog("3� n�"));
		numeros [3][0] = Integer.parseInt(JOptionPane.showInputDialog("4� n�"));
		numeros [4][0] = Integer.parseInt(JOptionPane.showInputDialog("5� n�"));
		numeros [5][0] = Integer.parseInt(JOptionPane.showInputDialog("6� n�"));
		numeros [6][0] = Integer.parseInt(JOptionPane.showInputDialog("7� n�"));
		numeros [7][0] = Integer.parseInt(JOptionPane.showInputDialog("8� n�"));
		numeros [8][0] = Integer.parseInt(JOptionPane.showInputDialog("9� n�"));
		numeros [9][0] = Integer.parseInt(JOptionPane.showInputDialog("10� n�"));
		
		numeros [0][1] = Integer.parseInt(JOptionPane.showInputDialog("1� n�"));
		numeros [1][1] = Integer.parseInt(JOptionPane.showInputDialog("2� n�"));
		numeros [2][1] = Integer.parseInt(JOptionPane.showInputDialog("3� n�"));
		numeros [3][1] = Integer.parseInt(JOptionPane.showInputDialog("4� n�"));
		numeros [4][1] = Integer.parseInt(JOptionPane.showInputDialog("5� n�"));
		numeros [5][1] = Integer.parseInt(JOptionPane.showInputDialog("6� n�"));
		numeros [6][1] = Integer.parseInt(JOptionPane.showInputDialog("7� n�"));
		numeros [7][1] = Integer.parseInt(JOptionPane.showInputDialog("8� n�"));
		numeros [8][1] = Integer.parseInt(JOptionPane.showInputDialog("9� n�"));
		numeros [9][1] = Integer.parseInt(JOptionPane.showInputDialog("10� n�"));
		
		ops = JOptionPane.showOptionDialog(null, "Qual opera��o deseja?", "Opera��o", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, op, 0);
		
		int i=0;
		String menu = "Tabelinha xuxu";
		
		
		if(ops == 0) {
			for(i=0; i <10; i++) {
				menu+= "\n"+numeros[i][0]+" + "+numeros[i][1]+" = "+(numeros[i][0] + numeros[i][1]);
			}
		}else if (ops == 1) {
			for(i=0; i <10; i++) {
				menu+= "\n"+numeros[i][0]+" - "+numeros[i][1]+" = "+(numeros[i][0] - numeros[i][1]);
			}
		}else if (ops == 2) {
			for(i=0; i <10; i++) {
				menu+= "\n"+numeros[i][0]+" * "+numeros[i][1]+" = "+(numeros[i][0] * numeros[i][1]);
			}
			
		}else if (ops == 3) {
			for(i=0; i <10; i++) {
				menu+= "\n"+numeros[i][0]+" / "+numeros[i][1]+" = "+(numeros[i][0] / numeros[i][1]);
			}
			
		}
	
	JOptionPane.showMessageDialog(null, menu);
		
	}

}
