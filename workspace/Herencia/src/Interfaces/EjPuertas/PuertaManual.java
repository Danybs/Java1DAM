package Interfaces.EjPuertas;

public class PuertaManual extends Puerta{

	public PuertaManual(boolean bloqueada, int n_Puerta) {
		super(bloqueada, n_Puerta);
		// TODO Auto-generated constructor stub
	}
	public void bloquear() {
        System.out.println("Bloqueando manualmente la puerta " + getN_Puerta());
        bloqueada = true;
    }

    public void desbloquear() {
        System.out.println("Desbloqueando manualmente la puerta " + getN_Puerta());
        bloqueada = false;
    }

}
