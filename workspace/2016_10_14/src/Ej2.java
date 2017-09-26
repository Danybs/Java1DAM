import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int valor;
		int numero1,numero2;
	    
		System.out.println("Dime primer numero");
		numero1=teclado.nextInt();
		System.out.println("Dime segundo numero");
		numero2=teclado.nextInt();
		
	    valor=((numero1>numero2)?numero1%numero2:numero2%numero1);
	    System.out.println((valor==0)?"son multiplos":"no son multiplos");
	}

}
