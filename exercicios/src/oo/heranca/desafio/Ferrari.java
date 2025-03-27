package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	public Ferrari() {
		this(300);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
	
}
