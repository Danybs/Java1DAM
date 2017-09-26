package UT6;

import java.io.*;

//lectura de datos de tipo caracter de un fichero 'fichero.txt'
//Uso clases FileReader y BufferedReader
public class D2017_01_10_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Uso doble barra para rutas absolutas
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\ficheros\\fichero1.txt"));
			String linea = reader.readLine();
			while (linea != null) {// si no es fin fichero
				System.out.println(linea); // escribo lo que lei
				linea = reader.readLine(); // y eo linea siguiente
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error no se encuentra el fichero");
		} catch (IOException e) {
			System.err.println("Error al tratar el fichero");
		}
	}
}