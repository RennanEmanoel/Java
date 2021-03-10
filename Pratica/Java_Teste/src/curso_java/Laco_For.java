package curso_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Laco_For {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int inicio, fim, pulo;
		int escolha;
	try {	
			System.out.print("Digite um numero inicial: ");
			inicio = teclado.nextInt();
			
			System.out.print("Digite o numero final: ");
			fim = teclado.nextInt();
			
			System.out.print("salto de: ");
			pulo = teclado.nextInt();
			
			System.out.println("Normal ou Regressiva?(1)(2)");
			escolha = teclado.nextInt();
			
			if(escolha == 1) {
				
				for(int i = inicio; i <= fim; i += pulo ) {
					
					System.out.println(i);
				}
				
			}
			else if(escolha == 2) {
				
				for(int i = inicio; i >= fim; i -= pulo ) {
					
					System.out.println(i);
				}
				
			}
			else {
				System.out.println("Voce digitou um numero invalido");
			}
			
			
	 }catch( InputMismatchException erro) {
		 System.out.println("Você digitou numeros invalidos");
	 }
	finally {
		System.out.println("\nVolte sempre! :)");
	}
		
	}

}
