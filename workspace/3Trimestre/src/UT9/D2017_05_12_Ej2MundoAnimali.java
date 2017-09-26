package UT9;

public class D2017_05_12_Ej2MundoAnimali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animali Animal3 = new Animali();
		Animali Elefante2 = new Animali();
		Personai Persona = new Personai();
		Animal3.setNombre("Noofie");
		Elefante2.setNombre("Dumbo");
		Persona.setNombre("Adam");
		System.out.println(Animal3.getNombre()+" "+Animal3.gestacion()+" "+Animal3.comunica());
		System.out.println(Elefante2.getNombre()+" "+Elefante2.gestacion()+" "+Elefante2.comunica());
		System.out.println(Persona.getNombre()+" "+Persona.gestacion()+" "+Persona.comunica());
	}

}
interface Animaladai{
	public String gestacion();
	public String comunica();
}

class Animali implements Animaladai{
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String gestacion() {
		// TODO Auto-generated method stub
		return "menos de 20 meses";
	}

	@Override
	public String comunica() {
		// TODO Auto-generated method stub
		return "gruñe";
	}
}
class Personai implements Animaladai{
	public String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String gestacion() {
		// TODO Auto-generated method stub
		return "9 meses";
	}

	@Override
	public String comunica() {
		// TODO Auto-generated method stub
		return "habla";
	}
	
}
class Elefantei extends Animali{

	@Override
	public String gestacion() {
		// TODO Auto-generated method stub
		return "mas de 20 meses";
	}

	@Override
	public String comunica() {
		// TODO Auto-generated method stub
		return "barrita";
	}
}
