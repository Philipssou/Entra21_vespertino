package acao;

import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;

import beans.produto;
import dados.dados;


public class acao {

	//Cadastrar quantidade
	public void quantidade(produto q) {
		dados.vetorProdutos.add(q);
	}	
	
	//Selecionar
		public DefaultTableModel selecionar() {
			
			DefaultTableModel dadosTabela = new DefaultTableModel();
			dadosTabela.addColumn("Arroz");
			dadosTabela.addColumn("Feij�o");
			dadosTabela.addColumn("Batata");
			dadosTabela.addColumn("Ma��");
			dadosTabela.addColumn("Gtx 2080 TI");
			dadosTabela.addColumn("Alface");
			dadosTabela.addColumn("Repolho");
			dadosTabela.addColumn("Laranja");
			
			for(int i=0; i< dados.vetorProdutos.size(); i++) {
				dadosTabela.addRow(new Object[] {
						dados.vetorProdutos.get(i).getArroz(),
						dados.vetorProdutos.get(i).getFeijao(),
						dados.vetorProdutos.get(i).getBatata(),
						dados.vetorProdutos.get(i).getAlface(),
						dados.vetorProdutos.get(i).getGtx(),
						dados.vetorProdutos.get(i).getLaranja(),
						dados.vetorProdutos.get(i).getMa�a(),
						dados.vetorProdutos.get(i).getRepolho(),
				});
			}
			
		return dadosTabela;
		}
	
	//Contador
	public double contar (int selectItem){
		
		int contar = 0;
		
	if (contar == 0) {
		contar++;
	}
	
	return contar;
	}

	public double descontar (int selecItem) {
		
		int descontar = 0;
		
		if (descontar == 0) {
			descontar++;
		}
		return descontar;
	}

	
}
