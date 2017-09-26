package UT7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//CON HERENCIA
public class D2017_02_13_Ej4 extends JFrame {
	JLabel texto;
	JTextField camponombre;
	JButton boton;
	String text="admin";

	D2017_02_13_Ej4() {
		super("Ej4");
		
		setLayout(new GridLayout(3, 1, 0, 0));
		texto = new JLabel("Palabra: ");
		camponombre = new JTextField(10);
		boton = new JButton("Comprueba");

		add(texto);
		add(camponombre);
		add(boton);

		setVisible(true);
		setLocationRelativeTo(null);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (camponombre.getText().equals(text)) {
					System.out.println("correcto");
				}
				else
					System.out.println("incorrecto");
			}

		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_13_Ej4 app = new D2017_02_13_Ej4();

	}

}
