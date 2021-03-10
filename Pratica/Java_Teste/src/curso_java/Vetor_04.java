package curso_java;

import java.util.Arrays;

public class Vetor_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int vet[] = {5, 6, 1, 8, 9, 3, 10, 12, 13};
		
		int p = Arrays.binarySearch(vet, 9);
		
		System.out.println("Encontrei nesta posição "+ p);
	}

}
