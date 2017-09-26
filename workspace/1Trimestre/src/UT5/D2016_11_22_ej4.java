package UT5;

import java.util.Random;

public class D2016_11_22_ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Random rnd=new Random();
		a=rnd.nextInt(10);
		System.out.println("El numero aleatorio es : "+a);
		int suma=0;
		int n=1;
		do {
			if (n%2!=0){
				suma=suma+n;
			}
			n++;
			
			
		}while (n<=a);
		System.out.println("La suma de los números impares es : "+suma);
		
	}

}
