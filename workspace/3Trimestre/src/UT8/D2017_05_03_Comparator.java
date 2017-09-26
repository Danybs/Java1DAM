package UT8;

import java.util.Comparator;

public class D2017_05_03_Comparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		String v1=o1.getNombre();
		String v2=o2.getNombre();
		return v1.compareToIgnoreCase(v2);
	}
}
