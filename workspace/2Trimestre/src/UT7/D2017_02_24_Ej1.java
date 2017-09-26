package UT7;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class D2017_02_24_Ej1 extends JFrame implements ActionListener {
	JButton j1, j2, j3, j4;
	JPanel panel1;

	D2017_02_24_Ej1() {
		super("Ej1 24_02_2017");
		
		setLayout(new BorderLayout());
		
		panel1 = new JPanel();
		getContentPane().add(panel1, BorderLayout.SOUTH);
		panel1.setLayout(new GridLayout(2,2,5,5));
		
		j1 = new JButton("1");
		j2 = new JButton("2");
		j3 = new JButton("3");
		j4 = new JButton("4");
		
		panel1.add(j1);
		panel1.add(j2);
		panel1.add(j3);
		panel1.add(j4);

		j1.addActionListener(this);
		j1.setActionCommand("boton1");
		j2.addActionListener(this);
		j2.setActionCommand("boton2");
		j3.addActionListener(this);
		j3.setActionCommand("boton3");
		j4.addActionListener(this);
		j4.setActionCommand("boton4");
		
		setVisible(true);
		setLocationRelativeTo(null);
		pack(); // default size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_24_Ej1 app=new D2017_02_24_Ej1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("boton1".equals(e.getActionCommand()))
			System.out.println("Boton1");
		else if ("boton2".equals(e.getActionCommand()))
			System.out.println("Boton2");
		else if ("boton3".equals(e.getActionCommand()))
			System.out.println("Boton3");
		else if ("boton4".equals(e.getActionCommand()))
			System.out.println("Boton4");
	}

}
