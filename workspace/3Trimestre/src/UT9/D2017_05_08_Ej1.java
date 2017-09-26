package UT9;

abstract class Instrumento{
	public String tipo;
	public abstract void tocar();
}
class Guitarra extends Instrumento{
	Guitarra(){
		tipo="guitarra";
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("tocar la guitarra");
	}

}
class Violin extends Instrumento{
	Violin(){
		tipo="guitarra";
	}
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("toca violin");
	}
	
}
class Saxofon extends Instrumento{
	Saxofon(){
		tipo="guitarra";
	}
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("toca saxofon");
	}
	
}

public class D2017_05_08_Ej1 {
	public static void main(String[] args) {
		//mio
		/*Guitarra g=new Guitarra();
		Violin v=new Violin();
		Saxofon s=new Saxofon();
		s.tocar();
		v.tocar();
		g.tocar();*/
		/**Objeto miGuitarra de tipo Instrumento */
		  Instrumento miGuitarra= new Guitarra();
		  System.out.println("Instrumento : "+miGuitarra.tipo);
		  miGuitarra.tocar();
		  System.out.println();
		  /**Objeto miSaxofon de tipo Instrumento */
		  Instrumento miSaxofon= new Saxofon();
		  System.out.println("Instrumento : "+miSaxofon.tipo);
		  miSaxofon.tocar();
		  System.out.println();
		  /**Objeto miViolin de tipo Instrumento */
		  Instrumento miViolin= new Violin();
		  System.out.println("Instrumento : "+miViolin.tipo);
		  miViolin.tocar();
	}
}


