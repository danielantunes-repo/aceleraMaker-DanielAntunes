package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
//		Set<String> lista = new HashSet<String>(); 
		SortedSet<String> lista = new TreeSet<String>(); 
		lista.add("Daniel");
		lista.add("Gabriel");
		lista.add("Caio");
		lista.add("Luciana");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
