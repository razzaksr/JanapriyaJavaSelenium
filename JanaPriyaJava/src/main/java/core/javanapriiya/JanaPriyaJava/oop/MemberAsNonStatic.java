package core.javanapriiya.JanaPriyaJava.oop;

import java.util.Arrays;

import core.javanapriiya.JanaPriyaJava.oop.Crown.Convertor;

public class MemberAsNonStatic
{
	public static void main(String[] args) 
	{
		Crown cn=new Crown();
		cn.list();
		Convertor con=cn.new Convertor();
		con.to2d();
		con.list_2D();
	}
}

class Crown
{
	private String[] geeks= {"Mani","Balaji","Mahesh","Murali","Asai","Sridhar","Arun","Titus","Mohamed","Vijya","Karthiya","Sasi"};
	public void list()
	{
		System.out.println(Arrays.toString(geeks));
	}
	class Convertor
	{
		private String[][] _2d=new String[4][3];
		public void to2d()
		{
			int pos=0;
			for(int row=0;row<_2d.length;row++)
			{
				for(int col=0;col<_2d[row].length&&pos<geeks.length;col++,pos++)
				{
					_2d[row][col]=geeks[pos];
				}
			}
		}
		public void list_2D()
		{
			for(String[] row:_2d)
			{
				System.out.println(Arrays.toString(row));
			}
		}
	}
}