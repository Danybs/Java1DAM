package UT3UT4;

public class D2016_10_28_ordenador {
	static String marca;
	static String modelo;
	static double ram;
	static double discoduro;
	static int incrementoram;
	static int incrementohdd;
	static double mastodo;
	
	static void imprimir()
	{
		System.out.println("Marca: "+marca+" Modelo: "+modelo+" Ram: "+ram+" Discoduro: "+discoduro);
		
	}
	static void masmemoria()
	{
		ram=ram+incrementoram;
	}
	static void masdisco()
	{
		discoduro=discoduro+incrementohdd;
	}
	static void mastodo()
	{
		ram=(ram*0.15)+ram;
		discoduro=(discoduro*0.15)+discoduro;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marca="HP";
		modelo="probook4540s";
		ram=8;
		discoduro=500;
		
		imprimir();
		
		incrementoram=2;
		masmemoria();
		imprimir();
		
		incrementohdd=30;
		masdisco();
		imprimir();
		
		mastodo();
		imprimir();
		
		
	}

}
