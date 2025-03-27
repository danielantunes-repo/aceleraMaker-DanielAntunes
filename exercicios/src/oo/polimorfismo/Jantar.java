package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(80.00);
		
		Arroz ing1 = new Arroz(0.25);
		Feijao ing2 = new Feijao(0.180);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ing1);
		convidado.comer(ing2);
		
		System.out.println(convidado.getPeso());
	}
}
