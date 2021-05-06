package core.javanapriiya.JanaPriyaJava.handle;

import java.util.Scanner;

public class Chances 
{
	int[] fuel= {12,8,3,10,7,5,1,6,2};
	Scanner scan=new Scanner(System.in);
	int times;
	public void findOut(int kms)
	{
		times++;
		try
		{
			System.out.println("Tell us index: ");
			int index=scan.nextInt();
			System.out.println((kms/fuel[index])+" is milage for"+kms+" with fuel of "+fuel[index]);
		}
		catch(ArrayIndexOutOfBoundsException aio)
		{
			System.out.println(aio);
			if(times<3)
			{
				findOut(kms);
			}
			else {
				System.out.println("MAximum attempt obtained");
			}
		}
	}
	public static void main(String[] args) 
	{
		Chances ch=new Chances();
		ch.findOut(345);
	}
}
