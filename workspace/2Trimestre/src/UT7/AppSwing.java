package UT7;

import javax.swing.*;

//CON HERENCIA

public class AppSwing extends JFrame {
	AppSwing(){
		super("titulo ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana
		JButton boton=new JButton("Pulsar"); //crea un boton
		add(boton);	//añade boton al contenedor
		pack();
		setLocationRelativeTo(null); //centra la ventana
		setVisible(true); //muestra la ventana
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppSwing aplicacion=new AppSwing();
	}

}
