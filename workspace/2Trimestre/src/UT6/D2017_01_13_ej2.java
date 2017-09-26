package UT6;

import java.io.*;
import java.util.Scanner;


public class D2017_01_13_ej2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner  teclado=new Scanner(System.in);
		try{
		FileOutputStream ficheroSalida = new FileOutputStream("precios2.cat");
		DataOutputStream salida = new DataOutputStream(ficheroSalida);
		for(int i=1; i<=3; i++){
		System.out.println("Dime una cadena UTF: ");
		String utf=teclado.nextLine();
		salida.writeUTF(utf);
		System.out.println("Dime un numero Double: ");
		double doble=teclado.nextDouble();
		salida.writeDouble(doble);
		String basura=teclado.nextLine();
		}
		salida.flush();
		salida.close();
		}
		catch (Exception e){
			System.err.println("error");
		}
		try{
			FileInputStream ficheroEntrada =new FileInputStream("precios2.cat");
			DataInputStream entrada = new DataInputStream(ficheroEntrada);
			for (int i=1;i<=3;i++){
			String utf= entrada.readUTF();
			System.out.println(utf);
			double doble= entrada.readDouble();
			System.out.println(doble);
			}
			entrada.close();
		}
		catch (Exception E){
			System.err.println("error");
		}
	}

}
