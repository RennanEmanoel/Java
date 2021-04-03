package stackx;

import java.util.Scanner;

public class Ex_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Criar um programa que calcule a média de 2 notas e mostrar essa média na tela.*/
		Scanner ler = new Scanner(System.in);
		
		float not1, not2, media;
		
		System.out.println("Digite a primeira nota: ");
		not1 = ler.nextFloat();
		
		System.out.println("Digite a primeira nota: ");
		not2 = ler.nextFloat();	
		
		media = (not1 + not2) / 2;
		
		System.out.println("A nota do aluno eh "+ media);
	}

}
