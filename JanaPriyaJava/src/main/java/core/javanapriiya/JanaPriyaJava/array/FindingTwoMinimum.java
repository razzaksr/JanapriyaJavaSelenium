package core.javanapriiya.JanaPriyaJava.array;

public class FindingTwoMinimum 
{
	public static void findFirstTwo(double[][] kind)
	{
		double fMin=Double.MAX_VALUE, sMin=Double.MAX_VALUE;
		int fminrow=0,fmincol=0,sminrow=0,smincol=0;
		for(int row=0;row<kind.length;row++)
		{
			for(int col=0;col<kind[row].length;col++)
			{
				if(fMin>kind[row][col])
				{
					sMin=fMin;
					sminrow=fminrow;smincol=fmincol;
					fMin=kind[row][col];
					fminrow=row;fmincol=col;
				}
				if(sMin>kind[row][col]&&kind[row][col]!=fMin)
				{
					sMin=kind[row][col];
					sminrow=row;smincol=col;
				}
			}
		}
		System.out.println(fMin+" is first minimum @ "+fminrow+" "+fmincol);
		System.out.println(sMin+" is second minimum @ "+sminrow+" "+smincol);
	}
	public static void main(String[] args) 
	{
		double[][] exp= {{2.1,8.9,3.5,10.4,1.1},{3.1,0.1,9.1,12.7,4},{15.8,22,10.5,1.2,7.5},{9.1,4.5,2.2,0.0,4.5}};
		FindingTwoMinimum.findFirstTwo(exp);
	}
}