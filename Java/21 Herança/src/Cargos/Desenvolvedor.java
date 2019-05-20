package Cargos;

public class Desenvolvedor extends Cargos{

	//Construtor
	public Desenvolvedor(String cargo, double salario) {
	this.cargo = cargo;
	this.salario = salario;
		
	}
	
	//Ir
	public void impostoRenda() {
		System.out.println(cargo+" téra q pagar R$ "+salario*0.10+" de IR");
		
	}
	
}
