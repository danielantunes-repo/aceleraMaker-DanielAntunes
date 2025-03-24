package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89, 0.25);

		double precoFinal1 = p1.precoComDesconto();

		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;

		double precoFinal2 = p2.precoComDesconto(0.1);

		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.printf("Preço com desconto %.2f\n", precoFinal1);
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.printf("Preço com desconto %.2f", precoFinal2);
	}
}
