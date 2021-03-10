package curso_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dia_Semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		try {	
				System.out.println("Digite o dia da semana(1-7)");
				int dia = ler.nextInt();
				
				switch(dia) {
				
				case 1:
					System.out.println("Segunda-Feira");
					break;
				case 2:
					System.out.println("Terça-Feira");
					break;
				case 3:
					System.out.println("Quarta-Feira");
					break;
				case 4:
					System.out.println("Quinta-Feira");
					break;
				case 5:
					System.out.println("Sexta-Feira");
					break;
				case 6:
					System.out.println("Sábado");
					break;
				case 7:
					System.out.println("Domingo");
					break;
				default:
					System.out.println("Digite corretamente!!");
				}
		}catch(InputMismatchException erro) {
			System.out.println("Você digitou letras");
		}
	}

}
