package stackx;

import java.util.Scanner;

public class Ex_021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int num[] = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite o "+i+" numero: ");
			num[i] = ler.nextInt();
		}
		int atual, passado;
		atual = 0;
		
		for(int j = 0; j < num.length; j++) {
			
			passado = num[j];
			
			 if(passado > atual) {
				 atual = passado;
			 }
		}
		System.out.println("O maior numero eh "+atual);
	    
	}

}
