package jdbc;

public class hh {

	public static void main(String[] args) {
		Manzana m = new Manzana("Golden", "Francia", 1.0f);
		Manzana m1 = new Manzana("Reineta", "Espa�a", 1.5f);
		clasesGen<Manzana> clase = new clasesGen<Manzana>();
		clase.a�adir(m);
		clase.a�adir(m1);
		for (Manzana ma : clase.lista) {
			ma.precioIva();
			ma.imprimir();
		}
		Peras p = new Peras("Golden", "Francia", 2.0F);
		Peras p1 = new Peras("Soto", "Espa�a", 2.5F);
		clasesGen<Peras> clase2 = new clasesGen<Peras>();
		clase2.a�adir(p);
		clase2.a�adir(p1);
		for (Peras pe : clase2.lista) {
			pe.precioIva();
			pe.imprimir();
		}

	}
}
