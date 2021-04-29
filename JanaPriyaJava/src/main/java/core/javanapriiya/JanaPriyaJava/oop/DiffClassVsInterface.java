package core.javanapriiya.JanaPriyaJava.oop;

import java.util.Arrays;

public class DiffClassVsInterface extends Delta implements Eclairs
{
	public static void main(String[] args) 
	{
		//Eclairs ecl=new Eclairs();
		DiffClassVsInterface diff=new DiffClassVsInterface();
		System.out.println(Arrays.toString(diff.yet));
		diff.findMin();
		System.out.println(Arrays.toString(diff.check));
		diff.findMax();
		diff.findMid(yet);
		diff.findMid(diff.check);
		
		/*
		 * Eclairs ec=new DiffClassVsInterface();
		 * System.out.println(Arrays.toString(ec.yet)); ec.findMin();
		 */
	}

	@Override
	public void findMin() 
	{
		int mYmin=yet[0];
		// TODO Auto-generated method stub
		for(int index=0;index<yet.length;index++) 
		{
			if(mYmin>yet[index])
			{
				mYmin=yet[index];
			}
		}
		System.out.println("Minimum value in array: "+mYmin);
	}

	@Override
	public void findMid(int[] array)
	{
		int mid=(0+array.length-1)/2;
		System.out.println("Mid index is: "+mid);
		System.out.println("Mid index value is: "+array[mid]);
	}
}

class Delta
{
	int[] check= {12,45,67,89};
	int max;
	public void findMax()// non abstract method/with definition => {} 
	{
		max=check[0];
		for(int index=0;index<check.length;index++)
		{
			if(max<check[index])
			{
				max=check[index];
			}
		}
		System.out.println("Maximum elements in array: "+max);
	}
}

interface Donut
{
	public void findMid(int[] array);
}

interface Eclairs extends Donut
{
	int[] yet= {56,78,6,79,34,12,4,90,29};
	int min=0;
	public void findMin();
}