package UT8;

import java.util.HashMap;
import java.util.Iterator;

public class D2017_03_28_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap notas = new HashMap();
		notas.put(new String("Juan"), new Integer(5));
		notas.put(new String("Luis"), new Integer(6));
		notas.put(new String("David"), new Integer(9));
		notas.put(new String("Jose"), new Integer(7));
		notas.put(new String("Alejandro"), new Integer(5));
		notas.put(new String("Javier"), new Integer(7));

		// Lista 1
		System.out.println("el valor de David es: " + notas.get(new String("David")));

		// Lista todos los valores
		Iterator<String> valores = notas.keySet().iterator();
		while (valores.hasNext()) {
			String clave = valores.next();
			System.out.println(clave + " - " + notas.get(clave));
		}
	}

}
