package Principal;

import Cargos.Analista;
import Cargos.Desenvolvedor;
import Cargos.Estagiário;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar objetos
		Desenvolvedor d = new Desenvolvedor("Desenvolvedor jr", 2000);
		Analista a = new Analista("Analista Pleno", 4000);
		Estagiário e = new Estagiário("Estagiário", 1000);
		
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
