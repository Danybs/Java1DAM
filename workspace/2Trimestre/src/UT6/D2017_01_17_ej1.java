package UT6;

import java.io.*;

public class D2017_01_17_ej1 {

	void escritura() throws IOException {
		FileWriter writer = new FileWriter("fi1.txt");
		String cadena = "cadena de prueba";
		writer.write(cadena);
		writer.flush();
		writer.close();
	}

	void leer() throws IOException {
		FileReader reader = new FileReader("fi1.txt");
		int caracter = reader.read();
		while (caracter != -1) {
			System.out.print((char) caracter);
			caracter = reader.read();

		}
		reader.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_01_17_ej1 objeto1 = new D2017_01_17_ej1();
		try {
			objeto1.escritura();

		} catch (Exception E) {
			System.err.println("Error escritura");
		}
		try {
			objeto1.leer();

		} catch (Exception E) {
			System.err.println("Error lectura");
		}
	}

}
