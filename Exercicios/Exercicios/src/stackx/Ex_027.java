package stackx;

import java.util.Scanner;

public class Ex_027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("O numero eh divisivel por 2");
		}
		else {
			System.out.println("A soma nao eh divisivel por 2");
		}
	}

}
