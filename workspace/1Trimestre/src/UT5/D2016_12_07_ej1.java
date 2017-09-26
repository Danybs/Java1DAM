package UT5;
import java.util.*;

	public class D2016_12_07_ej1 {
	
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      int N;
      try
      {
          System.out.println("Dime numero N");
          N=teclado.nextInt();
      }
      catch (Exception e)
      {
          System.out.println("Error numero equivocado");
          return; //salgo main
      }
      int numero=1;
      while (numero<=N)  //numero filas(las filas las da el numero por teclado N)
      {
          for (int i=1;i<=numero;i++)  //numero columnas coincide con la fila(numero) que estoy
          {
             System.out.print("* ");
          }   
          numero++;
          System.out.println("");
      }
    }
    
}
