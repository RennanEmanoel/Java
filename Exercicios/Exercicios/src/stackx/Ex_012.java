package stackx;

import java.util.Scanner;

public class Ex_012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		float salario;
		float reajuste;
		float atual;
		
		System.out.print("Digite seu salario atual: ");
		salario = ler.nextFloat();
		
		reajuste = salario / 15;
		atual = salario + reajuste;
		
		System.out.printf("O seu novo salario eh de %.2f", atual);
		
	}

}
