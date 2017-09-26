package Abstract;

public class Test{
	static int numEmpleados;
	static double importeTotal;
	static void Factura(Trabajadores tt){
		numEmpleados++;
		importeTotal+=tt.calcularSueldo();
		System.out.println(tt.toString());
	}
	public static void main(String[] args) {
		Trabajadores t1 = new Salariados("Juan lopez","calle1","NS231321",1300.2);
		Trabajadores t2 = new Salariados("alvaro lopez","calle2","NS231321",1100.2);
		Trabajadores t3 = new Autonomos("pepe lopez","calle3",160,15);
		Trabajadores t4 = new Autonomos("luis lopez","calle4",120,13);
		/*System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);*/
		Factura(t1);
		Factura(t2);
		Factura(t3);
		Factura(t4);
		System.out.println("El número de empleados es de: "+numEmpleados+" y el importe total es de: "+importeTotal);
	}
}
abstract class Trabajadores {
	String nombre, direccion, num_seg;
	double sueldo,tarifa;
	int horas;

	/**
	 * @param nombre
	 * @param direccion
	 * @param num_seg
	 * @param sueldo
	 */
	public Trabajadores(String nombre, String direccion, String num_seg, double sueldo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.num_seg = num_seg;
		this.sueldo = sueldo;
	}
	public Trabajadores(String nombre, String direccion, int horas, double tarifa){
		this.nombre = nombre;
		this.direccion = direccion;
		this.horas = horas;
		this.tarifa= tarifa;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	abstract double calcularSueldo();

	@Override
	public String toString() {
		return "Trabajadores [nombre=" + nombre + ", direccion=" + direccion + ", num_seg=" + num_seg + ", sueldo="
				+ sueldo + "]";
	}
}

class Salariados extends Trabajadores {
	private final double impuesto = 0.19;

	public Salariados(String nombre, String direccion, String num_seg, double sueldo) {
		super(nombre, direccion, num_seg, sueldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcularSueldo() {
		// TODO Auto-generated method stub
		return getSueldo() - getSueldo() * impuesto;
	}
	public String toString(){
		return super.toString() + " sueldo neto " + calcularSueldo() + "€";
	}
}

class Autonomos extends Trabajadores {

	public Autonomos(String nombre, String direccion, int horas, double tarifa) {
		super(nombre, direccion, horas, tarifa);
		// TODO Auto-generated constructor stub

	}

	@Override
	double calcularSueldo() {
		// TODO Auto-generated method stub
		return tarifa*horas;
	}
	public String toString(){
		sueldo=calcularSueldo();
		return super.toString() + "importe a cobrar " + calcularSueldo() + "€";
	}

}
