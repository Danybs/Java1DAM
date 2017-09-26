package UT9;

import UT9.D2017_05_19_App.Saludo3;
import UT9.D2017_05_19_App.Saludo4;

public class D2017_05_19_Ej1_Todo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2017_05_19_App app1=new D2017_05_19_App();
		app1.init();
		D2017_05_19_Saludo1 s1=new D2017_05_19_Saludo1("Hola mundo clase externa desde main");
		s1.saludar();
		Saludo2 s2=new Saludo2("Hola mundo clase normal desde main");
		s2.saludar();
		
		D2017_05_19_App app2=new D2017_05_19_App();
		D2017_05_19_App.Saludo3 s3=app2.devolver3("Hola mundo clase interna desde main");
		s3.saludar();
		D2017_05_19_App.Saludo4 s4=app2.devolver4("Hola mundo clase interna desde main");
		s4.saludar();
		
		/*Saludo3 s3=new Saludo3("Hola mundo clase interna desde main");
		s3.saludar();
		Saludo4 s4=new Saludo4("Hola mundo clase interna desde main");
		s4.saludar();*/
	}
	
}

