package UT7;
import java.awt.*;

import javax.swing.*;

public class D2017_02_10_Ej3 extends JFrame {
	D2017_02_10_Ej3(){
	super("Ejemplo BorderLayout con herencia");
	setLayout(new BorderLayout());
	JButton boton=new JButton("1");
	add(boton,BorderLayout.EAST);
	JButton boton2=new JButton("2");
	add(boton2,BorderLayout.SOUTH);
	JButton boton3=new JButton("3");
	add(boton3,BorderLayout.WEST);
	JButton boton4=new JButton("4");
	add(boton4,BorderLayout.NORTH);
	JButton boton5=new JButton("5");
	add(boton5,BorderLayout.CENTER);
	
	setSize(200,200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_10_Ej3 app=new D2017_02_10_Ej3();
	}

}
