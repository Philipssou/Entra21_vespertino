package exercicio02;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		String matriz [][] = new String [5][31];
		
		String gerante;
		
		Random gerar = new Random ();
		
		int numero = gerar.nextInt(10);
		
		String quantidade = "";
		
		
		
		
		
		
		gerante = quantidade.valueOf(numero);
		
		//Adicionando dados em cada posição
		for(int linha=0; linha <5; linha++) {
			for (int coluna=0; coluna<30; coluna++) {
				
				
				matriz [2] [15] = gerante;

				matriz [linha] [coluna] = " ";	
				
				if(coluna == 0||coluna == 29||linha == 0||linha == 4) {
					matriz[linha][coluna] = "*";
					
				}
			
			}
			
		}
		
		//Exibir estrutura da matriz
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<30; coluna++) {
				System.out.print(matriz[linha][coluna]+" ");
			}
			System.out.println();
		}		

	}

}
