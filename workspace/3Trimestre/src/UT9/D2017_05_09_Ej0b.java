package UT9;

class Vehiculo2{
	int dato=3;
	public void imprimir(){
		System.out.println("dato Metodopadre"+dato);
	}
	public int doble(){
		return dato*2;
	}
}
class Coche2 extends Vehiculo2{
	int dato=5;
	public void imprimir(){
		System.out.println("Dato Metodohijo"+dato);
	}
	public int triple(){
		return dato*3;
	}
}

public class D2017_05_09_Ej0b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo2 ve1;
		ve1=new Coche2();
		System.out.println(ve1.doble());
		//System.out.println(ve1.triple()); //da error ya falta en la clase padre
		ve1.imprimir();
	}

}
