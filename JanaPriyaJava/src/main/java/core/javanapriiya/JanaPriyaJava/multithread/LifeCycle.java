package core.javanapriiya.JanaPriyaJava.multithread;

import java.util.Scanner;

public class LifeCycle 
{
	public static void main(String[] args) 
	{
		Machine mac=new Machine();
		Thread t1=new Thread(mac,"Selenium");
		Thread t2=new Thread(mac,"REact");
		Thread t3=new Thread(mac,"Spring");
		t1.start();t2.start();t3.start();
	}
}

class Machine implements Runnable
{
	int macBal=20000;
	Scanner scan=new Scanner(System.in);
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" visted to ATM");
		synchronized (scan) 
		{
			System.out.println("Tell us amount to withdraw "+Thread.currentThread().getName());
			int amt=scan.nextInt();
			if(amt>4000)
				Thread.currentThread().stop();
			else if(amt<2000&&amt>=500)
				try {
					System.out.println(Thread.currentThread().getName()+" has to wait 10s");
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			macBal-=amt;
			System.out.println(amt+" requested has withdrawn successfully");
		}
	}
}