package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		/*
		 	final double FATOR = 5.0 / 9.0;
		 	final double AJUSTE = 32;
		 	
		 	double fahrenheit = 70;
		 	double celcius = (fahrenheit - AJUSTE) * FATOR;
		 	
		 	System.out.println(celcius);
		 	
		 */
		
		
		double fahrenheit = 86;
		double celcius = (fahrenheit - 32) * 5 / 9;

		System.out.println(celcius + "°C");
		

	}
}
