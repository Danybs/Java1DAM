package UT5;

import java.util.Random;
import java.util.Scanner;

public class APokemon {
	
	String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	Double fuerza;

	public Double getFuerza() {
		return fuerza;
	}
	public void setFuerza(Double fuerza) {
		this.fuerza = fuerza;
	}
	
	APokemon(int huevo){
		switch (huevo){
		case 0:
			this.nombre="PIKACHU";
			Random p = new Random();
			fuerza = 40 + (50 - 40)*p.nextDouble();
			break;
		case 1:	
			this.nombre="Squirtle";
			Random s=new Random();
			fuerza = 30 + (60 - 30)*s.nextDouble();
			break;
		case 2:	
			this.nombre="Charmander";
			Random c=new Random();
			fuerza = 30 + (60 - 30)*c.nextDouble();
			break;
		}
		
	}
	double combatir(){
		return fuerza;
	}
	double entrenar(){
		Random g = new Random ();
		int ganas=g.nextInt(2);
		fuerza+=ganas;
		return fuerza;
	}
	int nivel(){
		int nivel;
		if (fuerza>=0 && fuerza<=20){
			nivel=1;
			
		}
			
		else if(fuerza>=21 && fuerza<=40){ 
			nivel=2;
			
		}
			
		else if(fuerza>=41 && fuerza<=50){
			nivel=3;
			
		}
			
		else if(fuerza>=51 && fuerza<=60){
			nivel=4;
			
		}
			
		else {
			nivel=5;
		
		}
		return nivel;
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int huevo;
		int opt;
		int opcion=1;
		Random num = new Random ();
		int numero=num.nextInt(2);
		huevo=num.nextInt(2);
		APokemon objeto1=new APokemon(huevo);
		huevo=num.nextInt(2);
		APokemon objeto2=new APokemon(huevo);
		Scanner teclado=new Scanner(System.in);
		Random rnd=new Random();
		do{
		System.out.println("1-Encontrar un pokemo1 nuevo");
		System.out.println("2-Encontrar un pokemo2 nuevo");
		System.out.println("3-Entrenar a primer pokemon");
		System.out.println("4-Combatir a primer pokemon vs segundo pokemon");
		System.out.println("5-Ver pokedex");
		System.out.println("6-Salir");
		opt=teclado.nextInt();	
		
		switch (opt){
		case 1:
			System.out.println();
			System.out.println("Has encontrado a: "+objeto1.getNombre());
			System.out.println();
		break;
		case 2:
			   System.out.println();
			   System.out.println("Has encontrado a: "+objeto2.getNombre());
			   System.out.println();
		break;
		case 3:
			System.out.println("Has entrenado a "+objeto1.getNombre()+" su fuerza ha pasado de "+objeto1.combatir()+" a "+objeto1.entrenar());
				break;
		case 4:
				System.out.println();
				System.out.println("Tus dos pokemons están combatiendo!");
				if (objeto1.combatir()>objeto2.combatir()){
					System.out.println("Ha ganado: "+objeto1.getNombre());
				}
				else {
					System.out.println("Ha ganado: "+objeto2.getNombre());
				}
				System.out.println();
				break;
		case 5:
				System.out.println();
				System.out.println("***POKEDEX***");
				System.out.println("Tu primer pokemon es: "+objeto1.getNombre()+" y su nivel es: "+objeto1.nivel());
				System.out.println("Tu segundo pokemos es: "+objeto2.getNombre()+" y su nivel es: "+objeto2.nivel());
				System.out.println();
				break;
		case 6:
			System.out.println();
			System.out.println("ADIOS");
			System.out.println();
		}
	}while(opt!=6);

	}		 
			 
}
	
		
	


