package controller;

import javax.swing.JOptionPane;

public class ThreadVector extends Thread{
	
	private int valor;
	private int[] vet;
	
	
	public ThreadVector(int valor, int[] vet) {
		this.valor = valor;
		this.vet = vet;
	}

	public void run() {
		if (valor %2 == 0) {
			executaPar();
		}
			executaImpar();
	}

	private void executaPar() {
		
		long tempInicial = System.nanoTime();
		long soma = 0;
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		
		
		long tempFinal = System.nanoTime();
		double tempTotal = (tempFinal - tempInicial) / Math.pow(10, 9);
	
		JOptionPane.showMessageDialog(null, "Tempo para percorrer o vetor é de: " + tempTotal + "s");
		
	}

	private void executaImpar() {
		long tempInicial = System.nanoTime();
		long soma = 0;
	
		for (int j : vet) {
			soma += j;
		}
		
		long tempFinal = System.nanoTime();
		double tempTotal = (tempFinal - tempInicial) / Math.pow(10, 9);
		
	
		JOptionPane.showMessageDialog(null, "Tempo para percorrer o vetor é de: " + tempTotal + "s");
		
	}
}
