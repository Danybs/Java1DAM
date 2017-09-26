package UT8;

import java.util.HashSet;

public class D2017_04_04_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val [] = {"hola","alumno","fp","superior","fp"};
		
		HashSet<String> conjunto=new HashSet();
		for (int i = 0; i < val.length; i++) {
		    if (!conjunto.contains(val[i])){
	        	conjunto.add(val[i]);
		    }
		    else {
		    	System.out.println(val[i]+" Valor duplicado");
		    }
		}
		
		for (String cadena : conjunto) {
			System.out.println((String)cadena);
		}
		
	}

}
