package classe;

public class DataTeste {
	public static void main(String[] args) {

		Data d = new Data();
		d.dia = 11;
		d.mes = 03;
		d.ano = 1987;

//		System.out.printf("%d / %d / %d.", d.dia, d.mes, d.ano);
		System.out.println(d.obterDataFormatada());
	}
}
