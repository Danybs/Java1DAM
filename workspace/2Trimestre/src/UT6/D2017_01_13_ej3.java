package UT6;

import java.io.*;
import java.util.Scanner;

public class D2017_01_13_ej3 {
	public static void main(String[] args) {

		try {
			// Ejemplo escritura
			Scanner teclado = new Scanner(System.in);
			String cadena = "";
			double numero;
			FileOutputStream ficheroSalida = new FileOutputStream("precios.cat");
			DataOutputStream salida = new DataOutputStream(ficheroSalida);
			System.out.println("Dime cadena");
			cadena = teclado.nextLine();
			while (!cadena.equalsIgnoreCase("fin")) {
				salida.writeUTF(cadena);

				System.out.println("Dime numero doble");
				numero = teclado.nextDouble();
				salida.writeDouble(numero);
				String basura = teclado.nextLine();
				System.out.println("Dime cadena");
				cadena = teclado.nextLine();

			}
			salida.flush();
			salida.close();

			FileInputStream ficheroEntrada = new FileInputStream("precios.cat");
			DataInputStream entrada = new DataInputStream(ficheroEntrada);
			if (entrada.available() > 0)
				cadena = entrada.readUTF();
			while (entrada.available() > 0) {
				System.out.println(cadena);
				double precio = entrada.readDouble();
				System.out.println(precio);
				if (entrada.available() > 0)
					cadena = entrada.readUTF();
			}
			entrada.close();

		} catch (Exception e) {
			System.out.println("error");
		}

	}

}
