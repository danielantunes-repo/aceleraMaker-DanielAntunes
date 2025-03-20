package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu primeiro salário: ");
		String salarioUm = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o seu segundo salário: ");
		String salarioDois = entrada.nextLine().replace(",", "."); 
		
		System.out.print("Digite o seu terceiro salário: ");
		String salarioTres = entrada.nextLine().replace(",", "."); 
		
		double s1 = Double.parseDouble(salarioUm);
		double s2 = Double.parseDouble(salarioDois);
		double s3 = Double.parseDouble(salarioTres);
		
		double mediaSalarial = (s1 + s2 + s3)/3;
		System.out.printf("A média salárial é " + mediaSalarial );
		
		
		
		entrada.close();
	}
}
