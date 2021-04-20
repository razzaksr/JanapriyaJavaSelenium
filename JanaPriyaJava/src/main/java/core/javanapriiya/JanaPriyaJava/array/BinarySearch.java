package core.javanapriiya.JanaPriyaJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	public static void bubble(String[] yet)
	{
		String third="";
		for(int times=0;times<yet.length-1;times++)
		{
			for(int pair=0;pair<yet.length-times-1;pair++)
			{
				if(yet[pair].compareTo(yet[pair+1])>0)
				{
					third=yet[pair];
					yet[pair]=yet[pair+1];
					yet[pair+1]=third;
				}
			}
		}
	}
	
	public static int search(String[] names,int start,int end,String desired)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			if (names[mid].compareTo(desired)==0)
				return mid;
			else if(names[mid].compareTo(desired)<0)
				return search(names,mid+1,end,desired);
			else if(names[mid].compareTo(desired)>0)
				return search(names,start,mid,desired);
			else
				return -1;
		}else
			return -1;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String[] wrestlers= {"Mark calaway","Randy Orton","Adam Copland","Antonio Cesoro","Bray Wayyt"};
		System.out.println(Arrays.toString(wrestlers));
		BinarySearch.bubble(wrestlers);
		System.out.println(Arrays.toString(wrestlers));
		String want=scan.nextLine();
		int pos=BinarySearch.search(wrestlers, 0, wrestlers.length-1, want);// O(logn)
		System.out.println(want+" is @ "+pos);
		scan.close();
	}
}
