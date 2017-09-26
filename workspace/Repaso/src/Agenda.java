import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;



public class Agenda {
	ArrayList<Personas> lista = new ArrayList<Personas>();
	static Scanner teclado=new Scanner(System.in);
	static String nombre,telefono,direccion;
	static int opt;
	void menu(){
		System.out.println("\nDime una opcion:\n"
				+ "1.Añadir contacto\n"
				+ "2.Listar contactos y mostrar el número total\n"
				+ "3.Mostrar los datos del contacto por nombre\n"
				+ "4.Borrar los datos del contacto por nombre\n"
				+ "5.Mostrar los datos del contacto por la posicion que ocupa\n"
				+ "0.Salir\n");
		opt=teclado.nextInt();
		teclado.nextLine();
	}
	void add(){
		System.out.println("Dime nombre:");
		String nombre=teclado.nextLine();
		System.out.println("Dime direccion:");
		String direccion=teclado.nextLine();
		System.out.println("Dime tel");
		String telefono=teclado.nextLine();
		Personas obj=new Personas(nombre,direccion,telefono);
		lista.add(obj);
		System.out.println("Contacto insertado");
	}
	void show(){
		for (Personas imp : lista) {
			System.out.println(imp);
		}
		System.out.println("El tamaño de la agenda es de: "+lista.size());
	}
	void show1(){
		System.out.println("Dime nombre");
		nombre=teclado.nextLine();
		for (Personas personas : lista) {
			if(personas.getNombre().equalsIgnoreCase(nombre))
			System.out.println(personas);
		}
	}
	void delete(){
		System.out.println("Dime nombre contacto a borrar: ");
		String nom=teclado.nextLine();
		for (Personas personas : lista) {
			if(personas.getNombre().equalsIgnoreCase(nom)){
				lista.remove(personas);
			}
		}
		System.out.println("Contacto borrado");
	}
	void show2(){
		System.out.println("Dime posicion:");
		int pos;
		pos=teclado.nextInt();
		System.out.println(lista.get(pos));
	}
	
	public static void main(String[] args) {
		Agenda app=new Agenda();
		System.out.println("*********AGENDA 2017-2018*********");
		app.menu();
		while(opt!=0){
		switch (opt) {
		case 1:
			app.add();
			break;
		case 2:
			app.show();
			break;
		case 3:
			app.show1();
			break;
		case 4:
			app.delete();
			break;
		case 5:
			app.show2();
			break;			
			}
		app.menu();
		}
	}
}

class Personas {
	private String nombre,direccion,telefono;

	/**
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 */
	public Personas(String nombre, String direccion, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
}


	

