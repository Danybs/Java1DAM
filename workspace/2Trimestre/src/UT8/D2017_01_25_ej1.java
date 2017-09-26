package UT8;

import java.util.Scanner;

public class D2017_01_25_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double[][] notas = new double[3][2];

		for (int i = 0; i < notas.length; i++) {

			for (int a = 0; a < notas[i].length; a++) {
				System.out.println("Dime una nota: ");
				notas[i][a] = teclado.nextDouble();

			}

		}
		for (int g = 0; g < 3; g++) {

			for (int c = 0; c < 2; c++) {
				if (notas[g][c] % 3 == 0) {
					System.out.println(notas[g][c]);
				}
			}

		}
	}

}
