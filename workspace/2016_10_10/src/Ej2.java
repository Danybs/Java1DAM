
public class Ej2 {
	public enum ESTACIONES {PRIMAVERA,VERANO,OTOÑO,INVIERNO};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Datos: Condicion ? Valor1:Valor2
		 *  				TRUE
		 *							FALSE
		 */
		 
	    int c=55;
	     ESTACIONES est;
	     
	     System.out.println(((c>0)?c+" es positivo":c+" es negativo"));
	     System.out.println(((c%2==0)?c+" es par":c+" es impar")); 
	     System.out.println(((c%5==0)?c+" es multiplo 5":c+" no es multiplo 5"));
	     System.out.println(((c%10==0)?c+" es multiplo 10":c+" no es multiplo 10"));
	     System.out.println(((c<100)?c+" es menor 100":c+" es mayor 100")); 
	     
	     est=ESTACIONES.VERANO;
	     System.out.println("\nLa estacion es:"+est);
	     
	
	
	}

}
