package UT5;

public class D2016_12_09_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int i,j;
	      for (i=1;i<=4;i++)
	      {
	          for (j=1;j<=4-i;j++)    //imprime blancos a la izquierda
	              System.out.print("    ");
	          for (j=1;j<=(2*i)-1;j++)
	              System.out.print("  * ");  //imprimr los asteriscos
	          System.out.println("");  //salta linea
	      }
	      
	      
	    }
	    
	}