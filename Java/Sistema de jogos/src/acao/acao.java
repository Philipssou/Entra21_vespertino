package acao;

import javax.swing.table.DefaultTableModel;

import Principal.Principal;
import beans.jogo;

public class acao {

	//Cadastrar jogo
	public void cadastrar(jogo j) {
		Principal.vetorJogos.add(j);
		
	}
	
	//Selecionar jogos
	public DefaultTableModel selecionar() {
		
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Gênero");
		dadosTabela.addColumn("Plataforma");
		dadosTabela.addColumn("Classificação");
		dadosTabela.addColumn("Valor");
		
		for(int i=0; i<Principal.vetorJogos.size(); i++) {
			dadosTabela.addRow(new Object[] {
				Principal.vetorJogos.get(i).getNome(),
				Principal.vetorJogos.get(i).getGenero(),
				Principal.vetorJogos.get(i).getPlataforma(),
				Principal.vetorJogos.get(i).getClassicacao(),
				Principal.vetorJogos.get(i).getValor(),
			});
		}
		
		return dadosTabela;
	
	}
	
	//Excluir  jogo
	public void excluir(int indice) {
		Principal.vetorJogos.remove(indice);
	}
	
	//Alterar jogo
	public void alterar(int indice, jogo j) {
		Principal.vetorJogos.set(indice, j);
	}
	
	
}
