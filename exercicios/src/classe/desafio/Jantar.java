package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Legumes", 0.233);
		Comida c2 = new Comida("Carne", 0.533);
		
		Pessoa p = new Pessoa("Daniel", 99.8);
		
		System.out.println(p.apresentar());
		
		p.comer(c1);
		System.out.println(p.apresentar());
		
		p.comer(c2);
		System.out.println(p.apresentar());
	}
}
