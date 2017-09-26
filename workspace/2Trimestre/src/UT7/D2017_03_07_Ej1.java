package UT7;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class D2017_03_07_Ej1 {
	JLabel etiqueta;
	D2017_03_07_Ej1()
	{
		JFrame ventana=new JFrame();
	    etiqueta=new JLabel("1");  //inicialmente etiqueta a 1
	    ventana.getContentPane().add(etiqueta);
	    
		ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
        ventana.addWindowListener(new WindowAdapter(){ //añado Listener de ventana
            public void windowIconified(WindowEvent e) //metodo cuando minimizo
            {
                etiqueta.setText("2"); //cuando minimizo cambio etiqueta a 2
            }
            });
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_03_07_Ej1 aplicacion=new D2017_03_07_Ej1();
	}

}