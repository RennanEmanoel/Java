package stackx;

import java.util.Scanner;

public class Ex_023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Digite a frase: ");
		frase = ler.nextLine();
		
		int num = frase.length();
		System.out.println("O numero de caracteres nessa frase eh "+num);
		
	}

}
