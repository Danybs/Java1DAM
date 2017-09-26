package UT9;

public class D2017_05_19_App {
	D2017_05_19_App(){
		
	}
	class Saludo3{
		String saludo;

		/**
		 * @param saludo
		 */
		public Saludo3(String saludo) {
			this.saludo = saludo;
		}
		void saludar(){
			System.out.println(saludo);
		}	
	}
	class Saludo4 implements D2017_05_19_Saludador{
		String saludo;

		/**
		 * @param saludo
		 */
		public Saludo4(String saludo) {
			this.saludo = saludo;
		}
		public void saludar(){
			System.out.println(saludo);
		}
		
	}
	public void init(){
		D2017_05_19_Saludo1 s1=new D2017_05_19_Saludo1("Hola mundo clase externa desde App");
		s1.saludar();
		Saludo2 s2=new Saludo2("Hola mundo clase normal desde App");
		s2.saludar();
		Saludo3 s3=new Saludo3("Hola mundo clase interna desde App");
		s3.saludar();
		Saludo4 s4=new Saludo4("Hola mundo clase interface desde App");
		s4.saludar();
		/*Saludo4 s41=new Saludo4("Hola mundo clase anonima desde App"){
			public void saludar(){
				System.out.println(saludo);
			}			
		};
		s41.saludar();*/
		Saludo4 s41=new Saludo4(null){
			public void saludar(){
				System.out.println("Hola mundo clase anonima desde App");
			}			
		};
		s41.saludar();
	
	D2017_05_19_Saludador s5=new D2017_05_19_Saludador(){
		public void saludar(){
			System.out.println("Hola mundo interface anonima desde App");
		}
	};
	s5.saludar();
	}
	
	public Saludo3 devolver3(String saludo)
	{
		return new Saludo3(saludo);
	}
	public Saludo4 devolver4(String saludo)
	{
		return new Saludo4(saludo);
	}
}
class Saludo2 {
	String saludo;

	/**
	 * @param saludo
	 */
	public Saludo2(String saludo) {
		this.saludo = saludo;
	}
	void saludar(){
		System.out.println(saludo);
	}	
};
