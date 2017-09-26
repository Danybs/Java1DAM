package UT7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class D2017_03_07_Ej2 extends JFrame {
	JButton b1;
	int num, opt;
	String valor;
	boolean check=false;

	D2017_03_07_Ej2() {
		super("D2017_03_07_Ej2");
		setLayout(new FlowLayout());

		b1 = new JButton("Pulsar");
		add(b1);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				valor = JOptionPane.showInputDialog(null, "Dime un número: ");
				if (valor != null) {
					
					opt = JOptionPane.showConfirmDialog(null, "Desea multiplicar el número por 2?: ");
					if (opt == JOptionPane.YES_OPTION) {
						check = true;
						JOptionPane.showMessageDialog(null, "El resultado es: " + Integer.parseInt(valor)*2);

					}
					if (opt == JOptionPane.CANCEL_OPTION) {
						check = false;
						JOptionPane.showMessageDialog(null, "El número es: " + num);
					}
				}
			}
		});
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				if (check == true)
					JOptionPane.showMessageDialog(null, "Multiplicaste");
				else
					JOptionPane.showMessageDialog(null, "No multiplicaste");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_03_07_Ej2 app = new D2017_03_07_Ej2();
	}

}
