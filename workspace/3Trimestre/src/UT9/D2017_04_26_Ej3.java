package UT9;

class Precio {
	float euros;

	public void pone(float euros) {
		this.euros = euros;
	}

}

class Factura extends Precio {
	int cliente;
	final String emisor = "SAFIR SA";

	void imprimirFactura() {
		System.out.println(cliente + " " + emisor + " " + euros);
	}
}

public class D2017_04_26_Ej3 {
	public static void main(String[] args) {
		Factura f1 = new Factura();
		f1.cliente = 234;
		f1.pone(10400);
		f1.imprimirFactura();
	}
}
