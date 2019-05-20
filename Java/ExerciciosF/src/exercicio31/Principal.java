package exercicio31;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome1 = JOptionPane.showInputDialog("Insira o nome 1");
		int id1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
		String nome2 = JOptionPane.showInputDialog("Insira o nome 2");
		int id2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
		String nome3 = JOptionPane.showInputDialog("Qual o nome 3");
		int id3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
		
		if (id1 > id2 && id1 > id3 ) {
			JOptionPane.showMessageDialog(null, "O mais velho é "+nome1+" com idade de "+id1);
		}else {
			if (id2 > id1 && id2 > id3 ) {
				JOptionPane.showMessageDialog(null, "O mais velho é "+nome2+" com idade de "+id2);
		}else {
			if (id3 > id1 && id3 > id2 ) {
				JOptionPane.showMessageDialog(null, "O mais velho é "+nome3+" com idade de "+id3);
				
		}
		
		
		
	}

}
}
}