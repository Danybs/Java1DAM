package UT8;

import java.util.Scanner;

public class D2017_01_25_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean igual = true;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Tabla A");
		double[][] a = new double[2][2];
		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {
				System.out.println("Dime una nota: ");
				a[i][k] = teclado.nextDouble();

			}
		}

		System.out.println("Tabla B");
		double[][] b = new double[2][2];
		for (int j = 0; j < b.length; j++) {

			for (int m = 0; m < b[j].length; m++) {
				System.out.println("Dime una nota: ");
				b[j][m] = teclado.nextDouble();

			}
		}

		System.out.println("\nEl resultado es: ");
		for (int h = 0; h < a.length; h++) {
			for (int n = 0; n < a[h].length; n++) {
				System.out.println(a[h][n] + " y " + b[h][n]);
				if (a[h][n] != b[h][n]) {
					igual = false;
				}
			}
		}

		if (igual == false) {
			System.out.println("Son distintos");
		} else {
			System.out.println("La matriz es igual");
		}
	}

}
