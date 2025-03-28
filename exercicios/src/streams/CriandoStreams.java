package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> lang = Stream.of("Java ", "Js ", "Python\n");
		lang.forEachOrdered(print);
		
		String[] maisLangs = {"C ", "Go ", "Lisp ", "Perl\n"};
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 2).forEach(print); // do indice 1 até o indice 2, mas não inclue o 2
		
		List<String> outrasLangs = Arrays.asList("PHP ", "Kotlin " , "Lua\n ");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// Stream.generate(() -> "a").forEach(print);
		// Stream.iterate(0, n -> n + 1).forEach(println);
		
	}
}
