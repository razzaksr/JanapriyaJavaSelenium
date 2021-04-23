package core.javanapriiya.JanaPriyaJava.oop;

import java.util.Arrays;

public class Anonymous 
{
	public static void main(String[] args) 
	{
		/*
		 * Warehouse ware=new Warehouse(); ware.list(); ware.listAsChar();
		 */
		new Warehouse().listAsChar();// anonymous
		//new Warehouse().list();
	}
}

class Warehouse
{
	private int[] mark= {56,78,90,122,34,67,87,54,78,92,45,69,112,120,101,100,72};
	public void list()
	{
		System.out.println(Arrays.toString(mark));
	}
	public void listAsChar()
	{
		for(int index=0;index<mark.length;index++)
		{
			System.out.print((char)mark[index]+" ");
		}
		System.out.println();
	}
}