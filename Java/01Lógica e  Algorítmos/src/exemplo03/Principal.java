package exemplo03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*Exibindo mensagens
		JOptionPane.showMessageDialog(null, "Hoje � ter�a-feira");
		JOptionPane.showMessageDialog(null, "Erro", "T�tulo",  JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Perigo", "T�tulo",  JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Tudo bem?", "T�tulo",  JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Isso � Java!", "T�tulo",  JOptionPane.INFORMATION_MESSAGE);
		*/
		
		/*Obter dados
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		String mensagem = "Nome: " +nome;
			   mensagem += "\nIdade: " +idade;
			   mensagem += "\nAltura: " +altura;
		JOptionPane.showMessageDialog(null, mensagem);
		*/
		
		/*Caixa de confirma��o
		int resposta = JOptionPane.showConfirmDialog(null, "Gostando de Java?");
		
		switch(resposta) {
			case 0:
			JOptionPane.showMessageDialog(null, "Que legal!");
			break;
			
			case 1:
			JOptionPane.showMessageDialog(null, "Que pena");
			break;
			
			case 2:
			JOptionPane.showMessageDialog(null, "Voc� cancelou");
			break;
			
			default:
			JOptionPane.showMessageDialog(null, "Voc� finalizou");
			}*/
		}
}
