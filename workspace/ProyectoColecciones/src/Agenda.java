import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * ArrayList
 * Desarrollar un sistema de control de una agenda. Iremos guardando la información de cada contacto por orden 
 * de inserción: nombre,dirección y teléfono.
 * 
 * El programa deberá mostrar por pantala un menu de opciones:
 * (Menu)
 * 
 * Cada opción se reealiza con un método. Los datos se introducen por teclado.
 */
public class Agenda {
	Scanner teclado = new Scanner(System.in);
	static int opt;
	static ArrayList<Contactos> agenda = new ArrayList();
	String nombre, dir, tel;
	int posi,position;

	public void menu() {
		System.out.println("\n1. Añadir contacto.");
		System.out.println("2. Listar contactos y mostrar el número total.");
		System.out.println("3. Mostrar los datos del contacto por nombre.");
		System.out.println("4. Borrar los datos del contacto por nombre.");
		System.out.println("5. Mostrar los datos del contacto por la posición que ocupa");
		System.out.println("0. Salir");
		System.out.println("\nElige opción: \n");
		opt = teclado.nextInt();
		String basura = teclado.nextLine();
	}

	public void add() {

		System.out.println("Dime un nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Dime una dirección: ");
		dir = teclado.nextLine();
		System.out.println("Dime un telefono: ");
		tel = teclado.nextLine();
		Contactos C = new Contactos(nombre, dir, tel);
		agenda.add(C);
		System.out.println("\nContacto añadido.");
	}

	public void list() {
		for (Contactos contactos : agenda) {
			System.out.println(contactos.getNombre() + " " + contactos.getDir() + " " + contactos.getTel());
		}
		System.out.println("El tamaño de la agenda es de: " + agenda.size() + " contactos.");
	}

	public void show() {
		System.out.println("Dime nombre del contacto a mostrar");
		nombre = teclado.nextLine();
		for (Contactos contactos : agenda) {
			if (contactos.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(contactos.getNombre() + " " + contactos.getDir() + " " + contactos.getTel());
			}
		}
	}

	public void delete() {
		System.out.println("Dime nombre del contacto a borrar");
		nombre = teclado.nextLine();
		for (Contactos contactos : agenda) {
			if (contactos.getNombre().equals(nombre)) {
				position=agenda.indexOf(contactos);
			}
		}
		agenda.remove(position);
		System.out.println("\nContacto borrado");
	}

	public void show1() {
		System.out.println("Dime la posición del contacto a mostrar");
		posi = teclado.nextInt();
		posi = posi - 1;
		System.out.println(
				agenda.get(posi).getNombre() + " " + agenda.get(posi).getDir() + " " + agenda.get(posi).getTel());
	}

	public void exit() {
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda app = new Agenda();
		do {
			app.menu();
			switch (opt) {
			case 0:
				app.exit();
			case 1:
				app.add();
				break;
			case 2:
				app.list();
				break;
			case 3:
				app.show();
				break;
			case 4:
				app.delete();
				break;
			case 5:
				app.show1();
				break;
			default:
				System.out.println("\nValor no válido");
				break;
			}
		} while (opt != 0);
	}

}
