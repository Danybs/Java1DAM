package UT6;

import java.io.IOException;

/*EL EJERCICIO VA A IR LEYENDO CARACTERES POR TECLADO
 * E IMPRIMIENDOLOS HASTA QUE SE PULSE LA TECLA INTRO '\N'
 * EN ESTE MOMENTO ESCRIBLE EL TOTAL DE CARACTERES TECLEADOS
 */
public class D2017_01_09_ej1 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c; //caracter que voy a leer tras teclearlo
		int contador=0; //total caracteres  tecleados
		/*System.in-es la entrada estandar
		 * con ficheros necesito capturar la excepcion IO
		 * para ello añadi la clausula throws al main
		 * tambien podia haber metido el codigo dentro de un try
		 */
		while ((c=System.in.read())!='\n')
		{
			contador++;
			System.out.println((char)c);
		}
		System.out.println();
		System.out.println("Caracteres contados:"+contador);
	}

}

