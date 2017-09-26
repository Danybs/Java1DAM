package Abstract;



public abstract class Llamadas {
	private String n_origen;
	private String n_destino;
	private int duracion;
	private double importe;
	abstract double calcularPrecio();
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
	@Override
	public String toString() {
		return "Llamadas [n_origen=" + n_origen + ", n_destino=" + n_destino + ", duracion=" + duracion + ", importe="
				+ importe + "]";
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
	
	
	
}

class Llamadas_locales extends Llamadas{
	public Llamadas_locales(String n_origen, String n_destino, int duracion) {
		super(n_origen, n_destino, duracion);
		// TODO Auto-generated constructor stub
	}

	private double tarifa=0.15;
	private double precio;
	@Override
	double calcularPrecio() {
		// TODO Auto-generated method stub
		precio=getDuracion()*tarifa;
		setImporte(precio);
		return precio;
	}

	
	
}

class Llamadas_provinciales extends Llamadas{
	public Llamadas_provinciales(String n_origen, String n_destino, int duracion, int franja) {
		super(n_origen, n_destino, duracion);
		// TODO Auto-generated constructor stub
		this.franja=franja;
	}
	private int franja;
	
	private double tarifa1=0.20;
	private double tarifa2=0.25;
	private double tarifa3=0.30;
	
	@Override
	double calcularPrecio() {
		// TODO Auto-generated method stub
		double precio=0;
		switch (franja) {
		case 1:
			precio=tarifa1;
			break;
		case 2:
			precio=tarifa2;
			break;
		case 3:
			precio=tarifa3;
			break;

		default:
			break;
		}
		precio*=getDuracion();
		setImporte(precio);
		return precio;
	}


	
}
