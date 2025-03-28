package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		

		Aluno a1 = new Aluno("Daniel", 9.1);
		Aluno a2 = new Aluno("Luciana", 9.3);
		Aluno a3 = new Aluno("Gabriel", 6.1);
		Aluno a4 = new Aluno("Caio", 8.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado)); 
		System.out.println(alunos.stream().anyMatch(aprovado)); // pelo menos um
		System.out.println(alunos.stream().noneMatch(reprovado)); 
	}
}
