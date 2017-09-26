package UT9;
class Avion{
	public String modelo;
	public float potencia;
	Avion(String modelo, float potencia) {
		this.modelo = modelo;
		this.potencia = potencia;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	void escribe(){
		
	}
}
class Comercial extends Avion{
	public boolean barato;
	Comercial(String modelo, float potencia) {
		super(modelo, potencia);
		// TODO Auto-generated constructor stub
		
	}
	void escribe(){
		if (barato){
		System.out.println("Avion comercial "+modelo+" "+potencia+" es barato");
		}
		else {
		System.out.println("Avion comercial "+modelo+" "+potencia+" no barato");
		}
	}
	public void darbarato(boolean barato){
		this.barato = barato;
	}
		
}
class Militar extends Avion{

	Militar(String modelo, float potencia) {
		super(modelo, potencia);
		// TODO Auto-generated constructor stub
	}
	void escribe(){
		System.out.println("Avion militar "+getModelo()+" "+getPotencia());
	}
	
}

public class D2017_05_02_Ej3_Avion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Militar m = new Militar("BOEING-211",2.3F);
		Comercial c = new Comercial("BOEING-747",1.5F);
		c.darbarato(true);
		m.escribe();
		c.escribe();
	}

}
