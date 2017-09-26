package UT2;
import java.util.Scanner;

public class D2016_10_14_ej1part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Dime la letra del NIF: ");
		Scanner teclado=new Scanner(System.in);
		String cadena=teclado.nextLine(); //lee cadenas
			System.out.println("La letra del NIF es: " +cadena);
			System.out.println("Dime el NIF: ");
		int numero=teclado.nextInt(); //lee numeros
			System.out.println("El numero del NIF es: " +numero);
	}

}
