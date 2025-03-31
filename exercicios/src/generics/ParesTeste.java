package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Daniel");
		resultadoConcurso.adicionar(2, "Gabriel");
		resultadoConcurso.adicionar(3, "Gui");
		resultadoConcurso.adicionar(4, "Caio");
		resultadoConcurso.adicionar(2, "Luciana");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
	}
}
