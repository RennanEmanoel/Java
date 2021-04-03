package stackx;

import java.util.Scanner;

public class Ex_004 {

	public static void main(String[] args) {
		// Criar um programa que leia um número real imprima o seu dobro.
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		int soma = num1 + num2;
		int sub = num1 - num2;
		float mult = num1 * num2;
		float div = num1 / num2;
		
		System.out.printf("Soma %d\nSubtração %d\nDivisão %.2f\nMultiplicação %.2f", soma, sub, div, mult);
	}

}
