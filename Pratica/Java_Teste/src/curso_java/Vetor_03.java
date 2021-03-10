package curso_java;

import java.util.Arrays;

public class Vetor_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double v[]= {3.14, 1.3, 4.5, 8.6};
		
		Arrays.sort(v);
	
		for(double valor: v) {  // For para cada (each)
			
			System.out.print(valor + "  ");
		}
	
	}

}
