package UT7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class D2017_03_06_ej2 extends JFrame {
	JButton b1, b2;
	int num1;
	D2017_03_06_ej2() {
		super("D2017_03_06_ej2");
		setLayout(new FlowLayout());
		b1 = new JButton("Dime numero");
		add(b1);
		b2 = new JButton("Pregunta");
		add(b2);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String num = JOptionPane.showInputDialog("Dime un numero: ");
				num1 = Integer.parseInt(num);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = JOptionPane.showConfirmDialog(null, "¿Quieres calcular la raíz cuadrada del número?");
				if (a == JOptionPane.YES_OPTION) {
					System.out.println(Math.sqrt(num1));
				}
			}
		});

		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_03_06_ej2 app = new D2017_03_06_ej2();
	}

}
