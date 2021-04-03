package stackx;

import java.util.Scanner;

public class Ex_032 {

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
		
		if(a < b && a > c || a > b && a < c) {
			System.out.println("\nO numero do meio eh "+a);
		}
		else if(b < a && b > c || b > a && b < c) {
			System.out.println("\nO numero do meio eh "+b);
		}
		else if(c < b && c > a || c > b && c < a) {
			System.out.println("\nO numero do meio eh "+c);
		}
	}

}
