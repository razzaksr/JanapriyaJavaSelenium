package core.javanapriiya.JanaPriyaJava.array;

import java.util.Arrays;

public class Sortings 
{
	public static void selection(double[] who)
	{
		for(int select=0;select<who.length;select++)
		{
			for(int com=select+1;com<who.length;com++)
			{
				if(who[select]<who[com])
				{
					who[select]*=who[com];
					who[com]=who[select]/who[com];
					who[select]/=who[com];
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		double[] ac= {5.0,0.8,2.5,1.5,3.5,10.1,1.5};
		System.out.println(Arrays.toString(ac));
		//Arrays.sort(ac);>> O(1)
		
		Sortings.selection(ac);// O(n2)
		
		System.out.println(Arrays.toString(ac));
	}
}
