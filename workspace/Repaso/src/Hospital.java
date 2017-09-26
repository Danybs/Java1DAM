import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Hospital {
	static TreeSet<Pacientes> list = new TreeSet<Pacientes>(new MyNomComp());
	static Scanner teclado = new Scanner(System.in);
	static int opt;
	static String nom, dir;
	static int edad;

	void menu() {
		System.out.println("\n1.Añadir paciente\n" + "2.Listar pacientes y mostrar el número total\n"
				+ "3.Borrar los datos del paciente por nombre\n" + "0.Salir\n");
		opt = teclado.nextInt();
		teclado.nextLine();
	}

	void add() {
		
		System.out.println("Dime nombre paciente: ");
		nom = teclado.nextLine();
		System.out.println("Dime direccion: ");
		dir = teclado.nextLine();
		System.out.println("Dime edad");
		edad = teclado.nextInt();
		Pacientes p = new Pacientes(nom, dir, edad);
		list.add(p);
	}

	void listar() {
		Iterator<Pacientes> itr =  list.iterator();
		do{
			System.out.println(itr.next());
		} while(itr.hasNext());
		System.out.println(list.size());
	}

	void delete(){
		System.out.println("Dime nombre paciente a borrar");
		nom=teclado.nextLine();
		for (Pacientes pacientes : list) {
			if(pacientes.getNombre().equalsIgnoreCase(nom)){
				list.remove(pacientes);
			}
		}
	}

	public static void main(String[] args) {
		Hospital app = new Hospital();
		System.out.println("***********HOSPITAL ALCOBENDAS***********");
		app.menu();
		while (opt != 0) {
			switch (opt) {
			case 1:
				app.add();
				break;
			case 2:
				app.listar();
				break;

			case 3:
				app.delete();
				break;
			}
			app.menu();
		}
	}
}

class Pacientes {
	private String nombre, direccion;
	private int edad;


	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 * @param direccion
	 * @param edad
	 */
	public Pacientes(String nombre, String direccion, int edad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pacientes [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + "]";
	}
	

}
class MyNomComp implements Comparator<Pacientes>{

	@Override
	public int compare(Pacientes o1, Pacientes o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}
	
}