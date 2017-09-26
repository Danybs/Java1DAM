package UT9;

class Persona2 {
	String nombre;
	int edad;
	Persona2(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
}
class Empleado2 extends Persona2{
	float sueldo;
	String nivel;
	Empleado2(float sueldo, String nivel){
		super("1245JGH",13); //LLama al constructor de Persona
		this.sueldo=sueldo;
		this.nivel=nivel;
	}
}
public class D2017_05_02_Ej1_Piloto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado2 emp = new Empleado2(123.2f,"1");
		System.out.println(emp.nombre+" "+emp.edad);
		System.out.println(emp.sueldo+" "+emp.nivel);
	}

}
