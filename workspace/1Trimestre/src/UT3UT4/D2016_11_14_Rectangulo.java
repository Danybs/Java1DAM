package UT3UT4;
	public class D2016_11_14_Rectangulo {
		int ancho;
		int alto;
	D2016_11_14_Rectangulo ()
		{ ancho=alto=0; }
	D2016_11_14_Rectangulo (int dato)
		{ ancho=alto=dato; }
	D2016_11_14_Rectangulo (int alto2,int ancho2)
		{ ancho=ancho2;
		alto=alto2;
		}
	D2016_11_14_Rectangulo (D2016_11_14_Rectangulo r)
		{  ancho=r.ancho;
		alto=r.alto;
		}
	int area()
	{
		return ancho*alto;
	}
public static void main(String[] args) {
	
	D2016_11_14_Rectangulo objeto1=new D2016_11_14_Rectangulo();
		System.out.println("Objeto1:"+objeto1.alto+" "+objeto1.ancho);
		System.out.println("Area rectangulo objeto1 es:"+objeto1.area());
	
	D2016_11_14_Rectangulo objeto2=new D2016_11_14_Rectangulo(4);
 		System.out.println("Objeto2:"+objeto2.alto+" "+objeto2.ancho);        
 		System.out.println("Area rectangulo objeto2 es:"+objeto2.area());
 	
 	D2016_11_14_Rectangulo objeto3=new D2016_11_14_Rectangulo(4,5);
 		System.out.println("Objeto3:"+objeto3.alto+" "+objeto3.ancho);        
 		System.out.println("Area rectangulo objeto3 es:"+objeto3.area());
 	
 	D2016_11_14_Rectangulo objeto4=new D2016_11_14_Rectangulo(objeto3);
 		System.out.println("Objeto4:"+objeto4.alto+" "+objeto4.ancho);        
 		System.out.println("Area rectangulo objeto4 es:"+objeto4.area());  
 	
	}   
}
