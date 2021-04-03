package stackx;

import java.util.Scanner;

public class Ex_026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		if(num1 == num2) {
			System.out.println("Os 2 numeros sao iguais");
		}
		else {
			System.out.println("Os 2 numeros sao diferentes");
		}
	}

}
