package UT5;

import java.util.Scanner;

public class D2016_11_28_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b=1;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime un número ");
		a=teclado.nextInt();
		System.out.print("El factorial de "+a+" es: ");
		while (a!=0){
		b=b*a;	
		a=a-1;
				}
		System.out.print(b);
	}
}


