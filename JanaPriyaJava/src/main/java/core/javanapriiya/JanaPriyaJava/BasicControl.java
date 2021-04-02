package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

public class BasicControl 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		int atm=20000;
		System.out.println("Tell us amount of withdraw: ");
		int amount=scan.nextInt();
		if(amount<=atm)
		{
			if((amount%200==0)||(amount%2000==0))
			{
				atm-=amount;
				System.out.println(amount+" requested has withdrawn");
			}
			else
			{
				System.out.println(amount+" not match with available denoms");
			}
		}
		else
		{
			System.out.println("Unable dispense by machine");
		}
		
		scan.close();
	}
}
