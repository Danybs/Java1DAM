package UT7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//CON HERENCIA
public class AppEjemploHerencia extends JFrame implements ActionListener {
	JLabel texto1,texto2;
	JTextField camponombre;
	JButton boton;
	
	AppEjemploHerencia(){
		super("Ej4");
		setBounds(200,200,300,300);
		setVisible(true);
		
		Container contentpane=getContentPane();
		contentpane.setLayout(new FlowLayout());
		
		boton=new JButton("Comprueba");
		boton.addActionListener(this);
		texto1=new JLabel("Palabra: ");
		texto2=new JLabel("No se ingreso nada");
		camponombre=new JTextField(10);
		camponombre.addActionListener(this);
		
		contentpane.add(texto1);
		contentpane.add(camponombre);
		contentpane.add(boton);
		contentpane.add(texto2);
		
		pack();
		paintComponents(getGraphics());
				
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==camponombre || e.getSource()==boton)
			texto2.setText("Su nombre es: "+camponombre.getText());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppEjemploHerencia app=new AppEjemploHerencia();
	}

}