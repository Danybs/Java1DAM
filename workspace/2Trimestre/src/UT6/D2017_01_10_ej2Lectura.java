package UT6;

import java.io.*;

public class D2017_01_10_ej2Lectura {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Uso doble barra para rutas absolutas
		try {
			BufferedReader reader = new BufferedReader(new FileReader("fichero1.txt"));
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

	
/* FileReader reader = new FileReader("fichero1.txt"); +++ simple 
 * int linea = reader.read(); -> cambiamos String por int (BYTES) y eliminamos
 * Line while (linea != -1) { -> cambiamos null por -1 ya que alfinal del
 * fichero devuelve -1
 * System.out.print((char)linea); -> hacemos un cast para
 * que imprima caracteres en vez de numeros binarios
 *  linea = reader.read();
 * eliminamos Line Se elimina read"Line" ya que es un int y no un String
 */