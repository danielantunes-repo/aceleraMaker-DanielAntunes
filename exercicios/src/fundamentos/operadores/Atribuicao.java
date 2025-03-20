package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= b; // c = c - b;
		c *= b; // c = c * b;
		c /= b; // c = c / b;
		
		System.out.println(c);
		c %= b; // c = c % b; 0 ou 1 - Par ou Impar
		System.out.println(c);
		
		
	}
}
