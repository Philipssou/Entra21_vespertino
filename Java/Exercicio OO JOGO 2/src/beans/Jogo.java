package beans;

public class Jogo {

	
		private String nome, genero, plataforma;
		public String getPlataforma() {
			return plataforma;
		}
		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}
		private int classificacao;
		private double valor;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public int getClassificacao() {
			return classificacao;
		}
		public void setClassificacao(int classificacao) {
			this.classificacao = classificacao;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
}
