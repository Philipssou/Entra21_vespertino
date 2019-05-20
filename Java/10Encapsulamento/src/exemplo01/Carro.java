package exemplo01;

public class Carro {

	/*	ENCAPSULAMENTO: Visibilidade de atributos e metodos
		DEFAULT: Atributos e métodos visíveis em todo o pacote
		PUBLIC: Atributos e métodos visíveis em todo o projeto
		PRIVATE: Atributos e métodos visíveis apenas na classe onde são criados
		PROTECTED: Atributos e métodos visíveis apenas nos pacotes onde são criados ou em classes
		herdadas
	*/
	
	//Atibutos
	private String modelo, fabricante;
	private int ano;
	
	//Set and Get
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
