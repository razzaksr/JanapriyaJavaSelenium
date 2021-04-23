package core.javanapriiya.JanaPriyaJava.oop;

import java.util.Arrays;

public class MemberAsStatic 
{
	public static void main(String[] args) 
	{
		Contain.travel();
		Contain con=new Contain();
		con.list();
		Contain.Fiend.sort();
		con.list();
		Contain.Fiend fd=new Contain.Fiend();
		fd.getSome(3, 7);
	}
}

class Contain
{
	private static double[] yet= {1.2,5.6,9.0,4.7,0.1,4.0,4.5,34.6,89.4,65.3};
	public void list()
	{
		System.out.println("Array to listed out.........");
		System.out.println(Arrays.toString(yet));
	}
	static class Fiend
	{
		public static void sort()
		{
			Arrays.sort(yet);
		}
		public void getSome(int start,int end)
		{
			System.out.println("Elements between "+start+" and "+end+" will be shown soon....");
			for(;start<end;start++)
			{
				System.out.println(yet[start]);
			}
		}
	}
	public static void travel()
	{
		System.out.println("Reverse of array");
		for(int index=yet.length-1;index>0;index--)
		{
			System.out.print(yet[index]+" ");
		}
		System.out.println();
	}
}