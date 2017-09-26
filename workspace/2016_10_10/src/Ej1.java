public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4,h;
	     byte bdato;
	     boolean res=true;
	     
	     //conversion tipo
	     bdato=(byte)m;
	     
	     //formulas con precedencia operadores
	     int a=5;
	     a=5*a+3;
	     System.out.println(a);
	     a=5*(a+3);
	     System.out.println(a);
	     a=1+3*4;
	     System.out.println(a);
	     a=(1+3)*4;
	     System.out.println(a);
	     a=1+3-4;
	     System.out.println(a);
	     h=16;
	     a=1+(h=3);
	     System.out.println(a);
	     
	     res=true&&false||true;
	     System.out.println(res);
	     res=true&&(false||true);
	     System.out.println(res);
	     res=true&&a<h||true;
	     System.out.println(res);
	     res=false||true&&a<h;
	     System.out.println(res);
	     res=true||a<h&&false;
	     System.out.println(res);
	}

}
