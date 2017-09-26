package UT5;

import java.util.Scanner;

public class D2016_12_05_corregido {
    public int menu()
    {
    	Scanner teclado=new Scanner(System.in);
    	System.out.println("Elije opcion:");
    	System.out.println("1-Sumar");
    	System.out.println("2-Restar");
    	System.out.println("3-Multiplicar");
    	System.out.println("4-Dividir");
    	System.out.println("Dime opcion:");
    	int opcion=teclado.nextInt();
    	return opcion;
    }
    public void sumar()
    {
    	Scanner teclado=new Scanner(System.in);
    	System.out.println("Dime numero1");
    	int num1=teclado.nextInt();
    	System.out.println("Dime numero2");
    	int num2=teclado.nextInt();
    	int suma=num1+num2;
    	System.out.println("La suma de "+num1+"+"+num2+"es:"+suma);
    }
    public void restar()
    {
    	Scanner teclado=new Scanner(System.in);
    	System.out.println("Dime numero1");
    	int num1=teclado.nextInt();
    	System.out.println("Dime numero2");
    	int num2=teclado.nextInt();
    	int resta;
    	if (num1>num2)
    	{
    	     resta=num1-num2;
    	     System.out.println("La resta de "+num1+"-"+num2+"es:"+resta);
    	}
    	else 
    	{
    		resta=num2-num1;
    		System.out.println("La resta de "+num2+"-"+num1+"es:"+resta);
    	}
    }
    public void multiplicar(int valor)
    {
    	Scanner teclado=new Scanner(System.in);
    	System.out.println("Dime numero");
    	int num=teclado.nextInt();
    	int multiplicacion=num*valor;
    	System.out.println("La multiplicacion de "+num+"*"+valor+"es:"+multiplicacion);
    }
    public int dividir()
    {
    	int division=0;
    	try
    	{
    		Scanner teclado=new Scanner(System.in);
        	System.out.println("Dime numero1");
        	int num1=teclado.nextInt();
        	System.out.println("Dime numero2");
        	int num2=teclado.nextInt();
        	division=num1/num2;
        	return division;
        }
    	catch (Exception e)
    	{
    		System.out.println("Error division");
    		return division; 
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2016_12_05_corregido objeto=new D2016_12_05_corregido();
		Scanner teclado=new Scanner(System.in);
        int op=objeto.menu();
        switch(op)
        {
        case 1:objeto.sumar();
               break;
        case 2:objeto.restar();
               break;
        case 3:System.out.println("Dime valor:");
               int valor=teclado.nextInt();
        	   objeto.multiplicar(valor);
        	   break;
        case 4:int valor2=objeto.dividir();
               System.out.println("El valor de la division es:"+valor2);
               break;
        }
	}

}