package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

/*
 * Type Conversion:
 * a. type casting: between data types; syntax: destination =(type) source
 */

public class Casting 
{
	public static void main(String[] args) 
	{
		char say='H';
		//System.out.println(say+" "+(int)say);
		int digit=(int)say;
		System.out.println(say+" "+digit);
		
		// arithmetic operator
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us annual salary: ");
		double annual=scan.nextDouble();
		int monthly=(int)(annual/12);		
		System.out.println(monthly*100000);
		scan.close();
	}
}
