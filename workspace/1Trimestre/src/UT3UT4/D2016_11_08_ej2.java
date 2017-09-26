package UT3UT4;

	public class D2016_11_08_ej2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	  		 Character cx=new Character('x');
		     Character c$=new Character('$');
		     int codigo;
		     
		     
		     //Parte ejecutiva
		     codigo=cx.charValue();   
		     System.out.println("\n Codigo de x="+ codigo);
		     if (Character.isUpperCase(cx.charValue()))
		    	 System.out.println("El caracter "+cx+" es mayuscula");
		     else
		    	 System.out.println("El caracter "+cx+" es minuscula");
		     
		     codigo=c$.charValue();
		     System.out.println("Codigo de $=" +codigo);
		     
		     if (Character.isUpperCase(c$.charValue()))
		    	 System.out.println("El caracter "+c$+" es mayuscula");
		     else
		    	 System.out.println("El caracter "+c$+" es minuscula");
		     
		     if (cx.equals(c$))
		    	 System.out.println("Los caracteres "+cx+" y "+c$+" son iguales");
		     else
		    	 System.out.println("Los caracteres "+cx+" y "+c$+" son distintos");
		     
		     System.out.println("Los caracteres son "+cx.toString()+" y "+c$.toString());

		//parte valores maximos y minimos
		     System.out.println("Byte maximo es:"+Byte.MAX_VALUE+ " y el minimo es:"+Byte.MIN_VALUE);
		     System.out.println("Integer maximo es:"+Integer.MAX_VALUE+ " y el minimo es:"+Integer.MIN_VALUE);
		     System.out.println("Float maximo es:"+Float.MAX_VALUE+ " y el minimo es:"+Float.MIN_VALUE);
		     System.out.println("Double maximo es:"+Double.MAX_VALUE+ " y el minimo es:"+Double.MIN_VALUE);

		}

	}
