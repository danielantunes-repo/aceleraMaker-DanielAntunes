package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		String num1 = entrada.nextLine();
		
		System.out.print("Digite o segundo número: ");
		String num2 = entrada.nextLine();
		
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		
		double soma = n1 + n2;
		double subtracao = n1 - n2;
		double multiplicacao = n1 * n2;
		double divisao = n1 / n2;
		double modulo = n1 % n2;
		
		System.out.println("Escolha a operação: "
				+ "Soma: ( + )"
				+ "\nSubtração: ( - )"
				+ "\nMultiplicação: ( * )"
				+ "\nDivisão: ( / )"
				+ "\nModulo: ( % )");
		String escolha = entrada.next();
		
		double resultado = escolha.equals("+") ? soma : 
				escolha.equals("-") ? subtracao : 
						escolha.equals("*") ? multiplicacao :
								escolha.equals("/") ? divisao :
										escolha.equals("%") ? modulo : 0;
		
		System.out.println(n1 + " " + escolha + " " + n2 + " = " + resultado);
		System.out.printf("%.2f %s %.2f = %.2f", n1, escolha, n2, resultado);
		
		
		
		
		entrada.close();
	}
	
}
