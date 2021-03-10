package curso_java;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		String nome[] = new String[10];
		
		//Entrada de dados
	for(int i = 0; i < nome.length; i++) {
		
		System.out.println("Digite seu nome: ");
		nome[i] = ler.nextLine();
	}

	//Saida de dados
	for(int i = 0; i < nome.length; i++) {
		
		System.out.println(nome[i]);
	}
		
	}

}
