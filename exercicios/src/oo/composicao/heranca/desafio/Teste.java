package oo.composicao.heranca.desafio;

public class Teste {
	
	public static void main(String[] args) {
		Gol c = new Gol();
		Ferrari f = new Ferrari();
		
		
		c.acelerar();
		c.frear();
		c.frear();
		f.acelerar();
		
		System.out.println(c);
		System.out.println(f);
		
		
	}
}
