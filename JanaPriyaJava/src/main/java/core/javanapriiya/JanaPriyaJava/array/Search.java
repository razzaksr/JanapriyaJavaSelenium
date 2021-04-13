package core.javanapriiya.JanaPriyaJava.array;

import java.util.Scanner;

public class Search 
{
	public static void main(String[] args) 
	{
		String[] apps= {"Free Fire","FAUG","Call of Duty","Medal of Honor","VLC","Facebook","LinkedIn","tnpds"};
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us data to search in array: ");
		String user=scan.nextLine();
		
		for(int index=0;index<apps.length;index++)
		{
			if(user.equals(apps[index]))
			{
				System.out.println(user+" availbale @ "+index);
				break;
			}
		}
		
		scan.close();
	}
}
