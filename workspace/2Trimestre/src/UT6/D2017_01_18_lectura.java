package UT6;

import java.io.*;

public class D2017_01_18_lectura {
	D2017_01_18_lectura() {
		if (!new File("fich.txt").exists()){
			System.out.println("No se ha encontrado fichero");
		}
		System.out.println("Leyendo fichero de texto");
		try {
			BufferedReader br = new BufferedReader(new FileReader("fich.txt"));

			String line = br.readLine();
			while (line != null) {

				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.err.println("No se a encontrado fichero");
			e.getMessage();
		}
	}

}
