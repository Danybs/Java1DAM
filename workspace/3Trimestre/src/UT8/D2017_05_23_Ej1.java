package UT8;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class D2017_05_23_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Persona5, String> t1 = new TreeMap();
		Persona5 p1 = new Persona5("Pedro",53);
		Persona5 p2 = new Persona5("Ana",34);
		Persona5 p3 = new Persona5("Rafael",45);
		Persona5 p4 = new Persona5("Luis",23);
		t1.put(p1,"persona1");
		t1.put(p2,"persona2");
		t1.put(p3,"persona3");
		t1.put(p4,"persona4");
		for (Persona5 imp : t1.keySet()) {
			System.out.println(imp);
			System.out.println(t1.get(imp));
		}
		
	}

}
class Persona5 {
	String nombre;
	int edad;
	
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona5(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
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
	public String toString() {
		return "Persona5 [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
