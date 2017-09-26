package UT7;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class D2017_03_06_Ej1 extends JFrame{
	Scanner teclado;
	D2017_03_06_Ej1()
	{
		teclado=new Scanner(System.in);
		System.out.println("Dime numero");
		int numero=teclado.nextInt();
        int resultado=JOptionPane.showConfirmDialog(null, "¿Desea multiplicarlo por 2?");
        if (resultado==JOptionPane.OK_OPTION)
            System.out.println(numero+" *2="+numero*2);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
		System.exit(0);
	}
    public static void main(String args[])
    {
    	D2017_03_06_Ej1 aplicacion=new D2017_03_06_Ej1();
    }
}