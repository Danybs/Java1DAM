package UT8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Famoso {
	public String nombre;
	public String disco;

	Famoso(String nombre, String disco) {
		this.nombre = nombre;
		this.disco = disco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

}

class ListaCantantes {
	Scanner teclado = new Scanner(System.in);
	ArrayList<Famoso> famosos = new ArrayList();

	ListaCantantes() {
		famosos.add(new Famoso("Michael Jackson", "Thriller"));
		Famoso c1 = new Famoso("Madonna", "All i want is you");
		famosos.add(c1);

	}

	void addFamoso() {
		System.out.println("Dime el nombre de un famoso: ");
		String nombre = teclado.nextLine();
		System.out.println("Dime el disco de un famoso: ");
		String disco = teclado.nextLine();
		famosos.add(new Famoso(nombre, disco));
	}

	void printList1() {
		Iterator<Famoso> imp = famosos.iterator();
		while (imp.hasNext()) {
			Famoso i1 =(Famoso)imp.next();
			System.out.println("Nombre del famoso: " + i1.getNombre() + " Album: " + i1.getDisco());
		}
	}

	void printList2() {
		for (Famoso famoso : famosos) {
			System.out.println("Nombre del famoso: " + famoso.getNombre() + " Album: " + famoso.getDisco());
		}
	}
}

public class D2017_04_21_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ListaCantantes obj = new ListaCantantes();
		obj.printList1();
		String check="a";
		while (!check.equalsIgnoreCase("N")) {
			System.out.println("¿Quieres añadir a otro famoso Y/N?");
			check = teclado.nextLine();
			if (check.equalsIgnoreCase("Y")) {
				obj.addFamoso();
			}
		}
		if (check.equalsIgnoreCase("N")) {
			obj.printList2();
		}
	}

}
