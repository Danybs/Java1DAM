package UT9;

/**
 * 
 * @author Dani
 *
 */
class Persona1 {
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

}

class Empleado1 extends Persona1{
	float sueldo;
	String nivel;

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}

public class D2017_04_26_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado1 emp = new Empleado1();
		emp.setSueldo(123);
		emp.setNombre("pepe");
		System.out.println("nombre: "+emp.getSueldo()+" sueldo: "+emp.getSueldo());
	}

}
