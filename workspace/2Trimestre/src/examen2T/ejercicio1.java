package examen2T;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[][] datos = { { 50, 1600 }, { 33, 1400 }, { 62, 2200 }, { 60, 2800 }, { 21, 900 } };
		Scanner teclado = new Scanner(System.in);

		System.out.println("1-Grabar");
		System.out.println("2-Leer");
		System.out.println("3-Salir");
		System.out.print("Opcion:");
		int opc = teclado.nextInt();
		FileOutputStream ficheroSalida = new FileOutputStream("valores.cat");
		DataOutputStream salida = new DataOutputStream(ficheroSalida);
		FileInputStream ficheroEntrada = new FileInputStream("valores.cat");
		DataInputStream entrada = new DataInputStream(ficheroEntrada);
		double valor = 0;
		while (opc != 3) {
			switch (opc) {
			case 1:
				System.out.println("Dime posicion");
				int pos = teclado.nextInt();
				System.out.println("Dime nueva edad");
				int nedad = teclado.nextInt();
				datos[pos][0] = nedad;
				System.out.println("Dime nuevo sueldo");
				int nsueldo = teclado.nextInt();
				datos[pos][1] = nsueldo;

				for (int i = 0; i < datos.length; i++) {
					if ((65 * 365) - (datos[i][0] * 365) > 3000)
						valor = datos[i][1] * 1.1;
					else
						valor = datos[i][1] * 1.2;
					salida.writeInt(datos[i][0]);
					salida.writeUTF("-");
					salida.writeDouble(valor);
				}
				salida.flush();
				salida.close();
				break;
			case 2:

				while (entrada.available() > 0) {
					int valor1 = entrada.readInt();
					String cad = entrada.readUTF();
					double valor2 = entrada.readDouble();
					if (valor1 % 2 == 0)
						System.out.println(valor1 + cad + valor2);

				}
				entrada.close();
				break;
			case 3:
				break;
			}
			System.out.println("1-Grabar");
			System.out.println("2-Leer");
			System.out.println("3-Salir");
			System.out.print("Opcion:");
			opc = teclado.nextInt();
		}
	}

}