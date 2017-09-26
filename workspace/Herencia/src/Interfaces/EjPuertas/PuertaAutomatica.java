package Interfaces.EjPuertas;

public class PuertaAutomatica extends Puerta implements Temporizador{

	public PuertaAutomatica(boolean bloqueada, int n_Puerta) {
		super(bloqueada, n_Puerta);
		// TODO Auto-generated constructor stub
	}
	public Boolean timer(){
		if(bloqueada){
			return bloqueada=false;
		}
		else
		return bloqueada=true;
	}

}
