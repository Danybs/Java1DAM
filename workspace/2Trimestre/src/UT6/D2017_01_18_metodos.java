package UT6;

import java.io.*;

public class D2017_01_18_metodos {
	void FicheroEscribir() throws IOException {
		//FileOutputStream rd = new FileOutputStream("fich.txt");
	//	DataOutput
		BufferedWriter bw = new BufferedWriter(new FileWriter("fich.txt"));
		String cadena1 = "hola";
		String cadena2 = "Este es ";
		String cadena3 = "un fichero de texto";
		String cadena4 = "\n";

		try {
			bw.write(cadena1);
			bw.newLine(); // bw.write(cadena4);
			bw.write(cadena2);
			bw.write(cadena3);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.err.println("error escritura");
			e.getMessage();
		}
	}

	void FicheroLeer() {
		
		
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader("fich.txt"));
				String line = br.readLine();
				while (line != null) {

					System.out.println(line);
					line = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		} 
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		D2017_01_18_metodos object1 = new D2017_01_18_metodos();
		System.out.println("Volcando a fichero de texto");
		object1.FicheroEscribir();
		System.out.println("Leyendo fichero de texto");
		object1.FicheroLeer();
	}

}
/*
 * String line; 
 * while ((line = br.readLine()) != null) {
 * System.out.println(line); 
 * }
 */