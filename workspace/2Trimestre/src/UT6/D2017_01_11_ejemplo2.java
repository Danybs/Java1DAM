package UT6;

import java.io.*;

public class D2017_01_11_ejemplo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entradaEstandar = new BufferedReader(new InputStreamReader(System.in));
		String mensaje;
		System.out.println("Introducir una línea de texto: ");
		mensaje = entradaEstandar.readLine();
		System.out.println("Introducido: \"" + mensaje + "\"");
	}

}
