package UT6;

import java.io.*;

public class D2017_01_17_ej2 {
	void escritura() throws IOException {
		BufferedWriter writer=new BufferedWriter(new FileWriter("fi2.txt"));
		String cadena = "Esto es una prueba usando Buffered";
		String cadena2 = "Seguimos usando Buffered";
		writer.write(cadena);
		writer.newLine();
		writer.write(cadena2);
		writer.flush();
		writer.close();
	}

	void leer() throws IOException {
		BufferedReader reader=new BufferedReader(new FileReader("fi2.txt"));
		int caracter = reader.read();
		while (caracter != -1) {
			System.out.print((char)caracter);
			caracter = reader.read();

		}
		reader.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_01_17_ej2 object1 = new D2017_01_17_ej2();
		
	try{
		object1.escritura();
	}
	catch(IOException e){
		System.err.println("error escritura");
		e.getMessage();
	}
	try{
		object1.leer();
	}
	catch(IOException e){	
		System.err.println("error lectura");
		e.getMessage();
	}
	
		
	}

}
