package UT2;
import java.util.Scanner;

public class D2016_10_18_ej3 {
    final static int CUOTA=500;
    final static int MAYORES=50;
    final static int MENORES_SOCIOS=35;
    final static int MENORES_NOSOCIOS=25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner teclado=new Scanner(System.in);
        int edad,cuota;
        String socio;

        cuota=CUOTA;

        System.out.println("Dime edad");
        edad=teclado.nextInt();
         
        if (edad>=65)
            cuota-=CUOTA * MAYORES / 100;
        else if (edad<18)
        { 

        String basura=teclado.nextLine();
        System.out.println("El padre es socio(si/no)?");
        socio=teclado.nextLine();
        if (socio.equalsIgnoreCase("si"))
            cuota-=CUOTA * MENORES_SOCIOS / 100;              
        else 
            cuota-=CUOTA * MENORES_NOSOCIOS / 100;              

        }
        System.out.println("Debe pagar "+cuota+ " Euros");
	}

}