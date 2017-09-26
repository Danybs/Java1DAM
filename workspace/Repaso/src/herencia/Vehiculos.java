package herencia;

public class Vehiculos {
	private String matricula,color;
	private int n_ruedas,cilindrada,potencia;
	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 */
	public Vehiculos(String matricula, String color, int n_ruedas) {
		super();
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
		return "Vehiculos [matricula=" + matricula + ", color=" + color + ", n_ruedas=" + n_ruedas + ", cilindrada="
				+ cilindrada + ", potencia=" + potencia + "]";
	}
}
class Coches extends Vehiculos{
	private int numPuertas;

	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 * @param cilindrada
	 * @param potencia
	 */
	public Coches(String matricula, String color, int cilindrada, int potencia, int numPuertas) {
		super(matricula, color, 4, cilindrada, potencia);
		// TODO Auto-generated constructor stub
		this.numPuertas=numPuertas;
	}

	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 * @param cilindrada
	 */
	public Coches(String matricula, String color, int cilindrada, int numPuertas) {
		super(matricula, color, 4, cilindrada);
		// TODO Auto-generated constructor stub
		this.numPuertas=numPuertas;
	}

	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 */
	public Coches(String matricula, String color, int numPuertas) {
		super(matricula, color, 4);
		// TODO Auto-generated constructor stub
		this.numPuertas=numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Coches [numPuertas=" + numPuertas + "] "+super.toString();
	}
	
	
}
class Motos extends Vehiculos {
	private int numPlazas;

	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 * @param cilindrada
	 * @param potencia
	 */
	public Motos(String matricula, String color, int cilindrada, int potencia, int numPlazas) {
		super(matricula, color, 2, cilindrada, potencia);
		// TODO Auto-generated constructor stub
		this.numPlazas=numPlazas;
	}

	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 * @param cilindrada
	 */
	public Motos(String matricula, String color, int cilindrada, int numPlazas) {
		super(matricula, color, 2, cilindrada);
		// TODO Auto-generated constructor stub
		this.numPlazas=numPlazas;
		
	}

	/**
	 * @param matricula
	 * @param color
	 * @param n_ruedas
	 */
	public Motos(String matricula, String color, int numPlazas) {
		super(matricula, color, 2);
		// TODO Auto-generated constructor stub
		this.numPlazas=numPlazas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	@Override
	public String toString() {
		return "Motos [numPlazas=" + numPlazas + "] "+super.toString();
	}
	
	
}
