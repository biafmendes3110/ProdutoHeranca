package Produtos;

public class Sorvete extends Produto{
	private double tempAdequado;

	public Sorvete() {}
	public Sorvete(double tempAdequado) {
		super();
		this.tempAdequado = tempAdequado;
	}

	public double getTempAdequado() {
		return tempAdequado;
	}

	public void setTempAdequado(double tempAdequado) {
		this.tempAdequado = tempAdequado;
	}
	
}
