package UT9;

import java.util.*;

class Operacion {
	int valor1;
	int valor2;
	int resultado;
	Scanner teclado=new Scanner(System.in);
	void cargar1() {
		System.out.println("Dime valor para valor1: ");
		valor1=teclado.nextInt();
	}
	void cargar2(){
		System.out.println("Dime valor para valor2: ");
		valor2=teclado.nextInt();
	}
	void imprimir(){
		System.out.println(resultado);
	}
}

class Suma extends Operacion {
	void operar(){
		resultado=valor1+valor2;
	}
}

class Resta extends Operacion {
	void operar(){
		resultado=valor1-valor2;
	}
}
public class D2017_04_26_Ej4 {
	public static void main(String[] args) {
		Suma mas=new Suma();
		mas.cargar1();
		mas.cargar2();
		mas.operar();
		mas.imprimir();
		Resta menos=new Resta();
		menos.cargar1();
		menos.cargar2();
		menos.operar();
		menos.imprimir();
		
	}
}
