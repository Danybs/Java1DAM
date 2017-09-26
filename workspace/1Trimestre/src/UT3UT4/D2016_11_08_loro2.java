package UT3UT4;

public class D2016_11_08_loro2 {

	String colorplumaje; //atributo
	String nombre; //atributo
	int edad; //atributo
	void imprimir() ///método
	{
	System.out.println("color:"+colorplumaje+" nombre:"+nombre+"  edad:"+edad);
	}
	void hablar(String frase) //metodo
	{
	System.out.println(frase); //el método dice la frase que se le pasa como argumento
	}
	int getEdad() //metodo
	{
	return edad;
	}
	public static void main(String args[])
	{
	//Trabajo sin crear objetos
	D2016_11_08_loro2 p;
	p=new D2016_11_08_loro2();
	p.edad=2;
	p.nombre="Pepe";
	p.colorplumaje="verde";
	p.imprimir();
	p.hablar("hola soy Pepe");
	System.out.println("Mi edad es "+p.getEdad());
	}

}