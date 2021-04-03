package stackx;

import java.util.Scanner;

public class Ex_036 {

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
		
		soma = a + c;
		
		if(soma > b) {
			System.out.println("\nA soma de A e C eh maior que B");
		}
		else if(soma == b) {
			System.out.println("\nA soma de A  e C eh igual a B");
		}
		else {
			System.out.println("\nA soma de A e C eh menor que B");
		}
	}

}
