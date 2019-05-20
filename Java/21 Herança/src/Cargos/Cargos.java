package Cargos;

public class Cargos {

	//Atributos
	protected String cargo;
	protected double salario;

	//Vale transporte
	public void valeTransporte() {
		System.out.println("O cargo "+cargo+", terá i, desconto de Vale Transporte no valor de R$ "+salario*0.06);
	}
	
}
