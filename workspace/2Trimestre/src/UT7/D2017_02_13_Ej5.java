package UT7;
//CON HERENCIA
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class D2017_02_13_Ej5 extends JFrame{
	JLabel DNI;
	JTextField cajatxt;
	JButton boton;
	Pattern pat=null;
	Matcher mat=null;
	
	
	D2017_02_13_Ej5(){
	DNI=new JLabel("DNI");
	cajatxt =new JTextField(10); 
	boton=new JButton("Comprueba DNI");
	
	setLayout(new GridLayout(3,1,0,0));
	add(DNI);
	add(cajatxt);
	add(boton);
	
	setVisible(true);
	setLocationRelativeTo(null);
	pack();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	boton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Introduce tu DNI (Formato 00000000-A):");
			pat=Pattern.compile("[0-9]{8}-[a-zA-Z]");
			mat=pat.matcher(cajatxt.getText());
			if(mat.find()){
			String sub=cajatxt.getText().substring(0, cajatxt.getText().length()-2);
			char letra=cajatxt.getText().charAt(cajatxt.getText().length()-1);
			System.out.println("DNI correcto. Numero: "+sub+" Letra: "+letra);
			}
			else
				System.out.println("incorrecto");
		}

	});
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_13_Ej5 app=new D2017_02_13_Ej5();
		
	}

}
