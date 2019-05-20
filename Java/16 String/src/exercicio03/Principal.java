package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String verbo;
		String comeco = "";
		String verifica = "ar";
		String menu = "TicoLiro"+"\n";
		
		
		verbo = JOptionPane.showInputDialog("Informe um verbo terminado em AR");

			if(verbo.endsWith(verifica)) {
				for(int i=0 ; i <verbo.length()-2; i++) {
					comeco += verbo.charAt(i);
				}
			}else {
				JOptionPane.showMessageDialog(null, "TU NÃO SABE OQUE É VERBO SUA ANTA QUADRADA, MAIS CHATO QUE CHINELO DE GORDO!");
			}
	
			menu += "\n"+comeco+"o";
			menu += "\n"+comeco+"as";
			menu += "\n"+comeco+"a";
			menu += "\n"+comeco+"amos";
			menu += "\n"+comeco+"áis";
			menu += "\n"+comeco+"am";
			
			JOptionPane.showMessageDialog(null, menu);
			
			
	}

}
