package jdbc;

import java.util.ArrayList;

public class clasesGen<G> {
	private G obj;
	ArrayList<G> lista=new ArrayList<G>();
	void añadir(G o){
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