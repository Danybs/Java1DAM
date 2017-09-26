/**
 * 
 */
package Interfaces.EjPuertas;

/**
 * @author Dani
 *
 */
public class Puerta {
	boolean bloqueada;
	int N_Puerta;
	/**
	 * @param bloqueada
	 * @param n_Puerta
	 */
	public Puerta(boolean bloqueada, int n_Puerta) {
		super();
		this.bloqueada = bloqueada;
		this.N_Puerta = n_Puerta;
	}
		
	public void setBloqueada(boolean bloqueada) {
		this.bloqueada = bloqueada;
	}
	public boolean isBloqueada() {
		return bloqueada;
	}
	public int getN_Puerta() {
		return N_Puerta;
	}
	public void setN_Puerta(int n_Puerta) {
		N_Puerta = n_Puerta;
	}

	@Override
	public String toString() {
		return "Puerta [bloqueada=" + bloqueada + ", N_Puerta=" + N_Puerta + "]";
	}
	
	
}
