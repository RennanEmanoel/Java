package curso_java;

import java.util.Scanner;

public class Vetor_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int tabela[][] = new int [3][3];
		
		System.out.println("Digite os valores da tabela:");
		
		System.out.print("Digite o valor 1: ");
		tabela[0][0] = teclado.nextInt();
		
		System.out.print("\nDigite o valor 2: ");
		tabela[0][1] = teclado.nextInt();
		
		System.out.print("\nDigite o valor 3: ");
		tabela[0][2] = teclado.nextInt();
				
	    System.out.print("\nDigite o valor 4: ");
	    tabela[1][0] = teclado.nextInt();
	    
	    System.out.print("\nDigite o valor 5: ");
	    tabela[1][1] = teclado.nextInt();
	    
	    System.out.print("\nDigite o valor 6: ");
	    tabela[1][2] = teclado.nextInt();
	    
	    System.out.print("\nDigite o valor 7: ");
	    tabela[2][0] = teclado.nextInt();
	    
	    System.out.print("\nDigite o valor 8: ");
	    tabela[2][1] = teclado.nextInt();
	    
	    System.out.print("\nDigite o valor 9: ");
	    tabela[2][2] = teclado.nextInt();
	    
	    System.out.println("Os valores da tabela sao:\n" +tabela+" ");
	}

	}


