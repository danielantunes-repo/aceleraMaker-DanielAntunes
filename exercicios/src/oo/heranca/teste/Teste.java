package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Gol;

public class Teste {
	
	public static void main(String[] args) {
		Gol c = new Gol();
		Ferrari f = new Ferrari(400);
		
		
//		c.acelerar();
//		c.frear();
//		c.frear();
//		f.acelerar();
		f.ligarTurbo();
		f.ligarAr();
		f.acelerar();
		f.frear();
		
		
		System.out.println(f.velocidadeDoAr());
		System.out.println(f);
		
		
	}
}
