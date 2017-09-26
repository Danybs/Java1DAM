package UT6;

import java.io.*;

public class D2017_01_18_escritura {
	D2017_01_18_escritura() throws IOException {
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
}
