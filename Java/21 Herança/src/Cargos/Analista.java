package Cargos;

public class Analista extends Cargos{

	//Construtor
	public Analista(String cargo, double salario) {
	this.cargo = cargo;
	this.salario = salario;
	
	}
	
	//Ir
	public void impostoRenda() {
		System.out.println(cargo+" t�ra q pagar R$ "+salario*0.20+" de IR");
			
	}
	
}
