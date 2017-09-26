package UT3UT4;

import java.util.*;
public class D2016_11_08_ej1_1 {
	static int diasfecha(int mes,int anio)
	{
	int dias;
		
	switch(mes)
	{
	case 2:if ( ((anio%4==0)&&(anio%100!=0))  || (anio%400==0) )
		       dias=29;
	       else
	    	   dias=28;
	       break;
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:dias=31;
	        break;
	default:dias=30;
	        break;
	}
	return dias;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner teclado=new Scanner(System.in);
     System.out.println("Dime mes");
     String mes=teclado.nextLine(); 
     System.out.println("Dime año");
     String anio=teclado.nextLine();
     
     int mesi=Integer.parseInt(mes); 
     int anioi=Integer.parseInt(anio);
     
     int dias=diasfecha(mesi,anioi);
     if ( ((anioi%4==0)&&(anioi%100!=0))  || (anioi%400==0) )
         	 System.out.println("Año bisiesto.");
     else
    	     System.out.println("Año no bisiesto");
     System.out.println("Numero dias del mes:"+mesi+" es:"+dias);
      
	}

}