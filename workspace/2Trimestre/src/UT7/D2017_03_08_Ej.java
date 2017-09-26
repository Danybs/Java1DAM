package UT7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class D2017_03_08_Ej extends JFrame {
	JLabel e1, e2;
	JTextField c1, c2;
	JButton b1, b2;

	int edad() {
		String valor1 = c2.getText();
		int num1 = Integer.parseInt(valor1);
		int anio = 65 - num1;
		int dias = anio * 365;
		return dias;
	}

	D2017_03_08_Ej() {
		super("ej_2017_03_07");
		setLayout(new GridLayout(3, 2, 5, 5));
		e1 = new JLabel("Nombre y apellido 1");
		e2 = new JLabel("edad");
		c1 = new JTextField(20);
		c2 = new JTextField(2);
		b1 = new JButton("Comprobar");
		b2 = new JButton("edad");

		add(e1);
		add(c1);
		add(e2);
		add(c2);
		add(b1);
		add(b2);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int cat = c1.getText().indexOf(" ");
					System.out.println(cat);
					if (c1.getText().length() > 15) {
						JOptionPane.showMessageDialog(null, "Hola, te llamas: " + c1.getText().substring(0, cat)
								+ " y tu apellido es: " + c1.getText().substring(cat, c1.getText().length()));
					}
				} catch (Exception a) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Nombre incorrecto");
				}
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int numedad = edad();
					JOptionPane.showMessageDialog(null, "Dias para jubilarte: " + numedad);
				} catch (Exception edad) {
					JOptionPane.showMessageDialog(null, "Edad incorrecta");
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
				String valor = c2.getText();
				int numedad1 = Integer.parseInt(valor);
				numedad1++;
				String valor1 = String.valueOf(numedad1);
				c2.setText(valor1);
				JOptionPane.showMessageDialog(null, "Edad: " + numedad1);
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
				String condition;
				condition = JOptionPane.showInputDialog(null, "Eres hombre o mujer(h/m)");
				if (condition.equalsIgnoreCase("m") || condition.equalsIgnoreCase("mujer")) {
					JOptionPane.showMessageDialog(null, "Feliz dia de la mujer trabajadora");
				}
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
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_03_08_Ej app = new D2017_03_08_Ej();

	}

}
//			Forma 1 separar nombre y apyllido
/* 					StringTokenizer st = new StringTokenizer(c1.getText()," ",false);
					String nombre=st.nextToken();
					String apellido=st.nextToken();
					JOptionPane.showMessageDialog(null, "Hola "+nombre+" apellido"+apellido);
*/

//			Forma2
/*					String [] parts=c1.getText().split(" ");
					String nombre=parts[0];
					String apellido=parts[1];
					JOptionPane.showMessageDialog(null, "Hola "+nombre+" apellido"+apellido);
*/