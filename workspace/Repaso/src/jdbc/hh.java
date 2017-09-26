package jdbc;

public class hh {

	public static void main(String[] args) {
		Manzana m = new Manzana("Golden", "Francia", 1.0f);
		Manzana m1 = new Manzana("Reineta", "España", 1.5f);
		clasesGen<Manzana> clase = new clasesGen<Manzana>();
		clase.añadir(m);
		clase.añadir(m1);
		for (Manzana ma : clase.lista) {
			ma.precioIva();
			ma.imprimir();
		}
		Peras p = new Peras("Golden", "Francia", 2.0F);
		Peras p1 = new Peras("Soto", "España", 2.5F);
		clasesGen<Peras> clase2 = new clasesGen<Peras>();
		clase2.añadir(p);
		clase2.añadir(p1);
		for (Peras pe : clase2.lista) {
			pe.precioIva();
			pe.imprimir();
		}

	}
}
