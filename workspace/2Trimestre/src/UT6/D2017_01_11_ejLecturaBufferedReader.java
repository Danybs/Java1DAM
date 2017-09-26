package UT6;

import java.io.*;

public class D2017_01_11_ejLecturaBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(isr);
			String linea = buff.readLine();
			int entero = Integer.valueOf(buff.readLine()).intValue();
		} catch (Exception e) {
			System.err.println("error");
		}
	}

}
