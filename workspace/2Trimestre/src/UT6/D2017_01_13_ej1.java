package UT6;

import java.io.*;


public class D2017_01_13_ej1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Escritura
		try{
		FileOutputStream ficheroSalida = new FileOutputStream("precios.cat");
		DataOutputStream salida = new DataOutputStream(ficheroSalida);
		String c="pepe",b="maria";
		salida.writeUTF(c);
		salida.writeDouble(234.56);
		salida.writeUTF(b);
		salida.writeDouble(123.23);
		salida.flush();
		salida.close();
		}
		catch (FileNotFoundException e){
			System.err.println("Error");
		}
		
		//Lectura
		try{
		FileInputStream ficheroEntrada = new FileInputStream("precios.cat");
		DataInputStream entrada = new DataInputStream(ficheroEntrada);
		String utf1 = entrada.readUTF();
		System.out.println(utf1);
		double valor1 = entrada.readDouble();
		System.out.println(valor1);
		utf1 = entrada.readUTF();
		System.out.println(utf1);
		valor1 = entrada.readDouble();
		System.out.println(valor1);
		entrada.close();
		
		}
		catch (Exception E){
			System.err.println("error");
		}
		
		
	}

}
