package UT7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class D2017_02_22_Ej1 extends JFrame{
	JButton hola,adios;
	
	D2017_02_22_Ej1(){
	super("Ej1");
	setLayout(new BorderLayout());
	
	hola=new JButton("di hola");
	adios=new JButton("di adios");
	
	getContentPane().add(hola,BorderLayout.NORTH);
	getContentPane().add(adios, BorderLayout.SOUTH);
	
	hola.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 JOptionPane.showMessageDialog(null,"hola");
		}
	});
	
	adios.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null,"adios");
		}
	});
	
	setVisible(true);
	setLocationRelativeTo(null);
	pack(); //default size
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_22_Ej1 app=new D2017_02_22_Ej1();
	}

}
