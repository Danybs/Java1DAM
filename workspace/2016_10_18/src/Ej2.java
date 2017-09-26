
public class Ej2 {
    enum Mes {Enero,Febrero,Marzo,Abril,Mayo,Junio,
        Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int dias;
	        Mes mes=Mes.Noviembre;
	        switch (mes)
	        {
	            case Abril:
	            case Junio:
	            case Septiembre:
	            case Noviembre: dias=30;
	                            break;
	            case Febrero: dias=28;
	                           break;
	            default: dias=31;
	                     break;
	        }
	        System.out.println("El mes:"+mes+ "tiene "+dias+" dias");
	}

}
