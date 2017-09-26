package UT5;

import java.util.Random;

public class D2016_12_07_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Random num=new Random();
		int random=num.nextInt(10);
		do{
			
		int b=1;
		int factorial=random;
		while (factorial!=0){
			b=b*factorial;	
			factorial=factorial-1;
		}
		if (random%2==0)
            System.out.println("El factorial de:"+random+" es:"+b);
          random=num.nextInt(10);
          
		}while (random%2==0);	
		
	}
}


