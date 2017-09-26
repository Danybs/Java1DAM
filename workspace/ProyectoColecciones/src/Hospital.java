import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 * @author Dani
 *
 */
public class Hospital {
	static int op;
	private String nombre;
	private String dir;
	private int edad;
	/*
	 * Creamos el objeto comparador
	 */
	Pacientes comparadorNombre = new Pacientes();
	/*
	 * Le pasamos el parametro comparador para que nos ordene los objetos en
	 * funcion del comparador, es decir por nombre.
	 */
	TreeSet<Pacientes> listado = new TreeSet(comparadorNombre);
	TreeSet<Pacientes> listado1 = new TreeSet();

	Scanner teclado = new Scanner(System.in);

	void menu() {
		System.out.println("1. Añadir paciente");
		System.out.println("2. Listar pacientes(Ordenados por nombre) y mostrar el número total");
		System.out.println("3. Listar pacientes(Ordenados por edad) y mostrar el número total");
		System.out.println("4. Borrar los datos del paciente por nombre");
		System.out.println("0. Salir");
		System.out.println("Elige una opción\n");
		op = teclado.nextInt();
		String basura = teclado.nextLine();
	}

	void add() {
		System.out.println("Dime el nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Dime la dirección: ");
		dir = teclado.nextLine();
		System.out.println("Dime la edad: ");
		edad = teclado.nextInt();
		Pacientes P = new Pacientes(nombre, dir, edad);
		listado.add(P);
		listado1.add(P);
		System.out.println("\nContacto añadido\n");
	}

	void list() {
		Iterator<Pacientes> itr = listado.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		System.out.println("\nLa lista de pacientes es de: " + listado.size() + "\n");
	}

	void list2() {
		Iterator<Pacientes> itr = listado1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		System.out.println("\nLa lista de pacientes es de: \n" + listado1.size() + "\n");
	}

	void delete() {
		System.out.println("Dime el nombre del paciente que quieres borrar: ");
		nombre = teclado.nextLine();
		boolean check=false;
		for (Pacientes pacientes : listado) {
			if(pacientes.getNombre().equalsIgnoreCase(nombre))
				check=true;
		}
		if(check){
		Iterator<Pacientes> itr = listado.iterator();
		while (itr.hasNext()) {
			Pacientes pa = itr.next();
			if (pa.getNombre().equalsIgnoreCase(nombre)) {
				itr.remove();
			}
		}
		Iterator<Pacientes> itr1 = listado1.iterator();
		while (itr1.hasNext()) {
			Pacientes pa = itr1.next();
			if (pa.getNombre().equalsIgnoreCase(nombre)) {
				itr1.remove();
			}
		}
		System.out.println("Paciente eliminado\n");
		}
		else
			System.out.println("El paciente no existe en la base de datos\n");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hosp = new Hospital();
		do {
			hosp.menu();
			switch (op) {
			case 1:
				hosp.add();
				break;
			case 2:
				hosp.list();
				break;
			case 3:
				hosp.list2();
				break;
			case 4:
				hosp.delete();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("\nIntroduzca un valor válido");
				break;
			}
		} while (op != 0);
	}

}
