import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Taller {
	static LinkedHashMap<String,Partes> list = new LinkedHashMap<String,Partes>();
	static Scanner teclado=new Scanner(System.in);
	static private String matricula,cod,descripcion;
	static private double importe;
	static private int opt;
	
	void menu(){
		System.out.println("\nSelecciona una opcion\n"
				+ "1.Añadir parte a la coleccion\n"
				+ "2.Listar contenido y mostrar el número total de elementos\n"
				+ "3.Mostrar los datos del parte correspondiente a una matricula\n"
				+ "4.Borrar los datos del parte correspondiente a una matrícula\n"
				+ "0.Salir\n");
		opt=teclado.nextInt();
		teclado.nextLine();
	}
	void add(){
		System.out.println("Dime matricula del coche");
		matricula=teclado.nextLine();
		System.out.println("Dime codigo de parte ");
		cod=teclado.nextLine();
		System.out.println("Dime descripcion del parte: ");
		descripcion=teclado.nextLine();
		System.out.println("Dime importe");
		importe=teclado.nextDouble();
		Partes p=new Partes(cod,descripcion,importe);
		list.put(matricula,p);
		
	}
	void show(){
		for (Map.Entry<String, Partes> imp : list.entrySet()) {
			System.out.println(imp);
		}
		if(list.size()>1){
			System.out.println("Tenemos "+list.size()+" partes");
		}
		else if(list.size()==1){
			System.out.println("Tenemos "+list.size()+" parte");
		}
		else {
			System.out.println("No hay ningun parte");
		}
	}
	void show1(){
		System.out.println("Dime matricula: ");
		matricula=teclado.nextLine();
		for (Map.Entry<String, Partes> imp : list.entrySet()) {
			if(matricula.equalsIgnoreCase(imp.getKey())){
				System.out.println(imp);
			}
		}
	}
	void delete(){
		System.out.println("Dime matricula: ");
		matricula=teclado.nextLine();
		Iterator<String> itr = list.keySet().iterator();
		while(itr.hasNext()){
			if(matricula.equalsIgnoreCase(itr.next())){
				itr.remove();
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println("************TALLER MONCAVAL************");
		Taller t=new Taller();
		do{
			t.menu();
			switch (opt) {
			case 1:
				t.add();
				break;
			case 2:
				t.show();
				break;
			case 3:
				t.show1();
				break;
			case 4:
				t.delete();
				break;
			default:
				break;
			}
		} while(opt!=0);
	}
}

class Partes{
	private String codigo,descripcion;
	private double importe;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	/**
	 * @param codigo
	 * @param descripcion
	 * @param importe
	 */
	public Partes(String codigo, String descripcion, double importe) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "Partes [codigo=" + codigo + ", descripcion=" + descripcion + ", importe=" + importe + "]";
	}
	
}
