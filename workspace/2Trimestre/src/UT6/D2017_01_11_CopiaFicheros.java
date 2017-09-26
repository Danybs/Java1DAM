package UT6;

import java.io.*;

public class D2017_01_11_CopiaFicheros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File ficheroEntrada = new File("C:\\ficheros\\fichero1.txt");
		File ficheroSalida = new File("C:\\ficheros\\copia.txt");
		FileReader entrada = new FileReader(ficheroEntrada);
		FileWriter salida = new FileWriter(ficheroSalida);
		int dato;
		while ((dato = entrada.read()) != -1)
			salida.write(dato);
		entrada.close();
		salida.close();

	}

}
