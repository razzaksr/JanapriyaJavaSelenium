package core.javanapriiya.JanaPriyaJava.handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoOfMultiple 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int[] fuel= {12,8,3,10,0,5,1,6,2};
		int kms=0, index=0;
		
		try
		{
			System.out.println("Tell us kms driven by you: ");
			kms=scan.nextInt();
			System.out.println("Tell us index to choose how many liters filled by you to drive: "+kms);
			index=scan.nextInt();
			System.out.println((kms/fuel[index])+" is milage for "+kms+" with "+fuel[index]);
		}
		catch(InputMismatchException ins)
		{
			System.out.println(ins+"\nInputs are only numbers");
			Scanner scans=new Scanner(System.in);
			System.out.println("Tell us kms driven by you: ");
			kms=scans.nextInt();
			System.out.println("Tell us index to choose how many liters filled by you to drive: "+kms);
			index=scans.nextInt();
			System.out.println((kms/fuel[index])+" is milage for "+kms+" with "+fuel[index]);
		}
		catch(ArrayIndexOutOfBoundsException aio)
		{
			System.out.println(aio+"\nIndex should be less than: "+fuel.length);
			System.out.println("Tell us index to choose how many liters filled by you to drive: "+kms);
			index=scan.nextInt();
			System.out.println((kms/fuel[index])+" is milage for "+kms+" with "+fuel[index]);
		}
		catch(ArithmeticException ar)
		{
			System.out.println(ar+"\nChoose the index within "+fuel.length+" also not 4th");
			System.out.println("Tell us index to choose how many liters filled by you to drive: "+kms);
			index=scan.nextInt();
			System.out.println((kms/fuel[index])+" is milage for "+kms+" with "+fuel[index]);
		}
		catch(Exception ex)
		{
			System.out.println(ex+" generic exception");
		}
		
		scan.close();
	}
}