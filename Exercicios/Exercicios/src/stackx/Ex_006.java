package stackx;

import java.util.Scanner;

public class Ex_006 {

	public static void main(String[] args) {
		// Criar um programa que leia 2 n�meros reais, efetuar as 4 opera��es matem�ticas e mostrar os resultados.

		Scanner ler = new Scanner(System.in);
		
		float num1, num2;
		float soma, sub, mult, div;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextFloat();
		
		soma = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("A soma dos numeros eh "+soma);
		System.out.println("A subtra��o dos numeros eh "+sub);
		System.out.println("A multiplica��o dos numeros eh "+mult);
		System.out.println("A divisao dos numeros eh "+div);
	}

}
