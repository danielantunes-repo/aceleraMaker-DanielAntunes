package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome,String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		alterarIdade(idade);
	}
	
	// Getter
	public int lerIdade() {
		return idade;
	}
	
	// Setter
	public void alterarIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade < 120) {
			this.idade = novaIdade;
			}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	@Override
	public String toString() {
		return "Olá eu sou o " + getNomeCompleto() + " e tenho " + lerIdade() + " anos.";
	}
	
	
	
}
