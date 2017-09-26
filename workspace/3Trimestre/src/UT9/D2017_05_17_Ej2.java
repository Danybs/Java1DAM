package UT9;

import java.util.ArrayList;

public class D2017_05_17_Ej2 {
	public static void main(String[] args) {
		Manzana m = new Manzana("Golden", "Francia", 1.0f);
		Manzana m1 = new Manzana("Reineta", "España", 1.5f);
		ClaseGenerica3<Manzana> clase = new ClaseGenerica3<Manzana>();
		clase.añadir(m);
		clase.añadir(m1);
		for (Manzana ma : clase.lista) {
			ma.precioIva();
			ma.imprimir();
		}
		Peras p=new Peras("Golden","Francia",2.0F);
		Peras p1=new Peras("Soto","España",2.5F);
		ClaseGenerica3<Peras> clase2=new ClaseGenerica3<Peras>();
		clase2.añadir(p);
		clase2.añadir(p1);
		for(Peras pe: clase2.lista){
			pe.precioIva();
			pe.imprimir();
		}
	}

}

class ClaseGenerica3<G> {
	G obj;
	ArrayList<G> lista = new ArrayList<G>();

	void añadir(G o) {
		lista.add(o);
	}
}

class Manzana {
	String categoria;
	String zona;
	double precio;

	/**
	 * @param categoria
	 * @param zona
	 * @param precio
	 */
	public Manzana(String categoria, String zona, double precio) {
		this.categoria = categoria;
		this.zona = zona;
		this.precio = precio;
	}

	void precioIva() {
		if (zona.equalsIgnoreCase("españa")) {
			setPrecio(getPrecio() * 1.10F);
		}
		if (zona.equalsIgnoreCase("francia")) {
			setPrecio(getPrecio() * 1.20F);
		}
	}

	void imprimir() {
		System.out.println("Categoria: " + getCategoria() + " Zona: " + getZona() + " Precio: " + getPrecio());
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}

class Peras {
	String categoria;
	String zona;
	double precio;

	/**
	 * @param categoria
	 * @param zona
	 * @param precio
	 */
	public Peras(String categoria, String zona, double precio) {
		super();
		this.categoria = categoria;
		this.zona = zona;
		this.precio = precio;
	}

	void precioIva() {
		if (zona.equalsIgnoreCase("españa")) {
			setPrecio(getPrecio() * 1.20F);
		}
		if (zona.equalsIgnoreCase("francia")) {
			setPrecio(getPrecio() * 1.30F);
		}
	}

	void imprimir() {
		System.out.println("Categoria: " + getCategoria() + " Zona: " + getZona() + " Precio: " + getPrecio());
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
