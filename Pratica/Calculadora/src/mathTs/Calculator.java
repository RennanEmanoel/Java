package mathTs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		//Decleração de variaveis
		
		int num1, num2;
		int soma, mult, sub;
		float div, rest;
				
		
		System.out.print("Calculadora!!\n\n");
		
		System.out.print("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		
		System.out.print("\nDigite o segundo numero: ");
		num2 = ler.nextInt();
		
		

		soma = num1 + num2;
		
		sub = num1 - num2;
		
		mult = (int) num1 * num2;
		
		div = num1 / num2;
		
		rest = num1 % num2;
		
		//Class Math
		double rq = Math.sqrt(num1);//raiz quadrada numero 1
		
		double rq2 = Math.sqrt(num2);//raiz quadrada numero 2
		
		double pot = Math.pow(num1, num2);// potencia de num1 por num2
		
		int mior = Math.max(num1, num2);//Valor maior entre num1 e num2
		
		
		System.out.printf("\n\na soma entre %d e %d é: %d", num1, num2, soma);
		
		System.out.printf("\n\nA subtração entre %d e %d é: %d", num1, num2, sub);
		
		System.out.printf("\n\nA multiplicação entre %d e %d é: %d", num1, num2, mult);
		
		System.out.printf("\n\nA divisão entre %d e %d é: %.1f", num1, num2, div); 
		
		System.out.printf("\n\nO resto da divisão entre %d e %d é: %.1f", num1, num2, rest);
		
		System.out.printf("\n\nA raiz quadrada de %d é: %.1f", num1, rq);
		
		System.out.printf("\n\nA raiz quadrada de %d é; %.1f", num2, rq2);
		
		System.out.printf("\n\nA potênciação entre %d e %d é: %.1f", num1, num2, pot);
		
		System.out.printf("\n\nO maior numero é: %d", mior);
		
		
		
		
		

	}

}
