package UT3UT4;

class D2016_10_25_loro1
	{
	static String colorplumaje; //atributo
	static String nombre; //atributo
	static int edad; //atributo
	
	static void imprimir() ///método
	{
	System.out.println("color:"+colorplumaje+" nombre:"+nombre+"  edad:"+edad);
	}
	static void hablar(String frase) //metodo
	{
	System.out.println(frase); //el método dice la frase que se le pasa como argumento
	}
	static int getEdad() //metodo
	{
	return edad;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Trabajo sin crear objetos
		edad=2;
		nombre="Pepe";
		colorplumaje="verde";
		imprimir();
		hablar("hola soy Pepe");
		System.out.println("Mi edad es "+getEdad());
		
	}

}
