package UT9;

class Animal{
	private int edad;
	private String nombre;
	Animal(int edad, String nombre){
		this.edad=edad;
		this.nombre=nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	String gestacion(){
		return "Menos de un año"; 
	}
	String comunica(){
		return "Gruñe";
	}
}
class Elefante extends Animal{
	
	Elefante(int edad, String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}
	String gestacion(){
		return "2 años";
	}
	String comunica(){
		return "barrita";
	}
}
public class D2017_05_02_Ej2_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal anm = new Animal(3,"woofie");
		Elefante ele = new Elefante(4,"dumbo");
		System.out.println(anm.getNombre()+" "+anm.gestacion()+" "+anm.comunica());
		System.out.println(ele.getNombre()+" "+ele.gestacion()+" "+ele.comunica());
	}

}
