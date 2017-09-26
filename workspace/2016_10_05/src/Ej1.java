public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=2,n=5;
	     int valor;
	     boolean res;
	     
	     res=true&&false;
	     System.out.println(res);
	     res=true||false;
	     System.out.println(res);
	     res=false||false;
	     System.out.println(res);
	     res=true^true;
	     System.out.println(res);
	     res=true^false;
	     System.out.println(res);
	     
	     res=((m>n)&&(m>=n));
	     System.out.println(res);
	     res=((m<n)||(m!=n));
	     System.out.println(res);
	     
	     valor=++m;
	     System.out.println("valor vale:"+valor+" m vale:"+m);
	     valor=n--;
	     System.out.println("valor vale:"+valor+" n vale:"+n);
	     valor=-m;
	     System.out.println("valor vale:"+valor+" m vale:"+m);
	     valor=~m;
	     System.out.println("valor vale:"+valor+" m vale:"+m);

	}

}