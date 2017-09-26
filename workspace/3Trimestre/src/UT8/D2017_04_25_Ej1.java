package UT8;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class D2017_04_25_Ej1 {
	LinkedList<String> myList = new LinkedList<String>();
	ListIterator<String> itr = myList.listIterator();
	Scanner teclado = new Scanner(System.in);
	static int op;
	String cad;

	void menu() {
		System.out.println("\n1. Insertar cadena a la izquierda(por delante)");
		System.out.println("2. Insertar cadena a la derecha(por atras");
		System.out.println("3. Eliminar elemento por la izquierda(por delante)");
		System.out.println("4. Eliminar elemento por la derecha(por detrás");
		System.out.println("5. Borrar toda la lista");
		System.out.println("6. Insertar en cualquier posición");
		System.out.println("7. Salir\n");
		op = teclado.nextInt();
		String basura = teclado.nextLine();
	}

	void addFirst() {
		System.out.println("Dime cadena a insertar a la derecha: ");
		cad = teclado.nextLine();
		myList.addFirst(cad);
		System.out.println("¡Cadena insertada!\n");
	}

	void addLast() {
		System.out.println("Dime cadena a insertar por la izquierda: ");
		cad = teclado.nextLine();
		myList.addLast(cad);
		System.out.println("¡Cadena insertada!");
	}

	void removeFirst() {
		myList.removeFirst();
		System.out.println("¡Elemento borrado!");
	}

	void removeLast() {
		myList.removeLast();
		System.out.println("¡Elemento borrado!");
	}

	void removeAll() {
		myList.clear();
		System.out.println("¡Lista borrada!");
	}

	void add() {
		System.out.println("Dime cadena a insertar");
		cad = teclado.nextLine();
		int pos;
		do {
			System.out.println("Dime posicion entre 0 y " + myList.size());
			pos = teclado.nextInt();
			if (pos > myList.size())
				System.out.println("Valor no válido");
		} while (pos > myList.size());
		myList.add(pos, cad);
		System.out.println("¡Cadena insertada correctamente!\n");
	}

	void imprimir() {
		System.out.println("Imprimiendo lista...");
		for (String string : myList) {
			System.out.println(string);
		}
		System.out.println("Tamaño de la lista: " + myList.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_04_25_Ej1 obj = new D2017_04_25_Ej1();
		do {
			obj.menu();
			switch (op) {
			case 1:
				obj.addFirst();
				break;
			case 2:
				obj.addLast();
				break;
			case 3:
				obj.removeFirst();
				break;
			case 4:
				obj.removeLast();
				break;
			case 5:
				obj.removeAll();
				break;
			case 6:
				obj.add();
				break;
			case 7:
				System.exit(0);
			default:
				break;
			}
			obj.imprimir();
		} while (op != 7);
	}

}
