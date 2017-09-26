package UT8;

import java.util.StringTokenizer;

public class D2017_02_03_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("Ronaldo=Fútbol;Gasol=Baloncesto;", ";", false);
		System.out.println("Hay un total de: " + st.countTokens() + " tokens.");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
