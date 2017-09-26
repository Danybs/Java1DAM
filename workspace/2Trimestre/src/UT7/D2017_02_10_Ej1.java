package UT7;
import javax.swing.*;
//SIN HERENCIA
public class D2017_02_10_Ej1 {
	D2017_02_10_Ej1(){
		JFrame ventana=new JFrame("Titulo ventana");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel etiqueta=new JLabel("Introduce numero");
		ventana.getContentPane().add(etiqueta);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_10_Ej1 objeto=new D2017_02_10_Ej1();
	}

}
