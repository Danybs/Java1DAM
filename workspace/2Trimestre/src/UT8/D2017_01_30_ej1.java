package UT8;

public class D2017_01_30_ej1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1="Pepe";
		String cad2=new String("Lionel");
		String cad3=new String(cad2);
		
		
		
		cad1="CHELO";
		System.out.println(cad1.length());
		
		
		
		 cad1="Andy";
	      System.out.println("concateno:"+cad1.concat("Rosique")+" pero cad1 siguen valiendo:"+cad1);
	      cad1=cad1.concat("Rosique");
	      System.out.println("Concatenado es:"+cad1);
		
		
		
		cad1="Emilo";
		cad2="Anaya";
			System.out.println(cad1.toString()+" "+cad2.toString());
			
			
			
		cad1="EMMA";
		cad2="MARIA";
		if(cad1.compareTo("Emma")==0){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
		if(cad1.compareTo("EMMA")==0){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
		if(cad1.compareTo("EMMA MORENO")==0){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
		if(cad2.compareTo("MARIA AMPARO")==0){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
		if(cad2.compareTo("MAREA")==0){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
		
		
		
		cad1="EMMA";
		cad2=new String("EMMA");
		if(cad1.compareTo(cad2)==0){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
				
		
		String cad4="EMMA";
		String cad5=new String("EMMA");
		if(cad4.equals(cad5)){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
		if(cad4==cad5){ 
			System.out.println("Es la misma variable");
		}
		else{
			System.out.println("Son diferentes variables");
		}
		
		
		
		cad1=" MAYKA PEREZ ";
		System.out.println(cad1.trim());
		
	
		cad1="PEDRO ruiz";
		System.out.println(cad1.toLowerCase());
		
		
		cad1="PEDRO ruiz";
		System.out.println(cad1.toUpperCase());
		
		
		cad1="JUAN SUAREZ";
		char char1='U';
		char char2='O';
		System.out.println(cad1.replace(char1, char2));
		
		
		cad1="JUAN CARLOS MORENO";
		System.out.println(cad1.substring(5, 11));
	    System.out.println(cad1.substring(12));
		
		cad1="MAYKA MORENO";
		System.out.println("MAYKA MORENO empieza por JUAN?"+cad1.startsWith("JUAN"));
		System.out.println("MAYKA MORENO empieza por MAY?"+cad1.startsWith("MAY"));
		
		cad1="MARIA AMPARO";
	      System.out.println(cad1.endsWith("paro"));  
	      System.out.println(cad1.endsWith("PARO"));
	      System.out.println(cad1.endsWith("ARIA"));  
		
		cad1="AMPARO HEREDIA";
		System.out.println(cad1.charAt(0)+" "+cad1.charAt(7));
		
		cad1="EMMA MORENO";
		System.out.println("Posición de M: "+cad1.indexOf("M")+" Posición de J: "+cad1.indexOf("J")+" Posición de MO: "+cad1.indexOf("MO")+" Posición de MI: "+cad1.indexOf("MI"));
			
		
		cad1="LORO FELIPE";
		String[] array = new String[1];
		array[0]=cad1;
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		

		
		int edad=6;
		String cadena ="";
		cadena = String.valueOf(edad);
		System.out.println(cadena);
		
		float edad2=6;
		String cadena2=""; 
		cadena2 = String.valueOf(edad2);
		System.out.println(cadena2);
		
		
	}

}
