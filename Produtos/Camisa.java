package Produtos;

public class Camisa extends Produto{
	private String cor;
	private String tecido;
	private String tamanho;
	
	public Camisa() {}
	
	public Camisa(String cor, String tecido, String tamanho) {
		super();
		this.cor = cor;
		this.tecido = tecido;
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
		this.tecido = tecido;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
