package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

public class Sports 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us bowling speed player: ");
		double speed=scan.nextDouble();
		
		if(speed>=150.1)
		{
			System.out.println("The player is a fast bowler");
		}
		else if(speed>=130.5&&speed<150.1)
		{
			System.out.println("The player is a fast medium pace");
		}
		else if(speed>=110.5&&speed<130.1)
		{
			System.out.println("The player is a medium pace");
		}
		else
		{
			System.out.println("The player is spinner");
		}
		
		scan.close();
	}
}