package UT7;
import java.awt.*;

//CON HERENCIA
import javax.swing.*;

public class D2017_02_13_Ej1 extends JFrame {
	D2017_02_13_Ej1(){
		JFrame ventana=new JFrame();
		setLayout(new GridLayout(4,3,5,5));
		for(int i=1; i<11; i++){
		add(new JButton(Integer.toString(i)));
		}
		setVisible(true);
		//pack(); <-- Tamaño por defecto 
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_13_Ej1 app=new D2017_02_13_Ej1();
	}

}
