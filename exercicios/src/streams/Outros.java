package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Daniel", 9.1);
		Aluno a2 = new Aluno("Luciana", 9.3);
		Aluno a3 = new Aluno("Gabriel", 6.1);
		Aluno a4 = new Aluno("Caio", 8.1);
		Aluno a5 = new Aluno("Daniel", 9.1);
		Aluno a6 = new Aluno("Luciana", 9.3);
		Aluno a7 = new Aluno("João", 8.1);
		Aluno a8 = new Aluno("Gabi", 8.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinc..");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.limit(2)
			.skip(1)
			.forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
		alunos.stream()
			.distinct()
			.skip(1)
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
			
	}
}
