package UT9;

class ClaseGenerica<T> {
	T obj;

	ClaseGenerica(T o) {
		obj = o;
	}

	public void classType() {
		System.out.println("El tipo de T es " + obj.getClass().getName());
	}
}

public class D2017_05_17_Ej1_Piloto{
	public static void main(String[] args) {
		ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
		intObj.classType();
		ClaseGenerica<String> strObj=new ClaseGenerica<String>("Test");
		strObj.classType();
	}
}
