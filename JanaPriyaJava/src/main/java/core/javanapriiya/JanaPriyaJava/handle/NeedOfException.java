package core.javanapriiya.JanaPriyaJava.handle;

import java.util.Scanner;

public class NeedOfException 
{
	public static void main(String[] args) //throws StringIndexOutOfBoundsException
	{
		String alpha="Sidhukumar";
		Scanner scan = new Scanner(System.in);
		System.out.println("Tell us index to extract a character: ");
		int index=scan.nextInt();
		try
		{
			System.out.println(alpha.charAt(index));
			System.out.println("Hello there!");
		}
		catch(StringIndexOutOfBoundsException obj)
		{
			System.out.println(obj);
			System.out.println("index should be within "+alpha.length());
			index=scan.nextInt();
			System.out.println(alpha.charAt(index));
			System.out.println("Hello there!");
		}
		finally
		{
			System.out.println("Extraction done");
		}
	}
}
