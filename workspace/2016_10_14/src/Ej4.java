import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int a,b,c;
		double valor1,valor2;
		
	    System.out.println("Dime primer numero");
	    a=teclado.nextInt();
	    System.out.println("Dime segundo numero");
	    b=teclado.nextInt();
	    System.out.println("Dime tercer numero");
	    c=teclado.nextInt();
	    
	    valor1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
	    valor2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
	    System.out.println("Raiz1 es:"+valor1+" raiz2 es:"+valor2);
	}

}
