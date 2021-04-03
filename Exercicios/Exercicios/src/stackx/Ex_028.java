package stackx;

import java.util.Scanner;

public class Ex_028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, sum;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		sum = num1 + num2;
		
		if(sum % 3 == 0) {
			System.out.println("O numero eh divisivel por 3");
		}
		else {
			System.out.println("A soma nao eh divisivel por 3");
		}
	}

}
