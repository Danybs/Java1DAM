package herencia;

public class PruebaVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coches coche1,coche2;
		coche1=new Coches("1111XXX","gris",5);
		coche2=new Coches("2222YYY","rojo",4);
		System.out.println(coche1);
		System.out.println(coche2);
		Motos moto1= new Motos("3333ZZZ","azul",2);
		System.out.println(moto1);
	}

}
