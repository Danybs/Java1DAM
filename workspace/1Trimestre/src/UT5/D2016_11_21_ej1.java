package UT5;

import java.util.Scanner;

public class D2016_11_21_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,e;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime un número");
		b=teclado.nextInt();
		System.out.println("Dime un segundo número");
		e=teclado.nextInt();
		int multiplicacion=1;
		for (int i=1;i<=e;i++){
			multiplicacion=multiplicacion*b;
			}
		System.out.println(multiplicacion);
	}

}
