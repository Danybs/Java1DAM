package UT7;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class D2017_03_03_Ej2 extends JFrame {
	JTextField nombretxt, DNItxt;
	JLabel nombre, DNI;
	JButton preguntar;
	JPanel panel1, panel2;

	D2017_03_03_Ej2() {
		super("D2017_03_03_Ej2");
		setLayout(new GridLayout(2, 1, 5, 5));

		nombretxt = new JTextField(5);
		nombre = new JLabel("Nombre");
		DNItxt = new JTextField(5);
		DNI = new JLabel("Numero DNI");
		preguntar = new JButton("Preguntar");

		panel1 = new JPanel();
		add(panel1);
		panel1.setLayout(new GridLayout(2, 2, 5, 5));
		panel1.add(nombre);
		panel1.add(nombretxt);
		panel1.add(DNI);
		panel1.add(DNItxt);

		panel2 = new JPanel();
		add(panel2);
		panel2.setLayout(new FlowLayout());
		panel2.add(preguntar);

		preguntar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String valor = JOptionPane.showInputDialog("Dime nombre");
				if (valor.equalsIgnoreCase(nombretxt.getText())) {
					String valor1 = JOptionPane.showInputDialog("Dime letra DNI");
					JOptionPane.showMessageDialog(null,
							nombretxt.getText() + " tu DNI es: " + DNItxt.getText() + valor1);
				} else {
					JOptionPane.showMessageDialog(null, "error");
					System.exit(0); // cierra el programa
				}

			}
		});

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_03_03_Ej2 app = new D2017_03_03_Ej2();
	}

}
