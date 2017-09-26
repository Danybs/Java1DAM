package UT2;
import java.util.Scanner;

public class D2016_10_14_ej0lectteclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num1;
		String Letra;
	
	//Letra
		System.out.println("Dime una letra");
		Letra=teclado.nextLine();
		System.out.println("La letra es: " +Letra);
	//Numero
		System.out.println("Dime un numero");
		num1=teclado.nextInt();
		System.out.println("El numero es: " +num1);
		
		
	}

}
