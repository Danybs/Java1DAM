package UT5;

import java.util.Scanner;

public class D2016_11_30_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int a=1;
		int suma=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime un número");
		int n=teclado.nextInt();
		for (int i=1;i<=n;i=i+2){
			if (suma+i>=30) break;
			if (i==x) continue;
			suma=suma+i;
			System.out.println(i);
			}
		System.out.println("El resultado es: "+suma);

		

		
	
	}

}
