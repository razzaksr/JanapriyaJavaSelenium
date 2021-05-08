package core.javanapriiya.JanaPriyaJava.multithread;

import java.util.Random;
import java.util.Scanner;

public class MultiResource 
{
	public static void main(String[] args) 
	{
		Market mark=new Market();
		Theatre the=new Theatre(); 
		Thread t1=new Thread(mark,"Sidhu");
		Thread t2=new Thread(the,"Anbumani");
		Thread t3=new Thread(mark,"Priyanka");
		Thread t4=new Thread(the,"Kumar");
		t1.start();t2.start();t3.start();t4.start();
	}
}

class Theatre implements Runnable
{
	Scanner scan=new Scanner(System.in);
	@Override
	public void run() 
	{	
		System.out.println(Thread.currentThread().getName()+" has come to IMAX");
		synchronized (scan) 
		{
			System.out.println("Enter the amount: "+Thread.currentThread().getName());
			int amt=scan.nextInt();
			if(amt>=240)
			{
				System.out.println(Thread.currentThread().getName()+" can watch the movie");
			}
			else {
				System.out.println(Thread.currentThread().getName()+" has insufficient amount to watch the movie");
			}
		}
	}
}

class Market implements Runnable
{
	int[] cost= {1000,500,1200,780,340,199,1000,400,1390,348,410,760,590,490,12};
	Random ran=new Random();
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" has come to purchase");
		int bill=0;
		String term="";
		for(int times=1;times<=5;times++)
		{
			int index=ran.nextInt(cost.length);
			term+=cost[index]+" ";
			bill+=cost[index];
		}
		System.out.println(Thread.currentThread().getName()+" has purchased with bill amount: "+bill+" for "+term);
	}	
}