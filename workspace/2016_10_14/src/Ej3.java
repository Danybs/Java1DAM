import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero1,numero2,resta;
		double media;
		
	    System.out.println("Dime primer numero");
	    numero1=teclado.nextInt();
	    System.out.println("Dime segundo numero");
	    numero2=teclado.nextInt();
	    
	    media=(numero1+numero2)/2;
	    System.out.println("La media es:"+media);
	    if (numero1>numero2)
	      	resta=numero1-numero2;
	    else
	    	resta=numero2-numero1;
	    	System.out.println("La resta vale:"+resta);
		}

}
