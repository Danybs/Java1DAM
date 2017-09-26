package UT8;

import java.util.HashMap;
import java.util.Scanner;

public class D2017_04_18_Ej1 {
	static int op;
	HashMap<String, Float> inventario = new HashMap();
	static Scanner teclado = new Scanner(System.in);
	String cod;
	float precio;

	void menu() {
		System.out.println("1. Introducir producto (Codigo y precio)");
		System.out.println("2. Modificar precio de producto(Codigo y nuevo precio)");
		System.out.println("3. Mostrar todos los productos");
		System.out.println("4. Eliminar producto(Codigo producto)");
		System.out.println("5. Salir");
		op = teclado.nextInt();
		String basura = teclado.nextLine();
	}

	void op1() {
		System.out.println("\nDime producto (Codigo): ");
		cod = teclado.nextLine();
		System.out.println("Dime el precio del producto: ");
		precio = teclado.nextFloat();
		inventario.put(cod, precio);
		System.out.println("\nProducto insertado");
	}

	void op2() {
		System.out.println("\nDime producto (Codigo) a modificar: ");
		cod = teclado.nextLine();
		if (inventario.containsKey(cod)) {
			System.out.println("Dime el precio del producto a modificar: ");
			precio = teclado.nextFloat();
			inventario.put(cod, precio);
			System.out.println("\nProducto modificado");
		} else {
			System.out.println("El codigo no existe");
			System.out.println();
		}
	}

	void op3() {
		System.out.println("\nMostrando todos los valores: ");
		for (Object key : inventario.keySet()) {
			System.out.println("Codigo: " + key + " Precio: " + inventario.get(key) + "€");
		}
		System.out.println();
	}

	void op4() {
		if (inventario.containsKey(cod)) {
			System.out.println("\nIntroduzca producto(Código) a eliminar:");
			cod = teclado.nextLine();
			inventario.remove(cod);
			System.out.println("\nProducto eliminado.");
		} else {
			System.out.println("El producto no existe.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_04_18_Ej1 inv = new D2017_04_18_Ej1();
		do {
			inv.menu();
			switch (op) {
			case 1:
				inv.op1();
				break;
			case 2:
				inv.op2();
				break;
			case 3:
				inv.op3();
				break;
			case 4:
				inv.op4();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("\nValor no válido");
				break;
			}
		} while (op != 5);
	}

}
