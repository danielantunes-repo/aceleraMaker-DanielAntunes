package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Daniel Antunes";
		u1.email = "daniel.antunes@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Daniel Antunes";
		u2.email = "daniel.antunes@email.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
	}
}
