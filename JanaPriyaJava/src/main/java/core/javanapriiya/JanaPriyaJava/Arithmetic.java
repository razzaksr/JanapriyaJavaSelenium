package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

public class Arithmetic 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("TCS Offers 8 percent hike for employees");
		System.out.println("TEll us your salary: ");
		double salary=scan.nextDouble();
		//salary=salary+(salary*8.1)/100;
		salary=salary+(salary*0.081);
		System.out.println("New Salary "+salary);
		scan.close();
	}
}
