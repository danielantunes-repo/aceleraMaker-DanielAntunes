package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 3.6;
		String resultadoParcial = media >= 5 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
	}
}
