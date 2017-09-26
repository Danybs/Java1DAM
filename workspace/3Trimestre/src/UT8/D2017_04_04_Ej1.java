package UT8;

import java.util.HashSet;

public class D2017_04_04_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet conjunto=new HashSet();
        if (!conjunto.contains(1))
        	conjunto.add(1);
        if (!conjunto.contains(2))
        	conjunto.add(2);
        if (!conjunto.contains(1))
        	conjunto.add(1);
        for (Object valor :conjunto)
        	System.out.println((Integer)valor);
	}

}
