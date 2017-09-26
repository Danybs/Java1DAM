package UT8;

import java.util.HashSet;
import java.util.Iterator;
class Producto {
	Producto(String nombre,int cantidad){
		this.nombre=nombre;
		this.cantidad=cantidad;
	}
	public String nombre;
	public int cantidad;
	public String getNombre() {
		return nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	public boolean equals(Producto objeto){
		if(this.getNombre().equalsIgnoreCase(objeto.getNombre())){
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
public class D2017_04_19_Ej1 {
	static HashSet<Producto> Productos = new HashSet();
	
	 public static boolean existe(Producto miproducto)
	    {
	       for (Producto pro: Productos)
	       {
	           if (pro.equals(miproducto))
	               return true;
	       }
	       return false;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pr1 = new Producto("Pan", 6);
		Producto pr2 = new Producto("Leche", 2);
		Producto pr3 = new Producto("Manzanas", 5);
		Producto pr4 = new Producto("Brocoli", 2);
		Producto pr5 = new Producto("Carne", 2);
		Producto pr6 = new Producto("Carne", 3);
		
		
		/*
		if (!Productos.contains(pr1)) {
			Productos.add(pr1);
		}
		if (!Productos.contains(pr2)) {
			Productos.add(pr2);
		}
		if (!Productos.contains(pr3)) {
			Productos.add(pr3);
		}
		if (!Productos.contains(pr4)) {
			Productos.add(pr4);
		}
		if (!Productos.contains(pr5)) {
			Productos.add(pr5);
		}
		if (!Productos.contains(pr6)) {
			Productos.add(pr6);
		}*/
		if(!existe(pr1)){
			Productos.add(pr1);
		}
		if(!existe(pr2)){
			Productos.add(pr2);
		}
		if(!existe(pr3)){
			Productos.add(pr3);
		}
		if(!existe(pr4)){
			Productos.add(pr4);
		}
		if(!existe(pr5)){
			Productos.add(pr5);
		}
		if(!existe(pr6)){
			Productos.add(pr6);
		}
		
		System.out.println("Tamaño: " + Productos.size());
		Iterator<Producto> imp = Productos.iterator();
		System.out.println();
		while (imp.hasNext()) {
			Producto value = imp.next();
			System.out.println("Producto: " + value.getNombre() + " Precio: " + value.getCantidad());
		}
		System.out.println();
		for (Producto producto : Productos) {
			System.out.println("Producto: " + producto.getNombre() + " Precio: " + producto.getCantidad());
		}
		Iterator<Producto> imp2 = Productos.iterator();
		while (imp2.hasNext()) {
		    Producto p2= imp2.next();	
			if (p2.getNombre().equals("Manzanas")) {
			    imp2.remove();  
			}
		}
		System.out.println();
		for (Producto producto : Productos) {
			System.out.println("Producto: " + producto.getNombre() + " Precio: " + producto.getCantidad());
		}
		// Borrando todos los productos
		Productos.removeAll(Productos);
		System.out.println("imprimiendo todo despues del borrado");
		for (Producto producto : Productos) {
			System.out.println("Producto: " + producto.getNombre() + " Precio: " + producto.getCantidad());
		}
		
	}
}



