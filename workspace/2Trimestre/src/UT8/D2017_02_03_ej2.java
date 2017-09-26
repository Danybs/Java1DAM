package UT8;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class D2017_02_03_ej2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter wr = new BufferedWriter(new FileWriter("fich_token.txt"));
		Scanner teclado = new Scanner(System.in);

		String cad1;
		String cad2;
		System.out.println("Dime conyugue1: ");
		cad1 = teclado.nextLine();
		while (!cad1.equalsIgnoreCase("fin")) {

			System.out.println("Dime conyugye2: ");
			cad2 = teclado.nextLine();
			wr.write(cad1 + "=" + cad2);
			wr.write("\n");

			System.out.println("Dime conyugue1: ");
			cad1 = teclado.nextLine();
		}
		wr.flush();
		wr.close();

		if (new File("fich_token.txt").exists()) {
			BufferedReader rd = new BufferedReader(new FileReader("fich_token.txt"));
			try {
				String line = rd.readLine();
				while (line != null) {
					StringTokenizer st = new StringTokenizer(line, "=", false);
					System.out.println("Tiene "+st.countTokens()+" tokens");
					while (st.hasMoreTokens()) {
						String c1 = st.nextToken();
						String c2 = st.nextToken();
						
						System.out.println("Vivan los novios " + c1 + " y " + c2);
						
					}

					line = rd.readLine();

				}
				rd.close();
			} catch (Exception e) {
				System.err.println("Error" + e.getMessage());
			}
		}

		else {
			System.out.println("File not found");
		}

	}

}
