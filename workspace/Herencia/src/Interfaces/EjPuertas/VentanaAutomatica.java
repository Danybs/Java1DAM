package Interfaces.EjPuertas;

public class VentanaAutomatica implements Temporizador {
	boolean bloqueada;
	int numVentana;
	/**
	 * @param bloqueada
	 * @param numVentana
	 */
	public VentanaAutomatica(boolean bloqueada, int numVentana) {
		super();
		this.bloqueada = bloqueada;
		this.numVentana = numVentana;
	}
	public boolean isBloqueada() {
		return bloqueada;
	}


	public void setBloqueada(boolean bloqueada) {
		this.bloqueada = bloqueada;
	}


	public int getNumVentana() {
		return numVentana;
	}


	public void setNumVentana(int numVentana) {
		this.numVentana = numVentana;
	}


	@Override
	public String toString() {
		return "VentanaAutomatica [bloqueada=" + bloqueada + ", numVentana=" + numVentana + "]";
	}
	@Override
	public Boolean timer() {
		// TODO Auto-generated method stub
		if (bloqueada) {
			return bloqueada = false;
		} else
			return bloqueada = true;
	}
}
