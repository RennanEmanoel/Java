package curso_java;

public class Função {
	
	static int soma(int a, int b, int c) {
		
		int s = a + b - c;
		
		return(s);
	}

	public static void main(String[] args) {
		
		System.out.println("Começou a prutaria");
		int sn = soma(13, 1, 1);
		
		
		System.out.println("A soma é "+sn);
		
	}

}
