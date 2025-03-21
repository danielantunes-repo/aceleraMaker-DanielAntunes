package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o dia da semana: " + "\nDomingo" + "\nSegunda" + "\nTerça" + "\nQuarta" + "\nQUinta"
				+ "\nSexta" + "\nSabado" );
		String dia = entrada.nextLine();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("O número refente a Domingo é 1.");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("O número refente a Segunda é 2.");
		} else if (dia.equalsIgnoreCase("terça") ||
				dia.equalsIgnoreCase("terca")) {
			System.out.println("O número refente a Terça é 3.");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("O número refente a Quarta é 4.");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("O número refente a Quinta é 5.");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("O número refente a Sexta é 6.");
		} else if (dia.equalsIgnoreCase("sábado") ||
				dia.equalsIgnoreCase("sabado")) {
			System.out.println("O número refente a Sabado é 6.");
		} else
			System.out.println("Dia inválido");

		entrada.close();
	}
}
