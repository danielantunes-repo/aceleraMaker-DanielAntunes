package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		Long l = 10000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean boo = Boolean.parseBoolean("true");
		System.out.println(boo);
		System.out.println(boo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
	}
	
	
}
