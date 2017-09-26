package UT7;


import javax.swing.*;
import java.awt.event.*;

//SIN HERENCIA
public class D2017_02_13_Ej3 {
	D2017_02_13_Ej3(){
	JFrame ventana=new JFrame();
	JButton boton=new JButton("Pulsa");
	
	ventana.getContentPane().add(boton);
	ventana.setVisible(true);
	ventana.pack();//tamaño por defecto
	ventana.setLocationRelativeTo(null);//centrado
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	boton.addActionListener(new ActionListener(){ //a�ado Listener Componente a Componente
		public void actionPerformed(ActionEvent e)
		{
		System.out.println("Has pulsado");
		}
		});;
	
	
	//Acciones segun el raton
/*	boton.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has pulsado");
		}
	});
	*/
		
		//Nueva ventana
		//JFrame frame=new JFrame();
/*	boton.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent e){
		JFrame show=new JFrame("Has pulsado");
		show.setVisible(true);
		show.setSize(200,100);
		show.setLocationRelativeTo(null);
		show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	});
	*/
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_13_Ej3 app=new D2017_02_13_Ej3();
	}

}
