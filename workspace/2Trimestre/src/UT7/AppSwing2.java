package UT7;
import javax.swing.*;

//SIN HERENCIA

public class AppSwing2 {
	AppSwing2(){
	JFrame ventana=new JFrame("Titulo ventana");
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana
	JButton boton=new JButton("Pulsar"); //crea un boton
	ventana.getContentPane().add(boton); //añade boton al contenedor
	ventana.setSize(200, 100); //doy un tamaño ventana distinto al tamaño por defecto(pack)
	ventana.setLocationRelativeTo(null); //centra la ventana
	ventana.setVisible(true); //muestra la ventana
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppSwing2 aplication=new AppSwing2();
	}

}
