package core.javanapriiya.JanaPriyaJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class Finding 
{
	public static void sort(String[][] received)
	{
		for(int row=0;row<received.length;row++)
		{
			Arrays.sort(received[row]);
		}
	}
	public static void list(String[][] who)
	{
		System.out.println("New array");
		for(int row=0;row<who.length;row++)
		{
			System.out.println(Arrays.toString(who[row]));
		}
	}

	/*
	 * public static int[] binary(String[] names,int start,int end,String desired) {
	 * if(start<end) { int mid=(start+end)/2; if (names[mid].compareTo(desired)==0)
	 * return mid; else if(names[mid].compareTo(desired)<0) return
	 * binary(names,mid+1,end,desired); else if(names[mid].compareTo(desired)>0)
	 * return binary(names,start,mid,desired); else return -1; }else return -1; }
	 */
	public static int[] search(String[][] got, String desired)
	{
		int[] temp= {-1,-1};
		for(int row=0;row<got.length;row++)
		{
			for(int col=0;col<got[row].length;col++)
			{
				if(got[row][col].compareTo(desired)==0)
				{
					temp[0]=row;temp[1]=col;
					return temp;
				}	
			}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		// multidimentional
		String[][] amazon= {{"ramaxel","samsung"},{"sony","simmetrix"},{"transcend","sandisk"},{"hitachi","toshiba"}};
		//jagged
		String[][] flipkart= {{"realme","nokia","redmi"},{"honor","samsung"},{"infix","poco","vivo","oppo","moto"}};
		//Finding.list(amazon);
		//Finding.list(flipkart);
		Finding.sort(amazon);
		Finding.sort(flipkart);
		System.out.println("After sort");
		Finding.list(amazon);
		Finding.list(flipkart);
		// search
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us what you wish to search: ");
		String mine=scan.nextLine();
		int[] poss=Finding.search(flipkart,mine);
		System.out.println(mine+" found @ "+Arrays.toString(poss));
		scan.close();
	}
}
