package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double numA = 6 * (3 + 2);
		double numeradorA = Math.pow(numA, 2);
		double denominadorA = 3 * 2;
		
		double ladoEsquerdo = numeradorA / denominadorA;
		
		double numB = (1 -5) * (2 - 7);
		double denominadorB = 2;
		
		double ladodireito = Math.pow(numB /denominadorB , 2);
		
		double resultadoAMenosB = ladoEsquerdo - ladodireito;
		
		double numerador = Math.pow(resultadoAMenosB, 3);
		double denominador = (int) Math.pow(10, 3);
		
		double resultado = numerador / denominador;
		
		
		System.out.println(resultado);
		
	}
}
