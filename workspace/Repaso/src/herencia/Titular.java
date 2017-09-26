package herencia;

public class Titular {
	private String nombre,apellidos;
	private int edad;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public Titular(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Titular [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	
}
class Cuenta {
	private Titular Titular;
	private String n_cuenta;
	private double saldo;
	/**
	 * @param titular
	 * @param n_cuenta
	 * @param saldo
	 */
	public Cuenta(Titular titular, String n_cuenta, double saldo) {
		super();
		this.Titular = titular;
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
	}
	/**
	 * @param titular
	 * @param n_cuenta
	 * @param saldo
	 */
	public Cuenta(Titular titular, String n_cuenta) {
		super();
		this.Titular = titular;
		this.n_cuenta = n_cuenta;
		saldo=0;
	}
	public String getN_cuenta() {
		return n_cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	void ingresar(double cant){
		saldo=getSaldo()+cant;
	}
	void reintegro(double cant){
		saldo=getSaldo()-cant;
	}
	@Override
	public String toString() {
		return "Cuenta [Titular=" + Titular + ", n_cuenta=" + n_cuenta + ", saldo=" + saldo + "]";
	}
	
	
}
class CuentaAhorro extends Cuenta{
	private double interes;

	/**
	 * @param titular
	 * @param n_cuenta
	 * @param saldo
	 */
	public CuentaAhorro(Titular titular, String n_cuenta, double saldo, double interes) {
		super(titular, n_cuenta, saldo);
		// TODO Auto-generated constructor stub
		this.interes=interes;
	}

	/**
	 * @param titular
	 * @param n_cuenta
	 */
	public CuentaAhorro(Titular titular, String n_cuenta) {
		super(titular, n_cuenta);
		// TODO Auto-generated constructor stub
		this.interes=2.5;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	double calcularInteres(){
		double cI=(getSaldo()*getInteres())/100;
		super.ingresar(cI);
		return cI;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [interes=" + interes + "] "+super.toString();
	}
	
	
}
