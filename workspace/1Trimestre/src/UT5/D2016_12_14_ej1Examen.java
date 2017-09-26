package UT5;

import java.util.Scanner;

public class D2016_12_14_ej1Examen {
    String nombre;
    int edad;
    int salario;
    static int total=0;
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public int getSalario() {
		return salario;
	}
	int mesescurro()
	{
		return ((65-edad)*12);
	}
	D2016_12_14_ej1Examen(String nombre,int edad,int salario)
	{
		this.nombre=nombre;this.edad=edad;this.salario=salario;
		total=total+salario;
	}
	D2016_12_14_ej1Examen(D2016_12_14_ej1Examen p)
	{
		this.nombre=p.nombre;this.edad=p.edad;this.salario=p.salario;
		total=total+salario;
	}
	static int menu()
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("1-ver datos pedro");
		System.out.println("2-ver datos juan");
		System.out.println("3-salir");
		System.out.println("Dime opcion:");
		int opcion=teclado.nextInt();
		return opcion;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      D2016_12_14_ej1Examen objeto1=new D2016_12_14_ej1Examen("Pedro",35,1500);
      System.out.println(objeto1.getNombre()+" "+objeto1.getEdad()+" "+objeto1.getSalario());
      System.out.println("total "+total);
      D2016_12_14_ej1Examen objeto2=new D2016_12_14_ej1Examen("Juan",50,1900);
      System.out.println(objeto2.getNombre()+" "+objeto2.getEdad()+" "+objeto2.getSalario());
      System.out.println("total "+total);
      D2016_12_14_ej1Examen objeto3=new D2016_12_14_ej1Examen(objeto1);
      double media=(objeto1.mesescurro()+objeto2.mesescurro())/2;
      System.out.println("media meses es:"+media);
      int op;
      do
      {
    	  op=menu();
    	  switch (op)
    	  {
    	  case 1:  System.out.println(objeto1.getNombre()+" "+objeto1.getEdad()+" "+objeto1.getSalario());
    	           break;
    	  case 2:  System.out.println(objeto2.getNombre()+" "+objeto2.getEdad()+" "+objeto2.getSalario());
    	           break;
    	  case 3:  break;
    	  }
      }while(op!=3);
	}

}
