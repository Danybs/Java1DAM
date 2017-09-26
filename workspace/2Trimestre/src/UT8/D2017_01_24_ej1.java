package UT8;

import java.util.Scanner;

public class D2017_01_24_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float vec[]=new float[5];
		float nota;
		float suma=0;
		
		Scanner teclado=new Scanner(System.in);
		for(int i=0; i<vec.length; i++){
		System.out.println("Dime una nota: ");
		nota=teclado.nextFloat();
		vec[i]=nota;
		
		}
		for(int i=0; i<vec.length; i++){
			suma=vec[i]+suma;
		}
		float total=suma/vec.length;
		System.out.println("La media es: "+total);
		
		
		
	}

}
