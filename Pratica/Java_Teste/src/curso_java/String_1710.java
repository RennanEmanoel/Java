package curso_java;

public class String_1710 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra = "Joinville";
		
		if(palavra.equals("Olá mundo")) {

			System.out.println("igual");
		}else {
			System.out.println("diferente");
		}
		
				System.out.println("Tamanho da palavra: "+palavra.length());
				System.out.println("Maiuscula: "+palavra.toUpperCase());
				System.out.println("Minuscula: "+palavra.toLowerCase());
				System.out.println("CharAt: "+palavra.charAt(1));
				System.out.println("IndexOf: "+palavra.indexOf('m'));
				
				
				System.out.println(palavra.substring(4,9));
				

	}

}
