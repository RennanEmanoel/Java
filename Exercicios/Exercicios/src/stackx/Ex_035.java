package stackx;

import java.util.Scanner;

public class Ex_035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, soma;
		System.out.println("--------------- A soma dos numeros eh --------------\n");
		
		System.out.print("Digite o 1° numero: ");
		a = ler.nextInt();
		
		System.out.print("Digite o 2° numero: ");
		b = ler.nextInt();
		
		System.out.print("Digite o 3° numero: ");
		c = ler.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println("\nA soma de A e B eh maior que C");
		}
		else if(soma == c) {
			System.out.println("\nA soma de A  e B eh igual a C");
		}
		else {
			System.out.println("\nA soma de A e B eh menor que C");
		}
	}

}
