package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

public class IVR 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-------------------------Indian Gas Refilling Portal-----------------");
		System.out.println("1.Book refil\n2.Cancel Refil\n3.Status of refil\n4.change ivr language\n.exit");
		int option=scan.nextInt();
		
		switch(option)
		{
		case 1:System.out.println("Press 1 again inorder to confirm booking");
				int con=scan.nextInt();
				if(con==1) 
				{
					System.out.println("REfil Booked and delievered in two days");
				}
				else 
				{
					System.out.println("Refil booking process is aborted");
				}
				break;
		
		case 2:System.out.println("Cancellation on previous refil booking approved");
		break;
		case 3:System.out.println("Refil is near by your retailer");break;
		case 4:System.out.println("Select IVR from 1 to 5 to change language: ");
				int change=scan.nextInt();
				switch(change)
				{
				case 1: System.out.println("English selected");break;
				case 2: System.out.println("Tamil selected");break;
				case 3: System.out.println("Kannada selected");break;
				case 4: System.out.println("Malayalam selected");break;
				case 5: System.out.println("Telugu selected");break;
				default:System.out.println("Not valid option");
				}
				break;
		case 5: System.out.println("Thanks for calling IVR");break;
		default:System.out.println("Invalid option");
		}
		scan.close();
	}
}
