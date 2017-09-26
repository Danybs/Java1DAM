package herencia;

public class PracticaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titular titular1;
		titular1 = new Titular("Daniel", "Blanco Sanz", 24);
		Cuenta ctaTitular1;
		ctaTitular1 = new Cuenta(titular1, "654");
		ctaTitular1.ingresar(700);
		ctaTitular1.reintegro(200);
		System.out.println(ctaTitular1);
		CuentaAhorro c1 = new CuentaAhorro(titular1, "456");
		c1.ingresar(1000);
		System.out.println(c1);
		c1.calcularInteres();
		System.out.println(c1);
	}

}

class Titular {
	private String nombre;
	private String apellidos;
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
	private Titular titular;
	private String n_cuenta;
	private double saldo;

	/**
	 * @param titular
	 * @param n_cuenta
	 * @param saldo
	 */
	public Cuenta(Titular titular, String n_cuenta, double saldo) {
		super();
		this.titular = titular;
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
		this.titular = titular;
		this.n_cuenta = n_cuenta;
		this.saldo = 0;
	}

	public String getN_cuenta() {
		return n_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	void ingresar(double inc) {
		this.saldo = this.saldo + inc;
	}

	void reintegro(double dis) {
		this.saldo = this.saldo - dis;
	}

	@Override
	public String toString() {
		return "Cuenta [" + titular + " n_cuenta=" + n_cuenta + ", saldo=" + saldo + "]";
	}

}

class CuentaAhorro extends Cuenta {
	double interes;

	public CuentaAhorro(Titular titular, String n_cuenta, double saldo, double interes) {
		super(titular, n_cuenta, saldo);
		this.interes = interes;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param titular
	 * @param n_cuenta
	 */
	public CuentaAhorro(Titular titular, String n_cuenta) {
		super(titular, n_cuenta, 0);
		this.interes = 2.5;
		// TODO Auto-generated constructor stub
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	void calcularInteres() {

		ingresar((getInteres() * getSaldo()) / 100);
	}

	@Override
	public String toString() {
		return "CuentaAhorro [interes=" + interes + ", toString()=" + super.toString() + "]";
	}

}