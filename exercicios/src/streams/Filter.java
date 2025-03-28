package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Natalia", 7.8);
		Aluno a2 = new Aluno("Caio", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gabriel", 4.8);
		Aluno a5 = new Aluno("Luciana", 6.8);
		Aluno a6 = new Aluno("Ana", 5.8);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Function<Aluno, String> saudacao = 
				a -> "Parabens " + a.nome + "! Você foi aprovado!";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacao)
			.forEach(System.out::println);
	}

	
}
