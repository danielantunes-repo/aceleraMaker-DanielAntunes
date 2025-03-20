package fundamentos.desafios;

public class DesafioLogicos {
	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// trabalho na quinta (V ou F)
		// trabalhar um dia, compra tv de 32 e toma um sorvete
		// trabalhar dois dias, compra tv de 50 e toma um sorvete
		// não trabalha nenhum dia, fica em casa e não compra nada
		
		boolean terca1 = true;
		boolean quinta1 = true;
		
		boolean terca2 = true;
		boolean quinta2 = true;
		
		boolean terca3 = false;
		boolean quinta3 = false;
		
		boolean comprarSorvete1 = terca1 || quinta1;
		boolean comprarSorvete2 = terca2 || quinta2;
		boolean comprarSorvete3 = terca3 || quinta3;
		
		boolean comprartv50 = terca1 && quinta1; // TRUE && TRUE = TRUE
		System.out.println("Tabalhou na terça e na quinta, comprou a TV de 50 polegadas = " + comprartv50 + 
				", tomou torvete? " + comprarSorvete1);
		
		
		boolean comprartv32 = terca1 ^ !quinta1; // TRUE || !TRUE (Operador unário) = TRUE
		System.out.println("Trabalhou apenas na terça, comprou a TV de 32 polegadas = " + comprartv32 + 
				", tomou sorvete? " + comprarSorvete2);
		
		boolean ficouEmcasa = terca3 && quinta3; // FALSE && FALSE = FALSE
		System.out.println("Não trabalhou na terça e na quinta, ficou em casa = " + ficouEmcasa + 
				", tomou sorvete? " + comprarSorvete3);
		
	}
}
