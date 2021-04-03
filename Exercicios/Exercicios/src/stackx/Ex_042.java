package stackx;

import java.util.Scanner;

public class Ex_042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Qual numero eh o maior?");
		
		System.out.print("Digite A: ");
		a = ler.nextInt();
		
		System.out.print("Digite B: ");
		b = ler.nextInt();
		
		System.out.print("Digite C: ");
		c = ler.nextInt();
		
		if(a > b && a > c) {
			System.out.println("\n1° A");
		}
		else if(b > a && b > c) {
			System.out.println("\\n1° B");
		}
		else if(c > a && c > b) {
			System.out.println("\n1° C");
		}
		
		if(a < b && a > c || a > b && a < c) {
			System.out.println("\n2° A");
		}
		else if(b < a && b > c || b > a && b < c ) {
			System.out.println("\n2° B");
		}
		else if(c > a && c < b || c < a && c > b){
			System.out.println("\n2° C");
		}
		
		if(a < b && a < c) {
			System.out.println("\n3° A");
		}
		else if(b < a && b < c) {
			System.out.println("\n3° B");
		}
		else if (c < a && c < b) {
			System.out.println("\n3° C");
		}
	}

}
