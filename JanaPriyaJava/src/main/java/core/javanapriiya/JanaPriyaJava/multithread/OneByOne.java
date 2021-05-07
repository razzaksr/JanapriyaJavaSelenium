package core.javanapriiya.JanaPriyaJava.multithread;

import java.util.Scanner;

public class OneByOne 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Warehouse ware=new Warehouse();
		//ware.listOut();
		Thread t1=new Thread(ware,"Sidhu");
		Thread t2=new Thread(ware,"Anbumani");
		Thread t3=new Thread(ware,"Sasi");
		Thread t4=new Thread(ware,"Balaji");
		t1.start();t2.start();t3.start();t4.start();
		
		
		
		Terminology term = new Terminology();
		Thread t5=new Thread(term,"Karthik");
		Thread t6=new Thread(term,"Pradeep");
		Thread t7=new Thread(term,"Chandru");
		Thread t8=new Thread(term,"Arunachalam");
		t5.start();t5.join(); t6.start();t6.join();t7.start();t7.join(); t8.start();
	}
}

class Terminology implements Runnable
{
	Scanner scan=new Scanner(System.in);
	@Override
	public void run() 
	{
		System.out.println("Please welcome.... "+Thread.currentThread().getName());
		System.out.println("Enter the skillset: ");
		String skill=scan.next();
		if(skill.equalsIgnoreCase("java")||skill.equalsIgnoreCase("selenium")||skill.equalsIgnoreCase("php"))
		{
			System.out.println(Thread.currentThread().getName()+" you can go for UK onsite project");
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" Be as a offshore developer");
		}
	}
}