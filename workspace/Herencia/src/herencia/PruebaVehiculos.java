package herencia;
public class PruebaVehiculos {
	public static void main(String[] args) {
		Coche coche1 = new Coche("1111XXX", "gris", 5);
		Coche coche2 = new Coche("2222YYY", "rojo", 4);
		System.out.println(coche1);
		System.out.println(coche2);
		Moto moto1 = new Moto("3333ZZZ", "azul", 600, 1000, 2);
		System.out.println(moto1);
	}
}

class Vehiculos {
	public String matricula;
	public String color;
	public int n_ruedas;
	public int cilindrada;
	public int potencia;

	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 */
	public Vehiculos(String matricula, String color, int n_ruedas) {
		this.matricula = matricula;
		this.color = color;
		this.n_ruedas = n_ruedas;
	}

	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 * @param cilindrada
	 */
	public Vehiculos(String matricula, String color, int n_ruedas, int cilindrada) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.n_ruedas = n_ruedas;
		this.cilindrada = cilindrada;
	}

	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 * @param cilindrada
	 * @param potencia
	 */
	public Vehiculos(String matricula, String color, int n_ruedas, int cilindrada, int potencia) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.n_ruedas = n_ruedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getColor() {
		return color;
	}

	public int getN_ruedas() {
		return n_ruedas;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", n_ruedas=" + n_ruedas + ", cilindrada="
				+ cilindrada + ", potencia=" + potencia + "]";
	}
}

class Coche extends Vehiculos {
	int numPuertas;

	public Coche(String matricula, String color, int numPuertas) {
		super(matricula, color, 4);
		this.numPuertas = numPuertas;
	}

	public Coche(String matricula, String color, int cilindrada, int numPuertas) {
		super(matricula, color, 4, cilindrada);
		// this.n_ruedas = 4;
		this.numPuertas = numPuertas;
	}

	public Coche(String matricula, String color, int cilindrada, int potencia, int numPuertas) {
		super(matricula, color, 4, cilindrada, potencia);
		// this.n_ruedas = 4;
		this.numPuertas = numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	@Override
	public String toString() {
		return "Coches [numPuertas=" + numPuertas + ", n_ruedas=" + n_ruedas + ", matricula=" + matricula + ", color="
				+ color + ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}

}

class Moto extends Vehiculos {
	int numPlazas;

	/**
	 * @param matricula
	 * @param color
	 * @param numPlazas
	 */
	public Moto(String matricula, String color, int numPlazas) {
		super(matricula, color, 2);
		this.numPlazas = numPlazas;
	}

	/**
	 * @param matricula
	 * @param color
	 * @param cilindrada
	 * @param numPlazas
	 */
	public Moto(String matricula, String color, int cilindrada, int numPlazas) {
		super(matricula, color, 2, cilindrada);
		// TODO Auto-generated constructor stub
		this.numPlazas = numPlazas;
	}

	/**
	 * @param matricula
	 * @param color
	 * @param cilindrada
	 * @param potencia
	 * @param numPlazas
	 */
	public Moto(String matricula, String color, int cilindrada, int potencia, int numPlazas) {
		super(matricula, color, 2, cilindrada, potencia);
		// TODO Auto-generated constructor stub
		this.numPlazas = numPlazas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	@Override
	public String toString() {
		return "Moto [numPlazas=" + numPlazas + ", matricula=" + matricula + ", color=" + color + ", n_ruedas="
				+ n_ruedas + ", cilindrada=" + cilindrada + "CC" + ", potencia=" + potencia + "CV" + "]";
	}

}
