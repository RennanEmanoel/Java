package stackx;

import java.util.Scanner;

public class Ex_046 {

	public static void main(String[] args) {
		// TO	DO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, exp;
		
		System.out.print("Digite A: ");
		a = ler.nextInt();
		
		System.out.print("Digite B: ");
		b = ler.nextInt();
		
		System.out.print("Digite C: ");
		c = ler.nextInt();
		
		exp = (2 * a - b) * (a - 2 * c) * (2 * b - c);
		
		System.out.printf("O resultado da expressao eh %d", exp);
	}

}
