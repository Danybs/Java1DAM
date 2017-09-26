package UT6;

import java.io.IOException;

/* SE IRAN TECLANDO CARACTERES(TANTO NUMEROS COMO LETRAS
 * POR LA ENTRADA ESTANDAR Y PARARA CUANDO SE TECLEE EL CARACTER '0'.
 * EL PROGRAMA HARA LA MEDIA DE LOS CARACTERES NUMÉRICOS TECLEADOS
 * NO DE LAS LETRAS Y SE IMPRIMIRA LA MEDIA
 * H4M80 RES=6
 */
public class D2017_01_09_ej2 {
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c;
		int contador=0;
		int suma=0;
		float res;
		while ((c=System.in.read())!='0')
		{
			System.out.println((char)c);
			//if(Character.isDigit(c)) tb sirve
			if((c>='0')&&(c<='9')){ // si el caracter es un digito
				int num=c-48;
				suma=suma+num;
				contador++;
			}
		}
		res=suma/contador;
		System.out.println();
		System.out.println("La media es"+res);	
		
		
	}

}
