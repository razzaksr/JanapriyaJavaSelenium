package core.javanapriiya.JanaPriyaJava.array;

public class FindMax
{
	public static void max(int[][] pop)
	{
		int maxi=Integer.MIN_VALUE;
		int floor=0,flat=0;
		/*
		 * for(int[] row:pop) { for(int tmp:row) { if(tmp>maxi) maxi=tmp; } }
		 * System.out.println("Maximum person "+maxi);
		 */
		for(int row=0;row<pop.length;row++)
		{
			for(int col=0;col<pop[row].length;col++)
			{
				if(pop[row][col]>maxi)
					{
						maxi=pop[row][col];floor=row;flat=col;
					}
			}
		}
		System.out.println("Maximum population is: "+maxi+" residing @ "+floor+" floor "+flat+" flat");
	}
	public static void main(String[] args) 
	{
		int[][] flats= {{1,5,3,8},{4,6,9,3},{10,3,6,2}};
		FindMax.max(flats);
	}
}
