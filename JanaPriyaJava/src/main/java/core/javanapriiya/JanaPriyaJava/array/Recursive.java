package core.javanapriiya.JanaPriyaJava.array;

import java.util.Arrays;

public class Recursive 
{
	public static void loop(String[] hai)
	{
		System.out.println("Traverse via Loop");
		for(int index=0;index<hai.length;index++)
		{
			System.out.println(hai[index]);
		}
	}
	
	public static void recur(String[] yet, int control)
	{
		if(control<yet.length)
		{
			System.out.println(yet[control]);
			recur(yet, ++control);
		}
		else
			return;
	}
	
	public static void main(String[] args) 
	{
		String[] brands= {"LeeCooper","Ferrari","Ford","Honda","Mercedence","Toyato"};
		System.out.println(Arrays.toString(brands));// O(1)
		Recursive.loop(brands);
		System.out.println("Iterate via recursive");
		Recursive.recur(brands, 0);
	}
}
