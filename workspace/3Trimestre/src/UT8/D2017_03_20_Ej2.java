package UT8;

import java.util.ArrayList;
import java.util.Iterator;

public class D2017_03_20_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList numeros = new ArrayList();
		numeros.add(new Integer(23));
		numeros.add(new Integer(45));
		numeros.add(new Integer(-2));
		numeros.add(new Integer(89));

		// FORMA 1
		Iterator itr = numeros.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***********");
		// FORMA 2
		for (Object object : numeros) {
			System.out.println((Integer) object);
		}
		System.out.println("***********");
		// Forma tipada
		ArrayList<Integer> numeros2 = new ArrayList();
		numeros2.add(new Integer(23));
		numeros2.add(new Integer(45));
		numeros2.add(new Integer(-2));
		numeros2.add(new Integer(89));
		// FORMA3 (tipando foreach)
		for (Integer integer : numeros2) {
			System.out.println(integer);
		}
	}

}
