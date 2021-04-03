package stackx;

import java.util.Scanner;

public class Ex_017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num, i;
		
		System.out.print("Digite o numero para acabar a contagem: ");
		num = ler.nextInt();
		
		i = 0;
			
		while(num >= i) {
			System.out.println("Contagem "+num);
			num--;
		}
	}

}
