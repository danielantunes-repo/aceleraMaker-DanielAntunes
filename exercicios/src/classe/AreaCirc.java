package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.1415;

	AreaCirc(double raioIncial) {
		raio = raioIncial;
	}

	double area() {
//		return raio * raio * pi;
		return PI * Math.pow(raio, 2);
	}

	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}
