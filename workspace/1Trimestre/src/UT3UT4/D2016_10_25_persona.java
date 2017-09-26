package UT3UT4;

class D2016_10_25_persona
	{
	static String direccion; //atributo
	static String nombre; //atributo
	static int edad; //atributo
	
	static void imprimir() ///método
	{
	System.out.println("Nombre:"+nombre+" edad:"+edad);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Trabajo sin crear objetos
		edad=2;
		nombre="Pepe";
		direccion="aqui";
		
		System.out.println("Mi nombre es: "+nombre+" Mi edad es "+edad);
		imprimir();
	}
}