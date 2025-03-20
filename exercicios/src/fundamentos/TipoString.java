package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá, pessoal".charAt(2));

		String s = "Bom dia";
//		s = s.toUpperCase();

		System.out.println(s.concat("!!"));
		System.out.println(s + "!!");
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.length());
		System.out.println(s.endsWith("dia"));
		System.out.println(s.equals("Bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;

		System.out.println(
				"Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");

		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f ", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f ", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6,8));
	}
}
