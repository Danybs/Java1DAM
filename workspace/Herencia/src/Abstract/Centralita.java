package Abstract;

/*Desarrolla una aplicación de control de llamadas realizadas en una centralita telefónica.
Todas las llamadas tienen como datos el número origen de la llamada, el número destino, su
duración en segundos y el importe.
Existen dos tipos de llamadas:
• Las llamadas locales que cuestan 15 céntimos el segundo.
• Las llamadas provinciales que dependen de la franja horaria en la que se realicen, siendo
de 20 céntimos en franja 1, 25 céntimos en franja 2 y 30 céntimos en franja 3, cada
segundo.

Desarrolla la clase Centralita que en su método main registre varias llamadas de distinto tipo
mostrando la información que se tiene de cada una de ellas, incluyendo su importe.
A continuación modifica la clase ejecutable, de forma que nos muestre además el número total
de llamadas realizadas y el importe total. (Añade en la ejecutable dos atributos static,
numLlamadas e importeTotal, y un método static llamado factura cuyo parámetro sea una
variable de tipo llamada; este método es el que realizará el control de las llamadas, es decir
deberá ir contándolas y acumular su importe).*/

public class Centralita {
	static int numLlamadas;
	static double importeTotal;
	public static void factura(Llamadas lt){
		numLlamadas++;
		importeTotal+=lt.calcularPrecio();
		System.out.println(lt.toString());
	}
	public static void main(String[] args) {
		
		Llamadas l1 = new Locales("637932236", "637901411", 60);
		Llamadas l2 = new Provinciales("637932236", "637901411", 60, 2);
		System.out.println("El importe es de: "+l1.calcularPrecio()+"€");
		System.out.println("El importe es de: "+l2.calcularPrecio()+"€");
		
		factura(l1);
		factura(l2);
		System.out.println("\nNumero de llamadas "+numLlamadas+
                " Importe total "+importeTotal);
		
	}
}

abstract class Llamadas {
	String n_origen, n_destino;
	int duracion;
	double importe;

	/**
	 * @param n_origen
	 * @param n_destino
	 * @param duracion
	 * @param importe
	 */
	public Llamadas(String n_origen, String n_destino, int duracion) {
		super();
		this.n_origen = n_origen;
		this.n_destino = n_destino;
		this.duracion = duracion;
	}

	public String getN_origen() {
		return n_origen;
	}

	public void setN_origen(String n_origen) {
		this.n_origen = n_origen;
	}

	public String getN_destino() {
		return n_destino;
	}

	public void setN_destino(String n_destino) {
		this.n_destino = n_destino;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public abstract double calcularPrecio();

	@Override
	public String toString() {
		return "Llamadas [n_origen=" + n_origen + ", n_destino=" + n_destino + ", duracion=" + duracion + "]";
	}
}

class Locales extends Llamadas {
	public Locales(String n_origen, String n_destino, int duracion) {
		super(n_origen, n_destino, duracion);
		// TODO Auto-generated constructor stub
	}

	final double tarifa = 0.15;

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		double precio;
		precio = getDuracion() * tarifa;
		setImporte(precio);
		return precio;
	}

	public String toString() {
		return "Datos: " + super.toString() + "\nLa tarifa es " + tarifa;
	}
}

class Provinciales extends Llamadas {
	public Provinciales(String n_origen, String n_destino, int duracion, int franja) {
		super(n_origen, n_destino, duracion);
		this.franja = franja;
		// TODO Auto-generated constructor stub
	}

	int franja;
	final double tarifa1 = 0.20;
	final double tarifa2 = 0.25;
	final double tarifa3 = 0.30;

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		double precio = 0;
		switch (franja) {

		case 1:
			precio = tarifa1;
			break;
		case 2:
			precio = tarifa2;
			break;
		case 3:
			precio = tarifa3;
			break;
		}
		precio *= getDuracion();
		setImporte(precio);
		return precio;
	}

	public String toString() {
		return "Datos: " + super.toString() + "\nLa tarifa es: " + franja;
	}

}
