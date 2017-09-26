package UT7;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Ejemplo
 * @author maite
 * @version 1.0
 *
 */
public class D2017_02_22_Ej2 {

	D2017_02_22_Ej2()
	{
		JFrame ventana=new JFrame("Ejemplo paneles");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new GridLayout(2,1,5,5));
		JPanel panel1=new JPanel();
		ventana.getContentPane().add(panel1);
		JPanel panel2=new JPanel();
		ventana.getContentPane().add(panel2);
		
		panel1.setLayout(new FlowLayout());
		JLabel etiqueta=new JLabel("Numero");
		panel1.add(etiqueta);
		JTextField campo=new JTextField("0");
		panel1.add(campo);
		
		panel2.setLayout(new FlowLayout());
		JButton boton=new JButton("Doble");
		panel2.add(boton);
				
		boton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				int numero=Integer.parseInt(campo.getText());
			    JOptionPane.showMessageDialog(null, "El doble del numero"+numero+"es:"+numero *2);	
			}
			
		});
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_22_Ej2 aplicacion=new D2017_02_22_Ej2();
	}

}

