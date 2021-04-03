package stackx;

import java.util.Scanner;

public class Ex_016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num, i;
		
		System.out.print("Digite o numero para acabar a contagem: ");
		num = ler.nextInt();
		
		for(i = 0; i <= num; i++) {
			System.out.println("Contagem "+i);
		}
	}

}
