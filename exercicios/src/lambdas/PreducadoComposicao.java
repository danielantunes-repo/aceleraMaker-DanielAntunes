package lambdas;

import java.util.function.Predicate;

public class PreducadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTreDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTreDigitos).test(33));
		System.out.println(isPar.or(isTreDigitos).test(133));
	}
	
	
	
	
}
