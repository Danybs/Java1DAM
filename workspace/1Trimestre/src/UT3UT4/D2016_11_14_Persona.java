package UT3UT4;

public class D2016_11_14_Persona {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2016_11_14_Persona p=new D2016_11_14_Persona();
		//p.edad=2;
		p.setEdad(2);
		//p.nombre="Pepe";
		p.setNombre("pepe");
		//System.out.println("Edad: "+p.edad);
		System.out.println("Edad:"+p.getEdad());
	}

}
