package core.javanapriiya.JanaPriyaJava.oop;

import java.util.Arrays;

public class MultipleNotWhy 
{
	public static void main(String[] args) 
	{
		Cosmo cos=new Cosmo();
		cos.derive();
		Arrays.sort(cos.yet);
	}
}
class Alpha
{
	int[] yet= {1,9,0,34,89,11};
}
class Beta
{
	double[] yet= {8.9,0.4,12.0,4.5,4.0,6.9};
}
class Cosmo extends Beta
{
	public void derive()
	{
		for(int index=0;index<yet.length;index++)
		{
			System.out.println(yet[index]);
		}
	}
}