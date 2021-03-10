package curso_java;

import java.util.Arrays;

public class Vetor_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vet[] = new int[20];
		
		Arrays.fill(vet, 13);
		
		for(int val: vet) {
			System.out.print(val+ " ");
		}
	}

}
