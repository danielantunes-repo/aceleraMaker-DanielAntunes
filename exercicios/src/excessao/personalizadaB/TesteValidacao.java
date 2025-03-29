package excessao.personalizadaB;

import excessao.Aluno;

public class TesteValidacao {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Daniel", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
	
		} catch (NumeroForaDoIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("FIM!");
	}
}
