package UT7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class D2017_03_03_Ej1 extends JFrame implements ActionListener {
	JButton boton;

	D2017_03_03_Ej1() {
		super("Ej1 3 marzo");
		setLayout(new FlowLayout());
		JLabel etiqueta = new JLabel("numero");
		add(etiqueta);
		boton = new JButton("preguntar");
		add(boton);

		boton.addActionListener(this);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_03_03_Ej1 aplicacion = new D2017_03_03_Ej1();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == boton) {
			String valor = JOptionPane.showInputDialog(null, "Dime numero a multiplicar por 2", JOptionPane.OK_CANCEL_OPTION);
			
			if (!(valor==null))
			{
			int numero = Integer.parseInt(valor);
			JOptionPane.showMessageDialog(null, numero * 2);
		    }
		}

	}

}
