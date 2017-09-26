package UT7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class D2017_03_01_Ej2 extends JFrame {
	JComboBox opcion;
	JButton compra, total;
	JTextField diasrelleno;
	JLabel pelicula, dias;
	int totalc = 0;

	D2017_03_01_Ej2() {
		super("Ejercicio 2 01_03_2017");

		setLayout(new GridLayout(3, 2, 5, 5));

		pelicula = new JLabel("Pelicula");
		add(pelicula);

		opcion = new JComboBox();
		add(opcion);
		opcion.addItem("Ghost");
		opcion.addItem("Star Wars");
		opcion.addItem("El puente de los espias");
		opcion.addItem("Palmeras en la nieve");
		opcion.addItem("La la land");

		dias = new JLabel("Dias");
		add(dias);

		diasrelleno = new JTextField();
		add(diasrelleno);

		compra = new JButton("Añadir compra");
		add(compra);

		total = new JButton("Total");
		add(total);
		
		compra.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int numdias = Integer.parseInt(diasrelleno.getText());
				String seleccion = (String) opcion.getSelectedItem();
				if (seleccion.equalsIgnoreCase("Ghost")) {
					totalc = totalc + (1 * numdias);
				} else {
					totalc = totalc + (2 * numdias);
				}

			}
		});
		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"El precio a pagar por el alquiler de las peliculas es: " + totalc + "€");
			}
		});

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_03_01_Ej2 app = new D2017_03_01_Ej2();
	}

}
