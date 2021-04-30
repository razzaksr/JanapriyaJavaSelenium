package core.javanapriiya.JanaPriyaJava;

import java.util.Arrays;

public class ModWare 
{
	private byte[] hai= {89,120,76,91,78,56,99,112,108,45};
	public String toString()
	{
		return Arrays.toString(hai);
	}
	protected void findMinTwo()
	{
		byte min1=Byte.MAX_VALUE,min2=Byte.MAX_VALUE;
		for(int index=0;index<hai.length;index++)
		{
			if(hai[index]<min1)
			{
				min2=min1;
				min1=hai[index];
			}
			else if(hai[index]<min2&&hai[index]!=min1)
			{
				min2=hai[index];
			}
		}
		System.out.println("Find two min is "+min1+" and "+min2);
	}
	void bubble()
	{
		for(int times=0;times<hai.length-1;times++)
		{
			for(int index=0;index<hai.length-times-1;index++)
			{
				if(hai[index]>hai[index+1])
				{
					hai[index]^=hai[index+1];
					hai[index+1]^=hai[index];
					hai[index]^=hai[index+1];
				}
			}
		}
	}
	public final void reverse()
	{
		for(int index=hai.length-1;index>=0;index--)
		{
			System.out.print(hai[index]+" ");
		}
		System.out.println();
	}
}
