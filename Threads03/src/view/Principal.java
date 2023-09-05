package view;

import controller.ThreadVector;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = new int[1000];

		for (int i = 0; i < 1000; i ++) {
			vetor[i] = (int) ((Math.random() + 0.01) * 100);
		}
		
		Thread TR01 = new ThreadVector(1, vetor);
		Thread TR02 = new ThreadVector(1, vetor);
		
		TR01.start();
		TR02.start();
		
	}

}
