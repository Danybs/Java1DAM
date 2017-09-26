package herencia;

public class PracticaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titular titular1;
		titular1=new Titular("Daniel","Blanco Sanz",24);
		Cuenta ctaTitular1=new Cuenta(titular1,"654");
		ctaTitular1.ingresar(700);
		ctaTitular1.reintegro(200);
		System.out.println(ctaTitular1);
		System.out.println();
		CuentaAhorro cA1=new CuentaAhorro(titular1,"456");
		cA1.ingresar(1000);
		System.out.println(cA1);
		System.out.println("Intereses de: "+cA1.calcularInteres());
		System.out.println(cA1);
		
	}

}
