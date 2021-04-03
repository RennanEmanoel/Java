package stackx;

import java.util.Scanner;

public class Ex_018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num, prox;
		
		System.out.print("Digite um numero: ");
		num = ler.nextInt();
		
		if(num >= 10) {
			prox = num + 100;
		}
		else{
			prox = num + 10;
		}
		
		System.out.println("O proximo numero que contem esse numero eh "+prox);
	}

}
