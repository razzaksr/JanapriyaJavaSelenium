package core.javanapriiya.JanaPriyaJava.array;

import java.util.Scanner;

public class Reading 
{
	public static void main(String[] args) 
	{
		int[] milages= {29,60,55,35,38,20,42,45,30};
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us position to read element: ");
		int pos=scan.nextInt();
		
		if(pos<milages.length)
		{
			System.out.println(milages[pos]);
		}
		else
		{
			System.out.println("Invalid position");
		}
		
		scan.close();
	}
}
