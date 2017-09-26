import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Dani
 *
 */

public class Taller {
	String matricula;
	String codigo;
	String descripcion;
	int importe;
	LinkedHashMap<String,Parte> seguro=new LinkedHashMap();
	Scanner teclado=new Scanner(System.in);
	static int op;
	void menu(){
		System.out.println("\n1. Añadir parte a la colección\n"+
						   "2. Listar contenido y mostrar el número total de elementos.\n"+
						   "3. Mostrar los datos del parte correspondiente a una matrícula.\n"+
						   "4. Borrar los datos del parte correspondiente a una mátricula.\n"+
						   "5. Salir\n");
		op=teclado.nextInt();
		teclado.nextLine();
	}
	void add(){
		System.out.println("Dime mátricula: ");
		matricula=teclado.nextLine();
		System.out.println("Código: ");
		codigo=teclado.nextLine();
		System.out.println("Descripción: ");
		descripcion=teclado.nextLine();
		System.out.println("Importe: ");
		importe=teclado.nextInt();
		seguro.put(matricula, new Parte(codigo,descripcion,importe));
	}
	void list(){
		System.out.println("Mostrando todos los partes...");
		for (Map.Entry<String, Parte> listado: seguro.entrySet()) {
			System.out.println(listado.getKey()+" "+listado.getValue());
		}
		System.out.println("Elementos: "+seguro.size());
	}
	void show(){
		System.out.println("Dime mátricula");
		matricula=teclado.nextLine();
		System.out.println("Mostrando parte correspondiente a:"+matricula);
		for (Map.Entry<String, Parte> listado : seguro.entrySet()) {
			if(matricula.equalsIgnoreCase(listado.getKey())){
				System.out.println(listado.getValue());
			}
		}
	}
	void delete(){
		System.out.println("Dime mátricula");
		matricula=teclado.nextLine();
		Iterator<String> itr = seguro.keySet().iterator(); 
		while(itr.hasNext()){
			String i1 = itr.next();
			if(i1.equals(matricula)){
				seguro.remove(i1);
			}
		}
		System.out.println("Parte borrado");
	}
	public static void main(String[] args) {
		Taller t1= new Taller();
		do{
			t1.menu();
		switch (op) {
		
		case 1:
			t1.add();
			break;
		case 2:
			t1.list();
			break;
		case 3:
			t1.show();
			break;
		case 4:
			t1.delete();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Valor no válido");
			break;
		}
		}while(op!=5);
	}
}
