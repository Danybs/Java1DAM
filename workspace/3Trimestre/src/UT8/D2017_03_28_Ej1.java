package UT8;

import java.util.HashMap;
import java.util.Iterator;

public class D2017_03_28_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap dorsales=new HashMap();
			dorsales.put(new Integer(1), "alvaro");
			dorsales.put(new Integer(2), "pedro");
			dorsales.put(new Integer(3), "juan");
			
			//Listo 1
			System.out.println("El dorsal 2 lo tiene "+dorsales.get(new Integer(2)));
			//Listo todo
			Iterator<Integer> valores = dorsales.keySet().iterator();
			while (valores.hasNext()){
				Integer clave = valores.next(); //me da clave
				System.out.println("clave "+clave+" valor"+dorsales.get(clave));
			}
			
	}

}
