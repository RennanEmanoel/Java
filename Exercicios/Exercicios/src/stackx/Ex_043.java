package stackx;

import java.util.Scanner;

public class Ex_043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		int min, max;
		
		System.out.println("Qual o menor valor?");
		
		System.out.print("Digite A: ");
		a = ler.nextInt();
		
		System.out.print("Digite B: ");
		b = ler.nextInt();
		
		System.out.print("Digite C: ");
		c = ler.nextInt();
		
		if(a > b && a > c) {
			System.out.println("3° A");
		}
		else if(b > a && b > c) {
			System.out.println("3° B");
		}
		else if(c > a && c > b) {
			System.out.println("3° C");
		}
		
		if(a < b && a > c || a > b && a < c) {
			System.out.println("2° A");
		}
		else if(b > a && b < c || b < a && b > c) {
			System.out.println("2° B");
		}
		else if(c > b && c < a || c < b && c > a) {
			System.out.println("2° C");
		}
		
		if(a < b && a < b) {
			System.out.println("1° A");
		}
		else if(b < a && b < c) {
			System.out.println("1° B");
		}
		else if(c < a && c < b) {
			System.out.println("1° C");
		}
	}

}
