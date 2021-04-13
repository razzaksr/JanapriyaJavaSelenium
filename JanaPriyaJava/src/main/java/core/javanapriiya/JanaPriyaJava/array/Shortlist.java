package core.javanapriiya.JanaPriyaJava.array;

import java.util.Scanner;

public class Shortlist 
{
	public static void main(String[] args) 
	{
		float[] cibils= {768.4F,910.1F,580.5F,120.4F,620.4F,810.6F,590.4F};
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us cibil to avail PL");
		float eligible=scan.nextFloat();
		
		for(float tmp:cibils)
		{
			if(tmp>=eligible)
			{
				System.out.println(tmp);
			}
		}
		
		scan.close();
	}
}
