
public class Principal {
	
		/*
		 E: Elementos de classe (String, Double, Integer, Arraylist)
		 T: Elementos de tipo (char, int, double, float, short, long)
		 K: Chaves (HashMap)
		 V: Valor (HashMap)
		 */
	
		//Método genérico
		public static <E> void listar(E[] vetor) {
			for(E elemento : vetor) {
				System.out.print(elemento+ " ");
			}
			
		}
		
		public static void main(String[] args) {
			
		//Vetores
		String [] nomes = {"Suellen" , "Cleiton", "Paloma"};
		Integer[] idades = {22, 30, 17};
		Double [] alturas = {1.70, 1.77, 1.64};

		//Chamar o método listar
		listar(nomes);
		
	}

}
