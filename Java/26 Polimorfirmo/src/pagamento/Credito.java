package pagamento;

public class Credito extends Debito{

	public void tributos(double valor) {
		System.out.println(valor*0.04);
	}

	//M�todo Mensagem
	public void msg() {
		System.out.println("Reescrevend metodo msg");
	}

	
}
