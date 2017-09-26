package UT6;

import java.io.*;

public class D2017_01_11_ejLecturaEscritura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// ejEscritura
		FileOutputStream ficheroSalida = new FileOutputStream("precios.cat");
		DataOutputStream salida = new DataOutputStream(ficheroSalida);
		salida.writeDouble(234.56);
		salida.flush();
		salida.close();

		// ejLectura
		FileInputStream ficheroEntrada = new FileInputStream("precios.cat");
		DataInputStream entrada = new DataInputStream(ficheroEntrada);
		double precio = entrada.readDouble();
		System.out.println(precio);
		entrada.close();

	}

}
