package stackx;

import java.util.Scanner;

public class Ex_034 {

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
		
		if(a == b && b == c) {			
			System.out.println("Os numeros sao iguais");			
		}
		else {
			System.out.println("Os numeros sao diferentes");
		}
		
		
	}

}
