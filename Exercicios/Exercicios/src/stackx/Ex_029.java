package stackx;

import java.util.Scanner;

public class Ex_029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
		
		int a, b, n, sum;
		
		System.out.print("Digite o primeiro numero: ");
		a = ler.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		b = ler.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		n = ler.nextInt();
		
		sum = a + b;
		
		if(sum % n == 0) {
			System.out.printf("\nO numero eh divisivel por %d",n);
		}
		else {
			System.out.printf("\nA soma nao eh divisivel por %d",n);
		}
	}

}
