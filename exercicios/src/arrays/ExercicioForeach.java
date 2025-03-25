package arrays;

import java.util.Arrays;

public class ExercicioForeach {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;

		for (double notasAluno : notasAlunoA) {
			System.out.print(notasAluno + " ");
		}

	}
}
