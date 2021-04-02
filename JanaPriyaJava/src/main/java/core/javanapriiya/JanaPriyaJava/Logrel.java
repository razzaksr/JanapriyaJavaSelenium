package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

/*
 * Relational Operator: > >= < <= == !=     : boolean:true/false
 * Logical Operator: && ||   				: combine relational operators: boolean
 */

public class Logrel 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("TEll us your annual salary: ");
		double annual=scan.nextDouble();
		System.out.println("Eligibility of PL 1 lack: "+(annual>=3.1));
		System.out.println("Eligibility of Credit card upto 1 lack limit: "+(annual>5.1));
		System.out.println("Tell us your property value: ");
		double property=scan.nextDouble();
		System.out.println("Are you able to get Home loan 5Lacks "+((annual>=7.2)||(property>=10.5)));
		System.out.println("How many years of ITR you have: ");
		int returns=scan.nextInt();
		System.out.println("Are you able to get business loan 8Lacks "+((returns>=6)&&(property>=25.9)));
		System.out.println(annual+" "+property+" "+returns);
		scan.close();
	}
}