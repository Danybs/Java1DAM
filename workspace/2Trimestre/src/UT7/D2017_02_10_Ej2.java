package UT7;
import java.awt.*;

import javax.swing.*;
//CON HERENCIA
public class D2017_02_10_Ej2 extends JFrame{
	D2017_02_10_Ej2(){
		super("Ejemplo FlowLayout con herencia");
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		for(int i=1; i<11; i++){
		JButton boton=new JButton("Componente "+i);
		add(boton);
		}
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_10_Ej2 app=new D2017_02_10_Ej2();
	}

}
