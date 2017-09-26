package UT5;

import java.util.Scanner;

public class D2016_11_22_ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,e;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime la base: ");
		b=teclado.nextInt();
		System.out.println("Dime el exponente: ");
		e=teclado.nextInt();
		int t=1;
		int y=0;
		do {
			if (t*b>=200) break;
			t=t*b;
			y++;
		}while(y!=e);
		System.out.println(t);
		
	
	}
}


