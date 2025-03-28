package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		CarroDesafioFilter c1 = new CarroDesafioFilter("Uno", 15000.00, false);
		CarroDesafioFilter c2 = new CarroDesafioFilter("Gol", 25000.00, false);
		CarroDesafioFilter c3 = new CarroDesafioFilter("HB20", 55000.00, true);
		CarroDesafioFilter c4 = new CarroDesafioFilter("Palio", 23000.00, false);
		CarroDesafioFilter c5 = new CarroDesafioFilter("Corolla", 150000.00, true);
		
		List<CarroDesafioFilter> carros = Arrays.asList(c1, c2, c3, c4, c5);
		
		Predicate<CarroDesafioFilter> carrosCaros = c -> c.preco >= 50000;
		Predicate<CarroDesafioFilter> temAr = c -> c.arCondicionado;
		
		Function<CarroDesafioFilter, String> carroComAr =
				c -> "O " + c.nome + " tem o valor de mercado de R$" + c.preco + " e tem ar condicionado";
		
		
		carros.stream()
			.filter(carrosCaros)
			.filter(temAr)
			.map(carroComAr)
			.forEach(System.out::println);
	}
}
