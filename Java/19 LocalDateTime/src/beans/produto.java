package beans;

public class produto {

	//Atributos
	private String nome;
	private double valor;
	private int quantidade;
	private String hora, minuto;
	private String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}
	
	public String getHora() {
		return hora;
	}
	public String getMinuto() {
		return minuto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
