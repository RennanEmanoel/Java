package stackx;

import java.util.Scanner;

public class Ex_037 {

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
		
		soma = b + c;
		
		if(soma > a) {
			System.out.println("\nA soma de B e C eh maior que A");
		}
		else if(soma == a) {
			System.out.println("\nA soma de B  e C eh igual a A");
		}
		else {
			System.out.println("\nA soma de B e B eh menor que A");
		}
	}

}
