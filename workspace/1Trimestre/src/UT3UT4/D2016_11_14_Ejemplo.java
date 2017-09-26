package UT3UT4;

public class D2016_11_14_Ejemplo {


		String grupo; //atributo grupo de la clase ejemplo
		public String getGrupo () {  //getter
		return grupo;
		}
		public void setGrupo (String grupo) { //setter
		this.grupo = grupo; // el primer grupo hace referencia al atributo
		}   // el 2º grupo hace referencia al parámetro
		D2016_11_14_Ejemplo() {
			this.grupo="A1";
		  }
		D2016_11_14_Ejemplo(String grupo) {
			this.grupo=grupo;
		  }
		public static void main(String args[])
		{
			D2016_11_14_Ejemplo objeto1=new D2016_11_14_Ejemplo();
			System.out.println(objeto1.getGrupo()); //imprime A1
			objeto1.setGrupo("A2");
			System.out.println(objeto1.getGrupo()); //imprime A2
			
			D2016_11_14_Ejemplo objeto2=new D2016_11_14_Ejemplo("B1");
			System.out.println(objeto2.getGrupo());  //imprime B1
			objeto2.setGrupo("B2");
			System.out.println(objeto2.getGrupo()); //imprime B2
				
			
   }
}
