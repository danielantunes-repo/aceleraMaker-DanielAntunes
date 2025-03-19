package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações de funcionario

		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 3276;
		int id = 56789;
		long pontoAncumulados = 3_234_845_223L;

		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAculadas = 2_991_103.01;

		// Tipo booleano
		boolean estaDeFerias = false; // true

		// Tipo caractere
		char status = 'A'; // ativo

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// Número de viagens
		System.out.println(numeroDeVoos / 2);

		// Pontos por real
		System.out.println(pontoAncumulados / vendasAculadas);

		System.out.println(id + ": ganha -> " + salario);

		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);

	}
}
