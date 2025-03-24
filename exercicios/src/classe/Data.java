package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaFornecido, int mesFornecio, int anoFornecido) {
		dia = diaFornecido;
		mes = mesFornecio;
		ano = anoFornecido;
	}
	
	
	String obterDataFormatada() {
//		return dia + "/" + mes + "/" + ano;
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
