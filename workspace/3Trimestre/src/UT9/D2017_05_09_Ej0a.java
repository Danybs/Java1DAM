package UT9;

class Vehiculo {
	int dato;

	public void imprimir() {
		System.out.println("dato MetodoPadre" + dato);
	}
}
class Coche extends Vehiculo{
	int dato;
	public void imprimir(){
		super.dato=10; //dato del padre vehiculo
		this.dato=5; //dato del hijo coche
		System.out.println("dato metodohijo"+dato);
	}
	public void mostrar(){
		this.imprimir();//metodo de coche
		imprimir(); //metodo de coche
		super.imprimir(); //metodo de vehiculo
	}
}

public class D2017_05_09_Ej0a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche co=new Coche();
		co.imprimir();
		co.mostrar();
	}

}
