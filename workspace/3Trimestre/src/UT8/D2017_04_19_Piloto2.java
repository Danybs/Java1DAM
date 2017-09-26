package UT8;

import java.util.ArrayList;

public class D2017_04_19_Piloto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<D2017_04_19_Piloto1> arrayalumnos = new ArrayList();
		D2017_04_19_Piloto1 a1 = new D2017_04_19_Piloto1("Pedro", 21);
		D2017_04_19_Piloto1 a2 = new D2017_04_19_Piloto1("Sara", 24);
		D2017_04_19_Piloto1 a3 = new D2017_04_19_Piloto1("Juan", 28);
		arrayalumnos.add(a1);
		arrayalumnos.add(a2);
		arrayalumnos.add(a3);
		for (D2017_04_19_Piloto1 alum : arrayalumnos)
			System.out.println("Nombre " + alum.nombre + " edad " + alum.edad);
	}

}
