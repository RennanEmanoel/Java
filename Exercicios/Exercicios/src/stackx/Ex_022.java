package stackx;

import java.util.Scanner;

public class Ex_022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num, at, succ;
		
		System.out.println("Digite um numero: ");
		num = ler.nextInt();
		
		at = num - 1;
		succ = num + 1;
		
		System.out.println("O antecesor eh "+at);
		System.out.println("O sucessor eh "+succ);
	}

}
