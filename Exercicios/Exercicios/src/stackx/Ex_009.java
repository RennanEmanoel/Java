package stackx;

import java.util.Scanner;

public class Ex_009 {

	public static void main(String[] args) {
		// Criar um programa que receba idade de uma pessoa e imprima o seu ano de nascimento.
		Scanner ler = new Scanner(System.in);
		
		int ano_nasc;
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		ano_nasc = 2021 - idade;
		
		System.out.printf("A seu ano de nascimento eh %d", ano_nasc);
		
		
	}

}
