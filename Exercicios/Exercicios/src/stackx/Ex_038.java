package stackx;

import java.util.Scanner;

public class Ex_038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite o numero: ");
		num = ler.nextInt();
		
		if(num > 50 && num < 100) {
			System.out.println("O numero esta entre 50 e 100");
		}
		else {
			System.out.println("\nO numero nao esta entre 50 e 100");
		}
	}

}
