package atividade18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double le = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para le"));
		double ld = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para ld"));
		double li = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para li"));
		
		if(le < (ld + li) && ld < (le + li)) {
			
			if((le == ld) && (le == li)) {
				System.out.println("Triangulo equilátero");
				
			} else if((le == ld) || (le == li) || (li == ld)) {
				System.out.println("Triangulo isoceles");
			}else {
				System.out.println("Triangulo escaleno");
			}
			
		}else {
			System.out.println("Não é triangulo");
		}
		
	}
}
