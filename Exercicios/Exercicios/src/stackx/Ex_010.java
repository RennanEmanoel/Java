package stackx;

import java.util.Scanner;

public class Ex_010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int val1, val2;
		
		System.out.print("Digite um numero: ");
		val1 = ler.nextInt();
		
		System.out.print("Digite outro numero: ");
		val2 = ler.nextInt();
		
		int pont = val1;
		int pont2 = val2;
		
		if(true) {
			val1 = pont2;
			val2 = pont;
		}
		
		System.out.printf("Os valores alterado sao de valor 1 = %d e valor 2 = %d", val1, val2);
	}

}
