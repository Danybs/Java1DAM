package UT8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Persona implements Comparable<Persona>{
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	String nombre;
	int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return getEdad()-o.getEdad();
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
public class D2017_05_03_Ej1  {
	public static void main(String[] args) {
		
		TreeMap<Persona,String> tm = new TreeMap(new D2017_05_03_Comparator());		
		tm.put(new Persona("Pedro", 53),"usu1");
		tm.put(new Persona("Ana", 34),"usu2");
		tm.put(new Persona("Rafael", 45),"usu3");
		tm.put(new Persona("Luis", 23),"usu4");
		
		System.out.println("Ordenando por nombre");
		for (Map.Entry<Persona, String> imp : tm.entrySet()) {
			System.out.println(imp);
		}
		System.out.println();
		Iterator<Persona> itr= tm.keySet().iterator();
		while(itr.hasNext()){
			itr.next();
			if(itr.next().getNombre().equalsIgnoreCase("rafael"))
			itr.remove();
		}
		
		System.out.println();
		
		TreeMap<Persona,String> tm1 = new TreeMap();
		tm1.put(new Persona("Pedro", 53),"usu1");
		tm1.put(new Persona("Ana", 34),"usu2");
		tm1.put(new Persona("Rafael", 45),"usu3");
		tm1.put(new Persona("Luis", 23),"usu4");
		
		System.out.println("Ordenando por edad");
		for (Map.Entry<Persona, String> imp : tm1.entrySet()) {
			System.out.println(imp);
		}
	}

}
