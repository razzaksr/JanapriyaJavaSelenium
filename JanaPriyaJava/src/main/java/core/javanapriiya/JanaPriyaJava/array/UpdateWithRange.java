package core.javanapriiya.JanaPriyaJava.array;

import java.util.Arrays;

public class UpdateWithRange 
{
	public static void main(String[] args) 
	{
		int[] people= {12,56,90,34,76,12,56,45,10,56,32,29,31,65,10,4,1};
		System.out.println(people.length);
		UpdateWithRange.update(people, 2, 10, 2);
		System.out.println(Arrays.toString(people));
	}
	public static void update(int[] population, int begin,int end,float percent)
	{
		while(begin<=end)
		{
			population[begin]-=(population[begin]*percent)/100;
			begin++;
		}
	}
}
