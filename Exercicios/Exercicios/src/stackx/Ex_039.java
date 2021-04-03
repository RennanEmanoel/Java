package stackx;

import java.util.Scanner;

public class Ex_039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o 1° numero: ");
		a = ler.nextInt();
		
		System.out.print("Digite o 2° numero: ");
		b = ler.nextInt();
		
		System.out.print("Digite o 3° numero: ");
		c = ler.nextInt();
		
		if(a > b && a < c || a < b && a > c) {
			System.out.println("\nA eh o numero do meio");
		}
		else {
			System.out.println("\nA nao esta entre C e B");
		}

	}

}
