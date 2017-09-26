package UT5;

public class D2016_12_09_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=0; // contador a 0
		for (int r=1; r<=4; r++){ //inicializo las filas
			System.out.print(r);  //imprimo el valor inicial de la fila
			a+=3;				  //le sumo 3 al contador cada vez que da una vuelta
			for(int y=r+2; y<a; y=y+2){ //y<a para que no imprima mas valores que el contador
				System.out.print(" "+y);
				}
				System.out.println (); //salto de linea 
				}
		
	}

}
