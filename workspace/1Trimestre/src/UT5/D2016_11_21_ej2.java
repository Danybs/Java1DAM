package UT5;

import java.util.Scanner;

public class D2016_11_21_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime un número");
		n=teclado.nextInt();
		int suma=0;
		for (int i=0;i<=n;i=i+2){
			suma=suma+i;
			}
		System.out.print(suma+" ");
		System.out.println(" ");
		int numero=1;
		do {
		 System.out.println(numero);
		 numero++;
		} while (numero<=5);
	}

}
