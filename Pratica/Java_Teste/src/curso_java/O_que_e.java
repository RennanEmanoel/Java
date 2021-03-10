package curso_java;

import java.util.Scanner;

public class O_que_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int pernas;
		
		System.out.println("Contador de pernas!!");
		
		System.out.print("Digite a quantidade de pernas: ");
		pernas = ler.nextInt();
		
		switch(pernas) {
		
		case 1:
			System.out.print("Ih mn isso ai é um Saci");
			break;
		case 2:  
			System.out.print("Isso é um Bipede mn");
			break;
		case 3:
			System.out.print("Isso ai é um quando acordo");
		case 4:
			System.out.print("Quadrupede mn parece tua mãe");
			break;
		case 6:
			System.out.print("Porque tinha que ser Aranha");
			break;
		case 8:
			System.out.print("Porque tinha que ser Aranha");
			break;
		default:
			System.out.print("Mn corre isso ai é um ET");
		}
	}

}
