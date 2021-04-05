package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

public class DecisionMaking 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us fare you wish to travel: ");
		int fare=scan.nextInt();
		
		if(fare>=200&&fare<=400)
		{
			System.out.println("Ordinary delux bus");
		}
		else if(fare>400&&fare<=600)
		{
			System.out.println("Ultra delux air bus");
		}
		else if(fare>600&&fare<=1000)
		{
			System.out.println("Sleeper bus");
		}
		else if(fare>1000)
		{
			System.out.println("Sleeper A/C bus");
		}
		else if(fare>=130&&fare<200)
		{
			System.out.println("Ordinary bus");
		}
		else
		{
			System.out.println("You can't travel with "+fare);
		}
		
		scan.close();
	}
}
