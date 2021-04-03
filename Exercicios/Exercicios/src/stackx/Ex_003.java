package stackx;

import java.util.Scanner;

public class Ex_003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Criar um programa que leia o nome de uma pessoa, a sua idade e o seu salário, e mostrar essas informações.*/
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		float salario;
		
		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Digite seu salario: ");
		salario = ler.nextFloat();
		
		System.out.printf("Seu nome eh %s \nSua idade eh de %d \nSeu salario eh de %.2f", nome, idade, salario);
	}

}
