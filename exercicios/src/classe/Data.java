package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
//		return dia + "/" + mes + "/" + ano;
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
