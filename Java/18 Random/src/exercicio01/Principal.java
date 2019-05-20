package exercicio01;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		QUESTÃO q1 = new QUESTÃO();
		q1.setQuestao("Qual a cor do céu verde");
		q1.setRespostas("C) Verde");
		q1.setAlternativaA("A) Azul");
		q1.setAlternativaB("B) Rosa");
		q1.setAlternativaC("D) Vermelho claro");
		
		
		QUESTÃO q2 = new QUESTÃO();
		q2.setQuestao("Qual a cor do sagu");
		q2.setRespostas("A) Roxo");
		q2.setAlternativaA("B) Violeta escuro"); 
		q2.setAlternativaB("C) Marrom");
		q2.setAlternativaC("D) Crocodilo");
		
		
		QUESTÃO q3 = new QUESTÃO();
		q3.setQuestao("Em que estado corre o rio são francisco");
		q3.setRespostas("B) Liquido");
		q3.setAlternativaA("A) Solido");
		q3.setAlternativaB("C) São Francisco");
		q3.setAlternativaC("D) São Paulo");
		
		QUESTÃO q4 = new QUESTÃO();
		q4.setQuestao("Que cor fica uma pedra vermelha num lago azul");
		q4.setRespostas("A) Molhada");
		q4.setAlternativaA("B) Seca");
		q4.setAlternativaB("C) Roxa");
		q4.setAlternativaC("D) Cabeluda");
		
		
		QUESTÃO q5 = new QUESTÃO();
		q5.setQuestao("Quem é o cara que vai dar 10 na proxima prova");
		q5.setRespostas("C) Ralf");
		q5.setAlternativaA("A) Gustavo");
		q5.setAlternativaB("B) Jorge");
		q5.setAlternativaC("D) Irineu");

		
		QUESTÃO q6 = new QUESTÃO();
		q6.setQuestao("Por que banho maria se chama banho maria se na epoca da maria nao tinha banho");
		q6.setRespostas("D) Não sei");
		q6.setAlternativaA("A) Jesus");
		q6.setAlternativaB("B) PrOwAy");
		q6.setAlternativaC("C) Estilo Michael Jackson");
		
		QUESTÃO q7 = new QUESTÃO();
		q7.setQuestao("Qual a capital do Acre");
		q7.setRespostas("B) Rio Branco");
		q7.setAlternativaA("A) Dinossauro");
		q7.setAlternativaB("C) Lima");
		q7.setAlternativaC("D) Rio de Janeiro");
		
		QUESTÃO q8 = new QUESTÃO();
		q8.setQuestao("Que elemento se junta com o carbono para fazer o gas carbonico");
		q8.setRespostas("B) Oxigenio");
		q8.setAlternativaA("A) Carbono");
		q8.setAlternativaB("C) Ar");
		q8.setAlternativaC("D) Bario");
		
		QUESTÃO q9 = new QUESTÃO();
		q9.setQuestao("Quem foi Michael Jackson");
		q9.setRespostas("A) Cantor");
		q9.setAlternativaA("B) Me solta, eu quero minha mãe");
		q9.setAlternativaB("C) Medico");
		q9.setAlternativaC("D) Um viajante no tempo");
		
		QUESTÃO q10 = new QUESTÃO();
		q10.setQuestao("Quem foi Gustavo Baroni Bruder");
		q10.setRespostas("A) O mendigo la da esquina");
		q10.setAlternativaA("B) Embaixador");
		q10.setAlternativaB("C) Medico");
		q10.setAlternativaC("D) Diplomata");
		
		QUESTÃO q11 = new QUESTÃO();
		q11.setQuestao("Que horas são");
		q11.setRespostas("B) Mesma hora de ontem mas 24h depois");
		q11.setAlternativaA("A) 24h");
		q11.setAlternativaB("C) 13h");
		q11.setAlternativaC("D) 9h");
		
		QUESTÃO q12 = new QUESTÃO();
		q12.setQuestao("Quem foi Abraham Lincon");
		q12.setRespostas("A) Caçador de bruxas");
		q12.setAlternativaA("B) Primeiro presidente dos EUA");
		q12.setAlternativaB("C) Revolucionario");
		q12.setAlternativaC("D) Confeiteiro");
		
		QUESTÃO q13 = new QUESTÃO();
		q13.setQuestao("De quem é a famosa frase MY NAME IS...");
		q13.setRespostas("C) John Cena");
		q13.setAlternativaA("A) João Cena");
		q13.setAlternativaB("B) Cena John");
		q13.setAlternativaC("D) aneC nhoJ");
		
		QUESTÃO q14 = new QUESTÃO();
		q14.setQuestao("OLOKINHO MEU");
		q14.setRespostas("D) Um meme");
		q14.setAlternativaA("A) Um mene");
		q14.setAlternativaB("B) Faustão");
		q14.setAlternativaC("C) Ta pegando fogo bixo");
		
		QUESTÃO q15 = new QUESTÃO();
		q15.setQuestao("Qual a raiz de 36");
		q15.setRespostas("B) 6");
		q15.setAlternativaA("A) 36 é numero nao arvore");
		q15.setAlternativaB("C) 9");
		q15.setAlternativaC("D) 12");
		
		ArrayList<QUESTÃO> questoes = new ArrayList<QUESTÃO>();
		
		questoes.add(q1);
		questoes.add(q2);
		questoes.add(q3);
		questoes.add(q4);
		questoes.add(q5);
		questoes.add(q6);
		questoes.add(q7);
		questoes.add(q8);
		questoes.add(q9);
		questoes.add(q10);
		questoes.add(q11);
		questoes.add(q12);
		questoes.add(q13);
		questoes.add(q14);
		questoes.add(q15);
	
		//Random
			int numeros [] = new int [10];
			boolean existe = false;
			int numero;
			int indice = 0;
			//Random
			Random gerar = new Random ();
			
			//Laço
			
			while(indice < 10){
				
				//Gerar um número
				numero = gerar.nextInt(15);
				
				//Verificar se o número existe
				existe=false;
				
				for(int i=0; i<10; i++){
					if(numero == numeros[i]) {
						existe = true;
					}
				}
				
				//Condicional
				if(existe == false) {
					numeros[indice] = numero;
					indice++;
				}
			}
			
			for(int n:numeros) {
				System.out.println(n);
			}
			
			
			
			
		}
		
		
}


