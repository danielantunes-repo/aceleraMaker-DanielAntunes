package oo.composicao.heranca;

public class Jogo {
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
		
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
		
		System.out.println("Monstro tem => " + monstro.vida + " de HP.");
		System.out.println("Heroi tem => " + heroi.vida+ " de HP.");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		
		System.out.println("Monstro tem => " + monstro.vida + " de HP.");
		System.out.println("Heroi tem => " + heroi.vida+ " de HP.");
	}

	
}
