package oo.composicao.heranca.desafio;

public class Carro {
	int velocidadeAtual;

	void acelerar() {
		velocidadeAtual += 5;

		if (velocidadeAtual == 100) {
			velocidadeAtual = 100;
			System.out.println("Velocidade Maxima");
		}
		
	}

	void frear() {
		if (velocidadeAtual >= 0) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
		
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "km/h";
	}
}
