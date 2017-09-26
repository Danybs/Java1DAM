import java.util.Scanner;
public class coche {

	/**
	 * @param args
	 */
	static int velocidad;
	static String matricula;
	
	static void imprimir()
	{
		System.out.println("Velocidad:"+velocidad+" matricula:"+matricula);
	}
	static void masvelocidad()
	{
		Scanner teclado=new Scanner(System.in);
			
	    System.out.println("Dime incremento");
	    int incremento=teclado.nextInt();
		velocidad=velocidad+incremento;
	}
	static void menosvelocidad(int dec)
	{
	    velocidad=velocidad-dec;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int decremento;
	     Scanner teclado=new Scanner(System.in);
			
		 velocidad=100;
	     matricula="1232HJK";
	     imprimir();
	     
		 System.out.println("Dime velocidad");
		 velocidad=teclado.nextInt();
		 String basura=teclado.nextLine();
		 System.out.println("Dime matricula");
		 matricula=teclado.nextLine();
		 imprimir();
		 
		 masvelocidad();
		 imprimir();
		 
		 System.out.println("Dime decremento");
		 decremento=teclado.nextInt();
		 menosvelocidad(decremento);
		 imprimir();
	}

}