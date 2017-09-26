package UT8;

import java.util.ArrayList;
import java.util.Scanner;

public class D2017_03_29_Ej1 {
	static ArrayList<Integer> valores = new ArrayList();
	int suma = 0, total = 0, valsupcont = 0;

	void valorsuma() {
		if (valores.size() > 0) {
			for (Integer valor : valores) {
				suma = valor + suma;
			}
			System.out.println("La suma de los valores es: " + suma);
		}
	}

	void media() {
		if (valores.size() > 0) {
			total = suma / valores.size();
			System.out.println("La media es: " + total);
		}
	}

	void valsup() {
		if (valores.size() > 0) {
			for (Integer valor : valores) {
				if (valor > total) {
					valsupcont++;
				}
			}
			System.out.println("Hay " + valsupcont + " valores superiores");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		System.out.println("Dime un numero");
		n = teclado.nextInt();
		while (n != -99) {
			valores.add(new Integer(n));
			System.out.println("Dime un numero");
			n = teclado.nextInt();
		}
		if (valores.size() > 0) {
			D2017_03_29_Ej1 obj = new D2017_03_29_Ej1();
			System.out.println();
			obj.valorsuma();
			obj.media();
			obj.valsup();
		} else {
			System.out.println("No hay valores");
		}
	}

}
