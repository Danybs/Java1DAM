package UT9;

class Persona {

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

class Empleado extends Persona {
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

class Alumno extends Persona {
	String curso;
	String etapa;
}

public class D2017_04_26_Ejercicio1 {
	public static void main(String[] args) {
		Empleado emp = new Empleado();
		emp.setNombre("Pedro");
		emp.setEdad(55);
		System.out.println("Te llamas: " + emp.getNombre() + " y ganas " + emp.getSueldo());
	}
}
