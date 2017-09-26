package UT8;

import java.util.Scanner;

public class D2017_01_24_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int b[] = new int[5];

		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Dime un número: ");
			a[i] = teclado.nextInt();

		}
		for (int i = 0; i < b.length; i++) {

			if (a[i] % 2 == 0) {
				b[i] = a[i];

			}
			if (b[i] != 0) {
				System.out.println(b[i]);
			}
		}

	}

}
