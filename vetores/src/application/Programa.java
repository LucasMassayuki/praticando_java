package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double [3];// para criar um vetor e no tamanho de [n]
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for (int i=0; i<n; i++) {//vai acumular somando todos os tetores
			soma += vect[i];
		}
		double avg = soma / n;//calculanda a média
		
		System.out.printf("AVEREGE HEIGHT: %.2f%n", avg);
		sc.close();
	}

}
