package Abstract;

public class Centralita {
	static int numLlamadas;
	static double impTotal;
	static void factura(Llamadas l){
		numLlamadas++;
		impTotal+=l.calcularPrecio();
		System.out.println(l.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Llamadas l1 = new Llamadas_locales("637932236", "637901411", 60);
		Llamadas l2 = new Llamadas_provinciales("637932236", "637901411", 60, 2);
		System.out.println("El importe es de: "+l1.calcularPrecio()+"€");
		System.out.println("El importe es de: "+l2.calcularPrecio()+"€");
		factura(l1);
		factura(l2);
		System.out.println("\nNumero de llamadas "+numLlamadas+
                " Importe total "+impTotal);
	}

}
