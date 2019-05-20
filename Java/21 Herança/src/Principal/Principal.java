package Principal;

import Cargos.Analista;
import Cargos.Desenvolvedor;
import Cargos.Estagi�rio;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar objetos
		Desenvolvedor d = new Desenvolvedor("Desenvolvedor jr", 2000);
		Analista a = new Analista("Analista Pleno", 4000);
		Estagi�rio e = new Estagi�rio("Estagi�rio", 1000);
		
		//Vale transporte
		d.valeTransporte();
		a.valeTransporte();
		e.valeTransporte();
		
		//IR
		d.impostoRenda();
		a.impostoRenda();
		e.impostoRenda();

	}

}
