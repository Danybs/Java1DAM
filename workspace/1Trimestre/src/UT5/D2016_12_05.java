package UT5;

import java.util.Scanner;

public class D2016_12_05 {
	int n1;
	int n2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	Scanner teclado=new Scanner(System.in);
	void num(){
		System.out.println("Dime un número: ");
		n1=teclado.nextInt();
		System.out.println("Dime el segundo número");
		n2=teclado.nextInt();
	}
	void suma() {
		num();
		System.out.println(suma=n1+n2);
	}
	void resta() {
		num();
		if(n1<=n2){
			System.out.println(resta=n2-n1);
		}
			else{
				System.out.println(resta=n1-n2);
			}
		}
	void multiplicacion(){
		int num1=5;
		System.out.println("Dime un número: ");
		n1=teclado.nextInt();
		System.out.println(multiplicacion=n1*num1);
	}
	void division(){
		try{	
		num();
		System.out.println(division=n1/n2);
		}
		catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
	void menu(){
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.Dividir");
		System.out.println("5.Salir");
	}	
		
	void opcion(){
			int opcion;
			System.out.println("Dime una opcion");
			opcion=teclado.nextInt();
			switch (opcion)
			{
			case 1: suma();
			break;
			case 2: resta();
			break;
			case 3: multiplicacion();
			break;
			case 4: division();
			break;
			case 5: salir();
			break;
			
			}
		
	}
	void salir(){
			System.out.println("Adios");
		}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D2016_12_05 cal=new D2016_12_05();
		cal.menu();
		cal.opcion();
	}

}
