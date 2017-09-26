package UT8;

import java.util.Scanner;

public class D2017_01_25_ej3 {
	static double[][] a = new double[2][2];
	static double[][] b = new double[2][2];
	static double[][] c = new double[2][2];

	void calcular() {

		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				c[i][k] = a[i][k] + b[i][k];
			}
		}
	}

	void imprimir() {
		System.out.println("\nResultado suma en tabla C");
		for (int i = 0; i < c.length; i++) {
			for (int k = 0; k < c[i].length; k++) {
				System.out.println(c[i][k]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Tabla A");

		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {
				System.out.println("Dime una nota: ");
				a[i][k] = teclado.nextDouble();

			}
		}

		System.out.println("\nTabla B");

		for (int j = 0; j < b.length; j++) {

			for (int m = 0; m < b[j].length; m++) {
				System.out.println("Dime una nota: ");
				b[j][m] = teclado.nextDouble();
			}
		}
	
		D2017_01_25_ej3 object1 = new D2017_01_25_ej3();
		object1.calcular();
		object1.imprimir();
	}
}

