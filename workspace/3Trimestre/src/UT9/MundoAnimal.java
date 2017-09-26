package UT9;

abstract class Animal22 {
	public Integer edad;
	public String nombre;

	/**
	 * @param edad
	 * @param nombre
	 */
	public Animal22(Integer edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}

	abstract void escribe();
}

class Pajaro extends Animal22 {
	/**
	 * @param edad
	 * @param nombre
	 */
	public Pajaro(Integer edad, String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}

	void escribe() {
		// TODO Auto-generated method stub
		System.out.println("esta piando " + getNombre() + " " + getEdad());

	}

}

class Pez extends Animal22{
	public String tipo;
	
	/**
	 * @param edad
	 * @param nombre
	 */
	public Pez(Integer edad, String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	void escribe(){
		System.out.println("esta burbujeando nombre: "+getNombre()+" edad: "+getEdad()+" tipo "+getTipo());
	}
	
}

public class MundoAnimal extends Animal22{

	public MundoAnimal(Integer edad, String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	void escribe() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Pajaro p1=new Pajaro(2,"Gaviota");
		Pez p2=new Pez(2,"merluza");
		p2.setTipo("blanco");
		p1.escribe();
		p2.escribe();
	}
}