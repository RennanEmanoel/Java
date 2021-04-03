package stackx;

import java.util.Scanner;

public class Ex_044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		
		System.out.print("Digite A: ");
		a = ler.nextInt();
		
		System.out.print("Digite B: ");
		b = ler.nextInt();
		
		System.out.print("Digite C: ");
		c = ler.nextInt();
		
		int expre = (a + b) * c;
		
		System.out.printf("O resultado da expressão %d + %d * %d eh %d", a, b, c, expre);
	}

}
