package core.javanapriiya.JanaPriyaJava.handle;

import java.util.Scanner;

public class DemoForward 
{
	int[] fuel= {12,8,3,10,7,5,1,6,2};
	Scanner scan=new Scanner(System.in);
	public void findOut(int kms)
	{
		try
		{
			System.out.println("Tell us index: ");
			int index=scan.nextInt();
			System.out.println((kms/fuel[index])+" is milage for"+kms+" with fuel of "+fuel[index]);
		}
		catch(ArrayIndexOutOfBoundsException aio)
		{
			System.out.println(aio+"\nCaught in method");
			throw aio;
		}
	}
	public static void main(String[] args) 
	{
		DemoForward ch=new DemoForward();
		try
		{
			ch.findOut(345);
		}
		catch(ArrayIndexOutOfBoundsException er)
		{
			System.out.println(er+"\nCaught in main method");
			ch.findOut(345);
		}
	}
}
