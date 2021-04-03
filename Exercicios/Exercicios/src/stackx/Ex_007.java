package stackx;

import java.util.Scanner;

public class Ex_007 {

	public static void main(String[] args) {
		// Criar um programa que leia um valor em Real e a cotação do dólar, e converta esse valor em dólares.

		Scanner ler = new Scanner(System.in);
		
		float real;
		float dolar = 5.74f;
		
		
		System.out.print("Digite quanto quer converter: ");
		real = ler.nextFloat();
		
		float cotacao = real / dolar;
		
		System.out.printf("O total em Dollar eh de: %.2f", cotacao);
	}

}
