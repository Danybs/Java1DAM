package UT3UT4;

import java.util.Scanner;

public class D2016_11_08_ej3 {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
     Scanner teclado=new Scanner(System.in);
     System.out.print("Dime caracter:");
     String caracter=teclado.nextLine(); 
     if (caracter.compareTo("p")>0)
    	 System.out.println("El caracter tecleado esta detras de la p");
     else if (caracter.compareTo("p")<0)
    	 System.out.println("El caracter tecleado esta delante de la p");
     else 
    	 System.out.println("El caracter tecleado es igual a la p");
	}

}
