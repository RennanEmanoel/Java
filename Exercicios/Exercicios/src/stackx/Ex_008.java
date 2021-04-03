package stackx;

import java.util.Scanner;

public class Ex_008 {

	public static void main(String[] args) {
		// Criar um programa que receba o ano de nascimento de uma pessoa e imprima a sua idade atual.
		Scanner ler = new Scanner(System.in);
		
		int ano_nasc;
		int idade;
		
		System.out.print("Digite seu ano de nascimento: ");
		ano_nasc = ler.nextInt();
		
		idade =  2021 - ano_nasc;
		
		System.out.printf("A sua idade eh de %d", idade);
		
		
	}

}
