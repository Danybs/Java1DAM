import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Begin
		Scanner teclado=new Scanner(System.in);
		int matematicas,lengua;
		
		System.out.println("Dime la nota de matemáticas: ");
		matematicas=teclado.nextInt();
		System.out.println("Dime la nota de lengua: ");
		lengua=teclado.nextInt();
		
		//Punto1.1
		System.out.println("FORMA 1.1");
		if (matematicas>=5)
		{
			if (lengua>=5)
			{
				System.out.println("Enorabuena has aprobado");
			}
			else
				{	
				System.out.println("Al menos aprobaste Matracas");
				}
		}
		else	
		{
				System.out.println("No has aprobado matematicas");
				if (lengua>=5)
				{
				System.out.println("Solo te queda una");
				}
		}
		
		//Punto1.2
        System.out.println("FORMA 1.2");
		if ((matematicas>=5)&&(lengua>=5))
			
		{
		System.out.println("Enorabuena");
		}
		else
		{
			if ((matematicas>=5)&&(lengua<5))
			{
			System.out.println("Al menos aprobaste Matracas");
			}
			if ((matematicas<5)&&(lengua<5))
			{
			System.out.println("No has aprobado nada");
			}
		}
		
		//Punto2
		System.out.println("Forma 2");
		if (matematicas>5)
		{
			System.out.println("Aprobaste matemáticas");
		}
		else if (matematicas==5)
		{
			System.out.println("Aprobaste por los pelos");
		}
		else if (matematicas<5)
		{
			System.out.println("Has suspendido matemáticas");
		}
		
		//Punto3
		System.out.println("Forma 3");
		switch (matematicas)
		{
		case 10:
		case 9:System.out.println("Sobresaliente");
			break;
		case 8:
		case 7:System.out.println("Notable");
			break;
		case 6:System.out.println("Bien");
			break;
		case 5:System.out.println("Aprobado");
			break;
		default:System.out.println("Suspenso");
		}

	//End		
		
	}

}
