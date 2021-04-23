package core.javanapriiya.JanaPriyaJava.oop;

import java.util.Arrays;

public class LocalScope 
{
	public static void main(String[] args) 
	{
		Wind wind=new Wind();
		wind.listAll();
	}
}

class Wind
{
	String terminal="Zealous Academy of Career Training";
	public void listAll()
	{
		System.out.println(terminal);
		class Jagging
		{
			char[][] yet=new char[5][];
			public void toBeJagged()
			{
				int pos=0;
				for(int row=0;row<yet.length;row++)
				{
					if(row==0)
						yet[row]=new char[8];
					else if(row==1)
						yet[row]=new char[4];
					else if(row==2)
						yet[row]=new char[10];
					else if(row==3)
						yet[row]=new char[2];
					else if(row==4)
						yet[row]=new char[10];
					for(int col=0;col<yet[row].length&&pos<terminal.length();col++,pos++)
					{
						yet[row][col]=terminal.charAt(pos);
					}
				}
			}
			public void listJagged()
			{
				for(char[] row:yet)
				{
					//System.out.println(Arrays.toString(row));
					for(char col:row)
					{
						System.out.print((int)col+" ");
					}
					System.out.println();
				}
			}
		}
		Jagging jag=new Jagging();
		jag.toBeJagged();
		jag.listJagged();
	}
}