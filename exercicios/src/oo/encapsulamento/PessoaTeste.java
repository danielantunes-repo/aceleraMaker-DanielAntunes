package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Daniel","Antunes", 38);
		p1.alterarIdade(20);
		
		System.out.println(p1);
	}
}
