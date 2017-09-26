import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n1,n2;
		try
		{
		   System.out.println("Dime numero1");
		   n1=teclado.nextInt();
		   try
		   {
			   System.out.println("Dime numero2");
			   n2=teclado.nextInt();
			   System.out.println("Division vale:"+n1/n2);
		   }
		   catch(InputMismatchException e)
		   {
			  System.out.println("Debes introducir un numero");   
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println("No se puede dividir por 0");
		   }
		}
		catch(InputMismatchException e)
		{
			System.out.println("Debes introducir un numero");
		}
	}

}
