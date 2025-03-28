package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {

		Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto);

		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;

		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

//		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		UnaryOperator<Double> arredondar = preco -> 
        new BigDecimal(preco).setScale(2, RoundingMode.HALF_UP).doubleValue();

		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

		Produto p = new Produto("Pc", 3235.89, 0.13);

		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar)
				.apply(p);
		System.out.println("Preço final " + preco);

	}
}
