package acao;

import java.time.LocalDateTime;

import javax.swing.table.DefaultTableModel;

import Principal.Principal;
import beans.produto;

public class acao {

	public void cadastrar(produto p) {
		Principal.vetorProduto.add(p);
	}
	
	//Selecionar produto
	public DefaultTableModel selecionar() {
		
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Valor");
		dadosTabela.addColumn("Quantidade");
		dadosTabela.addColumn("Data");
		dadosTabela.addColumn("Hora");

	
	for(int i=0; i<Principal.vetorProduto.size(); i++) {
		dadosTabela.addRow(new Object[] {
				Principal.vetorProduto.get(i).getNome(),
				Principal.vetorProduto.get(i).getValor(),
				Principal.vetorProduto.get(i).getQuantidade(),
				Principal.vetorProduto.get(i).getData(),
				Principal.vetorProduto.get(i).getHora(),
		});
		}
	
		return dadosTabela;
	}
	
	
}
