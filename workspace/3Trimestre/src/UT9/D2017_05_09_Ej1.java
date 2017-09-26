package UT9;

class Persona_05_09 {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String saludo() {
		return "persona";
	}

}

class Empleado_05_09 extends Persona_05_09 {
	private int sueldoBase;

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	String saludo() {
		return "empleado";
	}

}

class Encargado extends Empleado_05_09 {
	int getSueldo() {
		return getSueldoBase()+(getSueldoBase() * 10) / 100;
	}

	String saludo() {
		return "encargado";
	}
}

public class D2017_05_09_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona_05_09 p1 = new Empleado_05_09();
		p1.setNombre("Isaac");
		// p1.setSueldo(100); El metodo esta en la hija pero no en la padre y es
		// una persona
		System.out.println(p1.saludo());
		Empleado_05_09 e1 = new Encargado();
		e1.setSueldoBase(500);
		// System.out.println(e1.getSueldo()); El metodo esta en la hija pero no
		// en la padre
		System.out.println(e1.saludo());
	}

}
