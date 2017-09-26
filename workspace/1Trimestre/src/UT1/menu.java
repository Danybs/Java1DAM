package UT1;
import java.util.*;
public class menu {
	static int n1,n2,tecladon,res,numerofijo=2;
	static void tecladon (){
		tecladon=new Scanner(System.in).nextInt();
	}
static void menus(){
	System.out.println("Elige una opción");
	System.out.println("1-suma");
	System.out.println("2-resta");
	System.out.println("3-multiplicación x2");
	System.out.println("4-división");
	System.out.println("5-salir");
	tecladon();
	switch (tecladon){
	case 1:
		suma();
		break;
	case 2:
		resta();
		break;
	case 3: 
		mult();
		break;
	case 4:
		div();
	case 5:
		break;
	default:
		System.out.println("Ustes no has escrito un numero de la lista");
		menus();
	}
	
}
static void suma (){
	System.out.println("Se necesitan dos numeros para realizar la suma");
	System.out.println("Inserte el primer numero");
	tecladon();
	n1=tecladon;
	System.out.println("Inserte el segundo numero");
	tecladon();
	n2=tecladon;
	res=n1+n2;
	System.out.println("El resultado de la suma es "+res);
	pregunta();
}
static void resta (){
	System.out.println("Se necesitan dos numeros para realizar la resta");
	System.out.println("Inserte el primer numero");
	tecladon();
	n1=tecladon;
	System.out.println("Inserte el segundo numero");
	tecladon();
	n2=tecladon;
	if (n1>n2) res=n1-n2;
	else res=n2-n1;
	System.out.println("El resultado de la suma es "+res);
	pregunta();
}
static void mult (){
	System.out.println("Se necesitan un numero para realizar la multiplicación x2");
	System.out.println("Inserte el numero");
	tecladon();
	n1=tecladon;
	res=n1*numerofijo;
	System.out.println("El resultado de la multiplicacion es "+res);
	pregunta();
}
static void div (){
	System.out.println("Se necesitan dos numeros para realizar la division");
	System.out.println("Inserte el primer numero");
	tecladon();
	n1=tecladon;
	System.out.println("Inserte el segundo numero");
	tecladon();
	n2=tecladon;
	try{
	if (n1>n2) {res=n1/n2;
	System.out.println("El resultado de la division es "+res);
	pregunta();
	}
	else {res=n2/n1;
	System.out.println("El resultado de la division es "+res);
	pregunta();
	}
}
	catch (Exception e){
		System.out.println("No se puede realizar una división entre 0, vuelve a intentarlo");
		pregunta();
	}
}
static void pregunta (){
	System.out.println("Quiere realizar otra operacion? (1-si // 2-no)");
	tecladon();
	switch (tecladon){
	case 1:
		menus();
	case 2:
		break;
	default:
		System.out.println("Usted no ha escrito un numero de la lista, vuelve a intentarlo");
		pregunta();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menus();
		System.out.println("Adios!");
	}

}
