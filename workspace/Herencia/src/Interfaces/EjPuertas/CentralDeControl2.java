package Interfaces.EjPuertas;

import java.util.Scanner;

public class CentralDeControl2 {
	static void control(Temporizador p) {
		p.timer();
		System.out.println(p.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuertaAutomatica p1 = new PuertaAutomatica(false, 1);
		PuertaManual p2 = new PuertaManual(false, 2);
		PuertaAutomatica p3 = new PuertaAutomatica(false, 3);
		VentanaAutomatica v1 = new VentanaAutomatica(false,4);
		System.out.println("Estado inicial");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(v1.toString());
		System.out.println("Modo automatico");
		Scanner teclado = new Scanner(System.in);
		int num, cont = 0;
		while (cont < 8) {
			System.out.println("Dime numero del 1 al 5: ");
			num = teclado.nextInt();
			if (num == p1.getN_Puerta()) {
				control(p1);
			}
			if (num == p2.getN_Puerta()){
				if(p2.isBloqueada()){
					p2.desbloquear();
				}
				else
					p2.bloquear();
			}
			if (num == p3.getN_Puerta()) {
				control(p3);
			}
			if (num == v1.getNumVentana()) {
				control(v1);
			}
			cont++;
			
		}
		System.out.println("\nEstado final:");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(v1.toString());
	}

}
