package stackx;

import java.util.Scanner;

public class Ex_047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int x, y, z, exp;
		
		System.out.print("Digite A: ");
		x = ler.nextInt();
		
		System.out.print("Digite B: ");
		y = ler.nextInt();
		
		System.out.print("Digite C: ");
		z = ler.nextInt();
		
		exp = ((x - 5) * y) - z;
		
		System.out.printf("O resultado da expresao eh %d", exp);
	}

}
