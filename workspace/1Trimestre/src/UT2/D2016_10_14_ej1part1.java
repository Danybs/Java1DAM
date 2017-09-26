package UT2;
import java.io.*;
public class D2016_10_14_ej1part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try 
	
	{
	System.out.println("Dime un NIF con letra: ");
	InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader buff=new BufferedReader(isr);
		String NIF=buff.readLine();
		System.out.println("El NIF es : " +NIF);
		}
	
	catch (Exception e)
	{
	}
	}

}