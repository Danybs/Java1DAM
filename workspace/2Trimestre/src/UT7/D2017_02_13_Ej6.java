package UT7;
//SIN HERENCIA
//FORMA 2 Un actionperformer para todos
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class D2017_02_13_Ej6 implements ActionListener{
	JFrame ventana;
	JLabel word;
	JTextField txtbox;
	JButton buenosdias,buenastardes;
	
	D2017_02_13_Ej6(){
		
		ventana = new JFrame("Ej6");
		word = new JLabel("Nombre");
		txtbox = new JTextField();
		buenosdias = new JButton("Buenos dias");
		buenastardes = new JButton("Buenas tardes");
		
		ventana.setLayout(new GridLayout(4,1,0,0));
		
		ventana.getContentPane().add(word);
		ventana.getContentPane().add(txtbox);
		ventana.getContentPane().add(buenosdias);
		ventana.getContentPane().add(buenastardes);
		
		buenosdias.addActionListener(this);
		buenastardes.addActionListener(this);
		
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.pack(); //default size
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	//SOLO UN ACTION PERFORMER PARA TODOS LOS ELEMENTOS
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==buenosdias)
		 JOptionPane.showMessageDialog(null,"Buenos dias "+txtbox.getText());
		else
		 JOptionPane.showMessageDialog(null,"Buenos tardes "+txtbox.getText());
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_13_Ej6 app= new D2017_02_13_Ej6();
	}

}
