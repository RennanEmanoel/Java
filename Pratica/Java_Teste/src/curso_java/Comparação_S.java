package curso_java;

public class Comparação_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String nome1 = "Rennan";
				String nome2 = "Rennan";
				String nome3 = new String("Rennan");
				String res;
				res = (nome1.equals(nome3) && nome1 == nome2)?"igual":"Diferente";
				
				System.out.println(res);
	}

}
