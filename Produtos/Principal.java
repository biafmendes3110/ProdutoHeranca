package Produtos;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Produto produto = new Produto(1,"Beatriz",800); 
	System.out.println("id: "+produto.getId());
	System.out.println("nome: " +produto.getNome());
	System.out.println("preco: "+produto.getPreco());
	
	Sorvete sorvete = new Sorvete(10); 
	System.out.println("tempo adequado: "+sorvete.getTempAdequado());
	
	Camisa camisa = new Camisa("vermelha", "seda", "16");
	System.out.println("cor: "+camisa.getCor());
	System.out.println("tecido: "+camisa.getTecido());
	System.out.println("tamanho"+camisa.getTamanho());
}
}
