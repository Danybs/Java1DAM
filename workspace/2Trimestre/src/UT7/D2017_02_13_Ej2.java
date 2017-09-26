package UT7;
import java.awt.*;
import javax.swing.*;

//sin herencia
public class D2017_02_13_Ej2{
	D2017_02_13_Ej2(){
		JFrame ventana=new JFrame();
		ventana.setLayout(new GridLayout(4,3,5,5));
		for(int i=1; i<11; i++){
		ventana.add(new JButton(Integer.toString(i)));
		}
		ventana.setVisible(true);
		//pack(); <-- Tama�o por defecto 
		ventana.setSize(200,200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_02_13_Ej2 app=new D2017_02_13_Ej2();
	}

}