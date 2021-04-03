package stackx;

import java.util.Scanner;

public class Ex_024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior eh "+num1);
		}
		else {
			System.out.println("O meior eh "+num2);
		}
	}

}
