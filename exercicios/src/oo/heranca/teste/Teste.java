package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Gol;

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
