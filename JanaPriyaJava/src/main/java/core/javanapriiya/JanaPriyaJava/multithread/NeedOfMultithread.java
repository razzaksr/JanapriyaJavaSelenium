package core.javanapriiya.JanaPriyaJava.multithread;

public class NeedOfMultithread 
{
	public static void main(String[] args) 
	{
		Warehouse ware=new Warehouse();
		//ware.listOut();
		Thread t1=new Thread(ware,"Sidhu");
		Thread t2=new Thread(ware,"Anbumani");
		Thread t3=new Thread(ware,"Sasi");
		Thread t4=new Thread(ware,"Balaji");
		t1.start();t2.start();t3.start();t4.start();
	}
}

class Warehouse extends Thread
{
	private String[] brands= {"Nike","Basics","Papejeans","Raymond","Levis","Rebok","Adidas"};
	public void listOut()
	{
		System.out.println("Following brands are available.... for "+Thread.currentThread().getName());
		for(int index=0;index<brands.length;index++)
		{
			System.out.println(brands[index]);
		}
	}
	synchronized public void run()
	{
		listOut();
	}
}