package core.javanapriiya.JanaPriyaJava.array;

import java.util.Arrays;

public class MultiDimesional 
{
	public static void main(String[] args) 
	{
		int[][] flats= {{1,5,3,8},{4,6,9,3},{10,3,6,2}};
		System.out.println(flats.length);
		System.out.println(flats[0].length);
		
		
		/*
		 * System.out.println(Arrays.toString(flats[0]));
		 * System.out.println(Arrays.toString(flats[1]));
		 * System.out.println(Arrays.toString(flats[2]));
		 */
		
		/*
		 * for(int floor=0;floor<flats.length;floor++) {
		 * System.out.println(Arrays.toString(flats[floor])); }
		 */
		
		//O(n2)
		for(int floor=0;floor<flats.length;floor++)
		{
			for(int house=0;house<flats[floor].length;house++)
			{
				System.out.print(flats[floor][house]+" ");
			}
			System.out.println();
		}
		
	}
}

