package lambdas;

public class Produto extends Object{

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precofinal = preco * (1 - desconto);
		return "Nome: " + nome + " tem o preço de R$" + precofinal;
	}
	
	
	
}
