package UT3UT4;

import java.util.Scanner;
	
public class D2016_11_08_ej1 {
	static Scanner teclado=new Scanner(System.in);
	static int dias;
	static String bisi;
	static String mesString;
	static String anioString;
	static int mes() {
		int mes=Integer.parseInt(mesString);
		return mes;
	}
	static int anio() {
		int anio=Integer.parseInt(anioString);
		return anio;
	}
	static void diasfecha() {
		System.out.println("Mes: "+mes()+" Dias: "+dias+", El año "+anio()+" es "+bisi);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dime un numero del mes: ");
		mesString=teclado.nextLine();
		System.out.println("Dime un año");
		anioString=teclado.nextLine();
		switch (mes())
		{
		case 11:
		case 9:
		case 7:
        case 5:
        case 3:
        case 1: dias=30;
                        break;
        case 2: dias=28;
        				break;
        default: dias=31;
        				break;
		}
	
		if (((anio() % 4 == 0) && (anio()% 100 != 0))||(anio() % 400 == 0))
				{
			bisi="año bisiesto";
				}
		else
		{
			bisi="año no bisiesto";
		}
		
		diasfecha();
		       
	}

}
