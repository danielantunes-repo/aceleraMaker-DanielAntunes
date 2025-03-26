package oo.composicao.desafioUm;

public class Sistema {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Daniel Junior");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caderno", 8.0, 10);
		compra1.adicionarItem(new Produto("Tv", 2000.0), 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("livro", 30, 5);
		compra2.adicionarItem(new Produto("Pc", 3500.0), 1);
		
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
