package UT8;

import java.util.Comparator;
import java.util.TreeSet;



public class D2017_05_23_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Persona6> ts = new TreeSet<Persona6>(new MyNameComp());
		Persona6 p1 = new Persona6("Pedro",53);
		Persona6 p2 = new Persona6("Ana",34);
		Persona6 p3 = new Persona6("Rafael",45);
		Persona6 p5 = new Persona6("Pedro",53);
		Persona6 p4 = new Persona6("Luis",23);
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		for (Persona6 imp : ts) {
			System.out.println(imp);
		}
	}

}

class Persona6 {
	String nombre;
	int edad;
	
	public Persona6(){
		
	}
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona6(String nombre, int edad) {
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
		return "Persona6 [nombre=" + nombre + ", edad=" + edad + "]";
	}
		
}
class MyNameComp implements Comparator<Persona6>{
	@Override
	public int compare(Persona6 arg0, Persona6 arg1) {
		// TODO Auto-generated method stub
		String a=arg0.getNombre();
		String b=arg1.getNombre();
		return a.compareToIgnoreCase(b);
	}
}
