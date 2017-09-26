package UT8;

import java.util.ArrayList;
import java.util.Iterator;

public class D2017_03_20_Ej1 {
	public static void main(String[] args) {
		ArrayList lista=new ArrayList();
		lista.add("Esto");
		lista.add("es");
		lista.add("una");
		lista.add("prueba");
		lista.add("de");
		lista.add("almacen");
		lista.add("de");
		lista.add("palabras");
			//FORMA 1
		Iterator itr = lista.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("***************");
			//FORMA 2
				for (Object palabra : lista) {
					System.out.println((String)palabra);
				}
		
			//COLECCIONES TIPADAS - 28/03/2017
		ArrayList<String> lista2=new ArrayList();
		lista2.add("Hoy");
		lista2.add("hace");
		lista2.add("un");
		lista2.add("buen");
		lista2.add("dia");
		
			//FORMA3 (tipando foreach)
		for (String palab : lista2) {
			System.out.println(palab);
		}
		
		
	}
}
