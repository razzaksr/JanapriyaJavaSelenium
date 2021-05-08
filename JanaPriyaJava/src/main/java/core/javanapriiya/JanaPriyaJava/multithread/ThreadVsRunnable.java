package core.javanapriiya.JanaPriyaJava.multithread;

public class ThreadVsRunnable 
{
	public static void main(String[] args) 
	{
		Package pack=new Package();
		Thread t1=new Thread(pack,"Donut");//14, 13
		Thread t2=new Thread(pack,"Froyo");//15, 14
		Thread t3=new Thread(pack,"Nogut");//16, 15
		t1.start();t2.start();t3.start();
	}
}

class Yet
{
	String[] team= {"Node","Express","Mongo","React"};
}

class Package extends Yet implements Runnable
{
	public void hai(Object[] yet)
	{
		for(int index=0;index<yet.length;index++)
		{
			System.out.println(yet[index]);
		}
	}
	synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
		hai(team);
	}
}