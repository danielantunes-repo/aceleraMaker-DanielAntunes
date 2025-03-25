package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.0;
		double[] notaAlunoB = { 6.9, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notaAlunoB.length);
		
		
	}
}
