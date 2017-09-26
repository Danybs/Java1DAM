package UT7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class D2017_03_01_Ej1 extends JFrame{
	JComboBox cexcursion;
	JButton boton1;
	D2017_03_01_Ej1()
	{
		 super("Ejercicio 1- 1 marzo");
	     cexcursion=new JComboBox();
		 cexcursion.addItem("Senda del oso");
	     cexcursion.addItem("Ruta de las XANAS");
	     cexcursion.addItem("Ruta Hoces del Esva");
	     cexcursion.addItem("Ruta del cares");
	     add(cexcursion,BorderLayout.NORTH);
	
	     boton1=new JButton("Ver resultado");
	     add(boton1,BorderLayout.SOUTH);
	     
	     boton1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

	            String seleccionado=(String)cexcursion.getSelectedItem();
	            JOptionPane.showMessageDialog(null,"La ruta que elegiste es:"+seleccionado);
			}
	    	 
	     });
		 pack();
		 setLocationRelativeTo(null);
		 setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_03_01_Ej1 aplicacion=new D2017_03_01_Ej1();
	}
}