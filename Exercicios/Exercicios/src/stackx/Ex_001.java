package stackx;

import java.util.Scanner;

public class Ex_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Criar um programa que receba três nomes de pessoas e mostre-os na tela.*/
		Scanner ler = new Scanner(System.in);
		String nom1, nom2, nom3;
		
		int i = 0;
		
			System.out.println("Digite seu nome: ");
			nom1 = ler.nextLine();
						
			System.out.println("Digite seu nome: ");
			nom2 = ler.nextLine();
			
			
			System.out.println("Digite seu nome: ");
			nom3 = ler.nextLine();
		
		System.out.println(nom1+"\n");
		System.out.println(nom2+"\n");
		System.out.println(nom3+"\n");
		
		}

}