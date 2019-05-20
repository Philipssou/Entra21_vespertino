package atividade13;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		
		System.out.println("Antecessor: "+(num-1)+"\nSucessor: "+(num+1));
	
	}
}
