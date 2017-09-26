
package auditorias;

import java.util.*;

/*
Ej1_18_04_2017.java
Hacer un HashMap de clave String y de valor un Float.Tiparlo
La clave será un código cadena de un articulo y el valor será el precio para ese articulo
Hacer un menú con las siguientes opciones:
1-Introducir producto(se pide código y su precio)
2-Modificar producto(el precio según un código que se pide)
3-Mostrar todos los productos
4-Eliminar producto(se pide código)
5-Salir
Hacer con un switch cada opción del menú(puedes hacer métodos si quieres para cada
opción).Sera un bucle hasta que se pulse la opción 5
 */
public class EJ_18_04_2017 {
	static HashMap<String, Float> lista=new HashMap();
	static int opcion;
	static Scanner teclado=new Scanner(System.in);
	static String codigo;
	static Float precio;
	static void menu(){
		System.out.println("1-Introducir producto(se pide código y su precio)\n"+
							"2-Modificar producto(el precio según un código que se pide)\n"+
							"3-Mostrar todos los productos\n"+
							"4-Eliminar producto(se pide código)\n"+
							"5-Salir\n");
		opcion=teclado.nextInt();
		teclado.nextLine();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		while (opcion != 5) {
		switch (opcion) {
		case 1:
			
			System.out.println("Codigo: ");
			codigo=teclado.nextLine();
			System.out.println("Precio: ");
			precio=teclado.nextFloat();
			lista.put(codigo, precio);
			break;
		case 2:
			System.out.println("Codigo modificar: ");
			codigo=teclado.nextLine();
			System.out.println("Precio nuevo: ");
			precio=teclado.nextFloat();
			lista.put(codigo, precio);
			break;
		case 3:
			Iterator<String> iterador=lista.keySet().iterator();
			while (iterador.hasNext()) {
				codigo= iterador.next();
				System.out.println("Codigo: "+codigo.toString()+" Precio: "+lista.get(codigo));
			}
			break;
		case 4:
			System.out.println("Codigo borrar: ");
			codigo=teclado.nextLine();
			
					lista.remove(codigo);
				
			
		case 5:
			break;
		}
		menu();
		}
	}

}