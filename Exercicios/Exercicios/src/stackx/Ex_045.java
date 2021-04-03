package stackx;

import java.util.Scanner;

public class Ex_045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, express;
		
		System.out.print("Digite A: ");
		a = ler.nextInt();
		
		System.out.print("Digite B: ");
		b = ler.nextInt();
		
		System.out.print("Digite C: ");
		c = ler.nextInt();
		
		express = (a - b) + (a - c) + (b - c);
		
		System.out.printf("o resultado da expressao eh %d", express);
	}

}
