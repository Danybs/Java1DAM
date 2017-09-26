package UT5;
public class D2016_12_14_ej2Examen {
    int largo,ancho;
    char relleno;
    public void setLargo(int largo) {
		this.largo = largo;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public void setRelleno(char relleno) {
		this.relleno = relleno;
	}
	D2016_12_14_ej2Examen()
    {
    	largo=ancho=0; relleno='n';
    }
    D2016_12_14_ej2Examen(int largo,int ancho,char relleno)
    {
    	this.largo=largo;this.ancho=ancho;this.relleno=relleno;
    }
    void dibujarrectangulo()
    {
    	if (relleno=='s') //relleno con todos asteriscos
    	{
    		for (int i=1;i<=largo;i++) //filas
    		{
    			for (int j=1;j<=ancho;j++) //columnas
    				System.out.print("* ");
    			System.out.println("");
    		}		
    	}
    	else
    	{
    		for (int i=1;i<=ancho;i++)  //dibujo fila arriba
    			System.out.print("* ");
    		System.out.println("");
    		
    		for (int i=2;i<=largo-1;i++) //relleno
    		{
    			System.out.print("* ");  //1º asterisco fila
    		    for (int j=2;j<=ancho-1;j++) //espacios blancos
    		    	System.out.print("  ");
    		    System.out.println("* ");  //ultimo asterisco fila   
    		}    
    		for (int i=1;i<=ancho;i++)  //dibujo fila abajo
    			System.out.print("* ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       D2016_12_14_ej2Examen objeto1=new D2016_12_14_ej2Examen();
       objeto1.setLargo(4);objeto1.setAncho(8);objeto1.setRelleno('s');
       objeto1.dibujarrectangulo();
       D2016_12_14_ej2Examen objeto2=new D2016_12_14_ej2Examen(5,6,'n'); 
       objeto2.dibujarrectangulo();
	}

}
