package core.javanapriiya.JanaPriyaJava.handle;

import java.util.Scanner;

public class DemoCustom 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String user="",pass="",conpass="";
		try
		{
			System.out.println("Tell us Username: ");
			user=scan.nextLine();
			System.out.println("Tell us password: ");
			pass=scan.next();
			System.out.println("Confirm password: ");
			conpass=scan.next();
			if(pass.equals(conpass))
			{
				System.out.println(user+" has created successfully");
			}
			else
			{
				throw new JanapriyaException();
			}
		}
		catch(JanapriyaException jana)
		{
			System.out.println(jana);
			System.out.println("Tell us password: ");
			pass=scan.next();
			System.out.println("Confirm password: ");
			conpass=scan.next();
			if(pass.equals(conpass))
			{
				System.out.println(user+" has created successfully");
			}
			else {System.out.println("Can't create account right now");}
		}
	}
}
