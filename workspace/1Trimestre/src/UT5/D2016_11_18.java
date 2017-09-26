package UT5;

public class D2016_11_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Escribe 1,2,3,4,5	
    for (int i=1;i<=5;i++)
      System.out.print(i+" ");
    System.out.println("");
    
    //Escribe 1,3,5 forma primera
    for (int i=1;i<=5;i=i+2)
        System.out.print(i+" ");
    System.out.println("");
    
    //Escribe 1,3,5 forma segunda
    for (int i=1;i<=5;i++)
      {
    	if (i%2!=0)
          System.out.print(i+" ");
      }
	}

}
