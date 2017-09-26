package UT5;

public class D2016_11_30_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try 
		{
			System.out.println("Intentamos ejecutar el bloque de instrucciones");
			System.out.println("Instrucción 1");
			int n=Integer.parseInt("M");
			System.out.println("Instrucción 2");
			System.out.println("Instrucción 3");
		}
		catch(Exception e){
			System.out.println("Instrucciones a ejecutar cuando se produce un error");
		}
		finally{
			System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no");		
			
		}
	}

}
