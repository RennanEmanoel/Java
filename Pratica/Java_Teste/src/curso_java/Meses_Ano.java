package curso_java;

public class Meses_Ano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mes[]= {"jan","Fev", "Mar", "Abr", "Mai", "Jun", "jul",
				       "Ago", "Set", "Out", "Nov", "Dez"};
		int tot[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int c =0; c < mes.length; c++) {
			System.out.println("O mes de "+mes[c]+" tem "+ tot[c]+" dias ao todo\n");
		}
		
	}

}
