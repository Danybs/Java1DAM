package examen2T;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ejercicio2 extends JFrame implements ActionListener{
	 JComboBox combo;
	 JLabel eti1,eti2;
	 JTextField campo1,campo2;
	 JButton boton1,boton2;
	 JPanel panel;
	 String[] lista;
	 int contador=0;
     ejercicio2()
     {
	   super("ejercicio2");
	   setLayout(new BorderLayout());
	   combo=new JComboBox();
	   combo.addItem("Fernandez");
	   combo.addItem("Gutierrez");
	   combo.addItem("Sanchez");
	   combo.addItem("Iglesias");
	   add(combo,BorderLayout.NORTH);
	   
	   panel=new JPanel();
	   panel.setLayout(new GridLayout(3,2,5,5));
	   add(panel,BorderLayout.SOUTH);
	   
	   eti1=new JLabel("nombre");
	   panel.add(eti1);
	   campo1=new JTextField(15);
	   panel.add(campo1);
	   eti2=new JLabel("apellido");
       panel.add(eti2);
	   campo2=new JTextField(15);
	   panel.add(campo2);
	   boton1=new JButton("Añadir");
	   panel.add(boton1);
	   boton2=new JButton("Imprimir");
	   panel.add(boton2);
	  
	   lista=new String[5];
	   boton1.addActionListener(this);
	   boton2.addActionListener(this);
	   
	   addWindowListener(new WindowAdapter(){ //añado Listener de ventana
           public void windowClosing(WindowEvent e) //metodo cuando minimizo
           {
        	   String pos=JOptionPane.showInputDialog(null,"Dime numero",JOptionPane.OK_CANCEL_OPTION);
       		   int vpos=Integer.parseInt(pos);
       		   if (vpos<=contador)
       		   {
       		     int resultado=JOptionPane.showConfirmDialog(null, "¿Es judio?");
                 if (resultado==JOptionPane.OK_OPTION)
                 {
            	   if (lista[vpos].endsWith("z"))
            	   {
            		   JOptionPane.showMessageDialog(null, "es apellido judio");
            	   }
                 }
       		   }
       		   else JOptionPane.showMessageDialog(null, "posicion incorrecta");
           }
           });
	   setSize(300,300);
   	   setLocationRelativeTo(null); //centrada
   	   setVisible(true);  //visible
   	   setDefaultCloseOperation(EXIT_ON_CLOSE); //cierre aplicacion
     }
	public static void main(String args[])
	{
		ejercicio2 aplicacion=new ejercicio2();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==boton1)
		{
			String vcombo=(String)combo.getSelectedItem();
			if (!campo2.getText().equals(vcombo) && (contador<5))
			{
				lista[contador]=campo1.getText()+campo2.getText();
				contador++;
			}
			else JOptionPane.showMessageDialog(null, "lista ya esta llena");
		}
		else if (arg0.getSource()==boton2)
		{
		    for (int i=lista.length-1;i>=0;i--)
		    {
		    	if (lista[i]!=null)
		    		System.out.println(lista[i]);
		    }
		}
	}

}
