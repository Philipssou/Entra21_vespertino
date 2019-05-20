package prova;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Variaveis
		
		Object [] pagamento = {"A vista", "A prazo"};
		Object [] sexos = {"Masculino", "Feminino"};
		Object [] departamentos = {"Audio/Video", "Informática", "Vestuário"};
		Object [] subdep1 = {"Tvs", "Aparelho de som"};
		Object [] subdep2 = {"Hardware", "Software"};
		Object [] subdep3 = {"Masculino", "Feminino"};
		Object [] subdep11 = {"Smart TV Led 49 Samsung - R$ 4.999,99 ", "Smart TV 4k LG 60 - R$7.499,00 ", "Smart TV Full HD 32 Samsung - R$ 1.710,00"};
		Object [] subdep22 = {"Semp Toshiba Áudio Bright - R$ 599,99","Mini System LG - R$ 512,00","Mini System Philco - R$ 499,9"};
		Object [] subdep33 = {"Placa Mãe Asus - R$ 2.000,00"};
		Object [] subdep111 = {"Camisa Social Lacoste - R$ 200,00 ","Calça Jeans Calvin Klein R$ 230,00","Camisa Social Dudalina - R$ 130,00 "};
		
		
		
		//variaveis para contar
		int tv49=0,tv60=0,sta=0,mslg=0,msph=0,pam=0,mrc=0,mm=0,win10=0,off=0,ac3d=0,csl=0;
		int jvm=0,mjvm=0,mveio=0,mtveio=0;
		int msc=0,fmn=0,nome=0,idade=0;
		int sistema;
		int continuar = 0;
		boolean continua = true;
		
		
		
		//Laço das perguntas se quer utilizar o sistema
		
	do {
	
		
		
		sistema = Integer.parseInt(JOptionPane.showInputDialog("Deseja realmente usar o sistema? 1-SIM 2-NÃO"));
		if (sistema == 2) {
			JOptionPane.showMessageDialog(null, "Nenhuma venda foi realizada");
		}else {
			continua = false;
		}
			
			
	}while (continua == true);
	
	//Variaveis 2parte
	
		String nomes = JOptionPane.showInputDialog("Insira seu nome");
		nome++;
		int sexo = JOptionPane.showOptionDialog(null, "Qual seu sexo", "Sexo", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
		int idades = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
	
		
	//contagem sexo	
	if (sexo == 0) {
		msc++;
	}else {
		fmn++;
	}
	
	//LAÇO
		do {
		
			int departamento = JOptionPane.showOptionDialog(null, "Informe o departamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, departamentos, 0);
			int coisa = 0;
			int coisa1 = 0;
			//1 departamento
			switch (departamento) {
			case 0:
				departamento = JOptionPane.showOptionDialog(null, "Informe o Aparelho", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdep1, 0);
			break;
			}
				
				switch (coisa) {
				case 0:
					coisa = JOptionPane.showOptionDialog(null, "Informe o aparelho que deseja", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdep11, 0);
					switch (coisa1) {
					case 0:
						JOptionPane.showMessageDialog(null, "Smart TV Led 49 Samsung - R$ 4.999,99");
						tv49++;
						break;
					
					case 1:
						JOptionPane.showMessageDialog(null, "Smart TV 4k LG 60 - R$7.499,00");
						tv60++;
						break;
					
					case 2:
						JOptionPane.showMessageDialog(null, "Smart TV Full HD 32 Samsung - R$ 1.710,00");
					}		
				}
				switch (coisa) {
				case 1:
					coisa = JOptionPane.showOptionDialog(null, "Informe o aparelho que deseja", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdep22, 0);
					switch (coisa1) {
					case 0:
						JOptionPane.showMessageDialog(null, "Semp Toshiba Áudio Bright - R$ 599,99");
						sta++;
						break;
					
					case 1:
						JOptionPane.showMessageDialog(null, "Mini System LG - R$ 512,00");
						mslg++;
						break;
					
					case 2:
						JOptionPane.showMessageDialog(null, "Mini System Philco - R$ 499,9");
						msph++;
						break;
					
					}
				}
				
		
			//2 departamento	
			switch (departamento) {
			case 1:
				departamento = JOptionPane.showOptionDialog(null, "Informe o Aparelho", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdep2, 0);
			break;
			}
	
				switch (coisa) {
				case 0:
					coisa = JOptionPane.showOptionDialog(null, "Informe o aparelho que deseja", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdep11, 0);
					switch (coisa1) {
					case 0:
						JOptionPane.showMessageDialog(null, "Placa Mãe Asus - R$ 2.000,00");
						pam++;
						break;
					
					case 1:
						JOptionPane.showMessageDialog(null, "Memória Ram Corsair 4GB - R$500,00 ");
						mrc++;
						break;
				
					case 2:
						JOptionPane.showMessageDialog(null, "Mouse Multilaser - R$59,90");
						mm++;
						break;
					}
				}
				switch (coisa ) {
				case 1:
					coisa = JOptionPane.showOptionDialog(null, "Informe o aparelho que deseja", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdep22, 0);
					switch (coisa1) {
					case 0:
						JOptionPane.showMessageDialog(null, "Windows 10  - R$500,00 ");
						win10++;
						break;
					
						case 1:
							JOptionPane.showMessageDialog(null, "Office 2019   - R$399,99");
							off++;
							break;
					
							case 2:
								JOptionPane.showMessageDialog(null, "AutoCard 3D - R$899,5 ");
								ac3d++;
								break;
					}
				}
				
			//3 departamento
			switch (departamento) {
			case 2:
				departamento = JOptionPane.showOptionDialog(null, "Informe o Aparelho", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdep3, 0);
			break;
			}
		
			switch (coisa) {
			case 0:
				coisa = JOptionPane.showOptionDialog(null, "Informe o aparelho que deseja", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, subdep111, 0);
				switch (coisa1) {
				case 0:
					JOptionPane.showMessageDialog(null, "Camisa Social Lacoste - R$ 200,00 ");
					csl++;
					break;
				
				}
			}
			
			
			//Perguntar pagamento
			int pagamentos;
			
			pagamentos = JOptionPane.showOptionDialog(null, "Como deseja pagar?", null, JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, pagamento, 0);
		
			
			
			//Calcular pagamento
			if (pagamentos == 1) {
				JOptionPane.showMessageDialog(null, pagamento);
			}else {
				JOptionPane.showMessageDialog(null, "Pagamento com Áudio/Vídeo - 5% ● Informática - 10% ● Vestuário - 15%");
			}
			
			//final do laço		
		}while (continuar == 0);	
	
		//calculando idade
		
		if (idade <= 17) {
			jvm++;
		
		}else {
			if(idade >= 18 && idade <= 30) {
				mjvm++;
			}else {
				if (idade >= 31 && idade <= 50) {
					mveio++;
				}else {
					if (idade > 50) {
						mtveio++;
					}
				}
			}
		}
			
			
		//Validar pagamento
		
		//Resposta
		String resultado = "Clientes que utilizaram o sistema"+nome;
			   resultado+= "\nHomens: "+((msc * 100) / (fmn+msc))+"%";
			   resultado+= "\nMulheres: "+((fmn * 100) / (fmn+msc))+"%";
			   resultado+= "\n";
			   resultado+= "\nPessoa com menos de 17 anos "+jvm;
			   resultado+= "\nPessoa com idade entre 18 e 30 anos "+mjvm;
			   resultado+= "\nPessoa com idade entre 31 e 50 anos "+mveio;
			   resultado+= "\nPessoa com idade maior que 50 anos "+mtveio;
			   
			   resultado+= "\n";
			   resultado+= "\nQuantidade de produtos adquiridos no departamento de audio/video "+(tv49+tv60+sta+mslg+msph);
			   resultado+= "\nQuantidade de produtos adquiridos no departamento de informatica"+(pam+mrc+mm+win10+off+ac3d);
			   resultado+= "\n";
			   resultado+= "\n";
			   
	}

}
