package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Opçôes de cores
		Object[] cores = {"Vermelho","Azull","Rosa", "Amarelo", "Verde"};
		
		
		//Variáveis
		int vermelho=0, azul=0, rosa=0, amarelo=0, verde=0;
		int cor, continuar=0;
		 
		
		//Laço
		do {
			//Selecionar as cores
			cor = JOptionPane.showOptionDialog(null, 
					"Qual a cor do seu power ranger favorito?",
					"",
					JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, 
					null,
					cores,
					0);
			
			//Contabilizar os votos
			switch (cor) {
				case 0:
					vermelho++;
				break;
			
				case 1:
					azul++;
				break;
			
				case 2:
					rosa++;
				break;
			
				case 3:
					amarelo++;
				break;
			
				case 4:
					verde++;
				break;
			
			}
			
			
			//Verificar se deseja continuar
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			}while(continuar == 0);
		
			//Exibir resultados
			String resultado = "Votação de core: ";
			 	   resultado+="\nVermelho obteve: "+vermelho;
			 	   resultado+="\n Azul obteve: "+azul;
			 	   resultado+="\nRosa obteve: "+rosa;
			 	   resultado+="\nAmarelo obteve: "+amarelo;
			 	   resultado+="\nVerde obteve: "+verde;
			
			 JOptionPane.showMessageDialog(null, resultado);
		
	}

}
