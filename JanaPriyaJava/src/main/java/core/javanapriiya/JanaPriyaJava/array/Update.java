package core.javanapriiya.JanaPriyaJava.array;

import java.util.Scanner;

public class Update 
{
	public static void main(String[] args) 
	{
		double[] oilCost= {93.1,87.2,59.4,42.1,150.10};
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us price from which wish to update: ");
		double user=scan.nextDouble();
		System.out.println("Tell us hike percentage: ");
		double percent=scan.nextDouble();
		
		for(int index=0;index<oilCost.length;index++)
		{
			if(oilCost[index]>=user)
			{
				oilCost[index]+=(oilCost[index]*percent)/100;
			}
			System.out.println(oilCost[index]);
		}
		
		scan.close();
	}
}
