package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Lapis", 10.00, 0.09);
//		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Borracha", 6.00, 0.13);
		Produto p3 = new Produto("Mochila", 53.00, 0.36);
		Produto p4 = new Produto("Pc", 3000.00, 0.12);
		Produto p5 = new Produto("Tablet", 800.00, 0.22);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4,p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
