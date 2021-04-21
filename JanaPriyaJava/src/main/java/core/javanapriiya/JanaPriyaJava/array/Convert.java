package core.javanapriiya.JanaPriyaJava.array;

public class Convert 
{
	public static void main(String[] args) 
	{
		int[][] destination=new int[3][2];
		int[] values= {5,8,12,90,45,4};
		int pos=0;
		//copy
		for(int row=0;row<destination.length;row++)
		{
			for(int col=0;col<destination[row].length&&pos<values.length;col++,pos++)
			{
				destination[row][col]=values[pos];
			}
		}
		
		//list
		for(int[] row:destination)
		{
			for(int tmp:row)
			{
				System.out.print(tmp+" ");
			}
			System.out.println();
		}
	}
}
