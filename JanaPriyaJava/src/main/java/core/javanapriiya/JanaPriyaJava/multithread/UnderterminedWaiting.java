package core.javanapriiya.JanaPriyaJava.multithread;

import java.util.Random;
import java.util.Scanner;

//interthread communications

public class UnderterminedWaiting 
{
	public static void main(String[] args) 
	{
		Theatres the=new Theatres();
		Markets mark=new Markets(the);
		Thread t1=new Thread(the,"Sidhu");
		Thread t2=new Thread(mark,"Anbumani");
		t1.start();t2.start();
	}
}
class Theatres implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int amt;
	@Override
	public void run() 
	{	
		System.out.println(Thread.currentThread().getName()+" has come to IMAX");
		synchronized (scan) 
		{
			System.out.println("Enter the amount: "+Thread.currentThread().getName());
			amt=scan.nextInt();
			if(amt<240)
			{
				try {
					System.out.println("Has to wait");
					scan.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" can watch the movie");
		}
	}
}

class Markets implements Runnable
{
	Theatres thes;
	public Markets(Theatres obj)
	{
		thes=obj;
	}
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
		synchronized (thes.scan) 
		{
			if(thes.amt<240)
			{
				thes.amt+=300;
				System.out.println(Thread.currentThread().getName()+" helped with ticket price");
				thes.scan.notify();
			}
		}
	}	
}