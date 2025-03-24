package classe;

public class DataTeste {
	public static void main(String[] args) {

		Data d = new Data(11, 03, 1987);
//		d.dia = 11;
//		d.mes = 03;
//		d.ano = 1987;
		
		Data d2 = new Data();
		

//		System.out.printf("%d / %d / %d.", d.dia, d.mes, d.ano);
		System.out.println(d.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}
