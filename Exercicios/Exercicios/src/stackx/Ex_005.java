package stackx;

import java.util.Scanner;

public class Ex_005 {

	public static void main(String[] args) {
		// Criar um programa que leia 2 números inteiros, efetuar as 4 operações matemáticas e mostrar os resultados.
		Scanner ler = new Scanner(System.in);
		
		float num;
		
		System.out.println("Digite um numero: ");
		num = ler.nextFloat();
		
		float mult = num * 2;
		
		System.out.printf("O dobro de %.2f eh %.2f", num, mult);
	}

}
