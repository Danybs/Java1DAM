package Interfaces;

public class TestSonidos {// Comunicacion O Animal
	static void reproduceSonido(Comunicacion sonido){
		System.out.println(sonido.emiteSonido());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Perro();
		Animal a2 = new Gato();
		Animal a3 = new Canario();
		RelojCucu r1 = new RelojCucu();
		System.out.println(a1.emiteSonido());
		System.out.println(a2.emiteSonido());
		System.out.println(a3.emiteSonido());
		reproduceSonido(a1);
		reproduceSonido(r1);
	}

}
abstract class Animal implements Comunicacion{
	public abstract String emiteSonido();
}
class RelojCucu implements Comunicacion {

	@Override
	public String emiteSonido() {
		// TODO Auto-generated method stub
		return "cu..cu";
	}
	
}
class Perro extends Animal{
	@Override
	public String emiteSonido() {
		// TODO Auto-generated method stub
		 return "guau";
	}
	
}

class Gato extends Animal{

	@Override
	public String emiteSonido() {
		// TODO Auto-generated method stub
		return "miau";
	}
	
}
class Canario extends Animal{

	@Override
	public String emiteSonido() {
		// TODO Auto-generated method stub
		return "pio";
	}
	
}

